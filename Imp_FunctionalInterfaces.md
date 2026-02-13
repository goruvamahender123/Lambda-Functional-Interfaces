
---

# 🔥 What is a Functional Interface? (Quick Reminder)

👉 Interface with **only ONE abstract method**

Why?

Because lambda implements that one method.

Example:

```java
@FunctionalInterface
interface Test {
    void run();
}
```

---

Now let’s learn the most used ones.

---

# ✅ 1️⃣ Function<T, R>

## ✔ Simple Meaning

Takes a value → returns another value.

Used for **conversion / transformation**.

---

## ✔ Method

```java
R apply(T t);
```

---

## ✔ Takes

1 input

## ✔ Returns

1 output (can be different type)

---

## ✔ Most Used With

⭐ `stream().map()`
⭐ DTO conversion
⭐ transforming data

---

## ✔ Example

```java
Function<String, Integer> f = s -> s.length();
System.out.println(f.apply("Java"));
```

---

### Stream Example

```java
list.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList());
```

`map()` takes Function.

---

## 🧠 Memory Trick

Function = machine
Input → Output

---

# ✅ 2️⃣ Predicate<T>

## ✔ Simple Meaning

Checks a condition.

Returns TRUE or FALSE.

---

## ✔ Method

```java
boolean test(T t);
```

---

## ✔ Takes

1 input

## ✔ Returns

boolean

---

## ✔ Most Used With

⭐ `filter()`
⭐ `removeIf()`
⭐ `anyMatch()`
⭐ validations

---

## ✔ Example

```java
Predicate<Integer> even = n -> n % 2 == 0;
System.out.println(even.test(4));
```

---

### Stream Example

```java
list.stream()
    .filter(n -> n > 10)
    .forEach(System.out::println);
```

---

## 🧠 Memory Trick

Predicate = Predict / Check

---

# ✅ 3️⃣ BiFunction<T, U, R>

## ✔ Simple Meaning

Takes 2 inputs → returns value.

---

## ✔ Method

```java
R apply(T t, U u);
```

---

## ✔ Takes

2 inputs

## ✔ Returns

1 output

---

## ✔ Most Used With

⭐ combining values
⭐ calculations
⭐ merging data

---

## ✔ Example

```java
BiFunction<Integer, Integer, Integer> add =
        (a, b) -> a + b;

System.out.println(add.apply(2,3));
```

---

## 🧠 Memory Trick

Bi = two inputs

---

# ✅ 4️⃣ Consumer<T>

## ✔ Simple Meaning

Takes value → returns nothing.

Used when you want to **use or print data**.

---

## ✔ Method

```java
void accept(T t);
```

---

## ✔ Takes

1 input

## ✔ Returns

nothing

---

## ✔ Most Used With

⭐ `forEach()`
⭐ logging
⭐ printing
⭐ updating values

---

## ✔ Example

```java
Consumer<String> print = s -> System.out.println(s);
print.accept("Hello");
```

---

### Stream Example

```java
list.forEach(System.out::println);
```

---

## 🧠 Memory Trick

Consumer consumes → no return

---

# ✅ 5️⃣ Supplier<T>

## ✔ Simple Meaning

Takes nothing → returns value.

Used when you want to **provide value**.

---

## ✔ Method

```java
T get();
```

---

## ✔ Takes

nothing

## ✔ Returns

value

---

## ✔ Most Used With

⭐ `Optional.orElseGet()`
⭐ object creation
⭐ lazy loading
⭐ random values

---

## ✔ Example

```java
Supplier<Double> s = () -> Math.random();
System.out.println(s.get());
```

---

### Optional Example

```java
user.orElseGet(User::new);
```

---

## 🧠 Memory Trick

Supplier supplies → gives value

---

# ✅ 6️⃣ BiConsumer<T,U>

## ✔ Simple Meaning

Takes 2 values → returns nothing.

---

## ✔ Method

```java
void accept(T t, U u);
```

---

## ✔ Most Used With

⭐ Map.forEach()
⭐ printing key & value

---

## ✔ Example

```java
map.forEach((k,v) -> System.out.println(k + ":" + v));
```

---

## 🧠 Memory Trick

BiConsumer → consumes two inputs

---

# ✅ 7️⃣ BiPredicate<T,U>

## ✔ Simple Meaning

Takes 2 values → returns boolean.

---

## ✔ Method

```java
boolean test(T t, U u);
```

---

## ✔ Example

```java
BiPredicate<String, String> check =
        (a,b) -> a.equals(b);

System.out.println(check.test("hi","hi"));
```

---

## 🧠 Memory Trick

BiPredicate = check 2 values

---

# ✅ 8️⃣ UnaryOperator<T>

## ✔ Simple Meaning

Takes one value → returns SAME type.

T → T

---

## ✔ Method

```java
T apply(T t);
```

(extends Function)

---

## ✔ Most Used With

⭐ map() when same type
⭐ modifying values

---

## ✔ Example

```java
UnaryOperator<Integer> square = n -> n * n;
```

---

## 🧠 Memory Trick

Unary = one
same type return

---

# ✅ 9️⃣ BinaryOperator<T>

## ✔ Simple Meaning

Takes two values → returns SAME type.

T, T → T

---

## ✔ Method

```java
T apply(T a, T b);
```

---

## ✔ Most Used With

⭐ `reduce()`
⭐ sum, max, combine

---

## ✔ Example

```java
list.stream()
    .reduce((a,b) -> a + b);
```

---

## 🧠 Memory Trick

Binary = combine two

---

# ✅ 🔟 Comparator<T> (VERY IMPORTANT)

## ✔ Simple Meaning

Used for sorting objects.

---

## ✔ Method

```java
int compare(T o1, T o2);
```

---

## ✔ Returns

negative → first comes first
positive → second comes first
0 → equal

---

## ✔ Most Used With

⭐ sorting objects
⭐ Collections.sort()
⭐ stream sorted()

---

## ✔ Example

```java
list.sort((a,b) -> a - b);
```

---

### Using method reference

```java
list.sort(String::compareTo);
```

---

## 🧠 Memory Trick

Comparator = compare two objects

---

# ✅ Primitive Functional Interfaces (IMPORTANT)

These avoid boxing (Integer → int).

Faster & used in performance cases.

---

# 🔹 IntPredicate

```java
boolean test(int value);
```

Example:

```java
IntPredicate even = n -> n % 2 == 0;
```

---

# 🔹 IntUnaryOperator

```java
int applyAsInt(int operand);
```

Example:

```java
IntUnaryOperator square = n -> n * n;
```

---

# 🔹 IntBinaryOperator

```java
int applyAsInt(int a, int b);
```

Example:

```java
IntBinaryOperator add = (a,b) -> a + b;
```

---

# 🔥 WHERE THEY ARE USED (SUPER IMPORTANT)

| Method        | Uses           |
| ------------- | -------------- |
| filter()      | Predicate      |
| map()         | Function       |
| forEach()     | Consumer       |
| reduce()      | BinaryOperator |
| sorted()      | Comparator     |
| removeIf()    | Predicate      |
| anyMatch()    | Predicate      |
| orElseGet()   | Supplier       |
| Map.forEach() | BiConsumer     |

---

# 🧠 FINAL SUPER SUMMARY

### ✔ Condition check → Predicate

### ✔ Convert → Function

### ✔ Use/Print → Consumer

### ✔ Provide value → Supplier

### ✔ Combine → BinaryOperator

### ✔ Modify same type → UnaryOperator

### ✔ Sorting → Comparator

---

