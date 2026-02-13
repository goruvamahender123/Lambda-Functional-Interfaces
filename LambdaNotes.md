
---

# 🔥 1️⃣ What is a Lambda Expression?

👉 Lambda = short way to write a method implementation.

It is used to implement **one method** of a functional interface.

Think like this:

Instead of writing:

* class
* method
* override
* boilerplate code

👉 you write only the logic.

---

### Example (Old way)

```java
Runnable r = new Runnable() {
    public void run() {
        System.out.println("Running");
    }
};
```

---

### Lambda way

```java
Runnable r = () -> System.out.println("Running");
```

👉 same work
👉 less code
👉 easy to read

---

# 🔥 2️⃣ Lambda Basic Syntax

```java
(parameters) -> logic
```

Examples:

```java
() -> System.out.println("Hi")

x -> x * x

(a, b) -> a + b
```

Break it:

| Part  | Meaning                 |
| ----- | ----------------------- |
| ()    | inputs                  |
| ->    | separates input & logic |
| logic | what to do              |

---

# 🔥 3️⃣ Rules to Write Lambda (IMPORTANT)

## ✅ Rule 1: Remove method name & return type

Normal method:

```java
public int add(int a, int b)
```

Lambda:

```java
(a, b) -> a + b
```

👉 Java already knows return type.

---

## ✅ Rule 2: Data types optional

```java
(int a, int b) -> a + b
```

can be:

```java
(a, b) -> a + b
```

👉 compiler guesses type.

---

## ✅ Rule 3: One parameter → brackets optional

✔ allowed:

```java
x -> x * 2
```

✔ also correct:

```java
(x) -> x * 2
```

---

## ✅ Rule 4: No parameter → must use ()

```java
() -> System.out.println("Hello")
```

---

## ✅ Rule 5: Single line → no curly braces

```java
x -> x + 10
```

---

## ✅ Rule 6: Multiple lines → use {} and return

```java
x -> {
    System.out.println(x);
    return x * 2;
}
```

---

## ✅ Rule 7: Single line → no return keyword

✔ correct:

```java
x -> x * 2
```

❌ wrong:

```java
x -> return x * 2;
```

---

# 🔥 STEP-BY-STEP TRICK TO WRITE LAMBDA

When you see a question:

### Step 1: What inputs?

Example: two numbers

### Step 2: What output?

sum

### Step 3: write logic

👉 `(a,b) -> a + b`

---

### Another Example

Check even number

Input → number
Output → true/false

👉 `n -> n % 2 == 0`

---

# 🔥 WHERE DO WE USE LAMBDA IN REAL PROJECTS?

### ✅ 1. Sorting

```java
list.sort((a, b) -> a - b);
```

---

### ✅ 2. Looping

```java
list.forEach(x -> System.out.println(x));
```

---

### ✅ 3. Filtering

```java
list.stream()
    .filter(x -> x > 10)
    .forEach(System.out::println);
```

---

### ✅ 4. Optional handling

```java
user.ifPresent(u -> System.out.println(u.getName()));
```

---

### ✅ 5. Multi-threading

```java
new Thread(() -> System.out.println("Task")).start();
```

---

# ⚠️ WHEN NOT TO USE LAMBDA

Avoid when:

❌ logic is very long
❌ readability becomes confusing
❌ debugging difficult
❌ more than one responsibility

👉 Lambda is for **small logic only**.

---

# 🔥 4️⃣ What is Method Reference?

### Simple Meaning:

👉 Method reference = shortcut for lambda that only calls an existing method.

If lambda only calls a method → use method reference.

---

### Lambda

```java
name -> System.out.println(name)
```

### Method Reference

```java
System.out::println
```

Cleaner & shorter 👍

---

# 🔥 WHEN TO USE METHOD REFERENCE?

Use when lambda:

✔ just calls a method
✔ no extra logic
✔ parameters match

---

### ✔ Use

```java
list.forEach(System.out::println);
```

---

### ❌ Don’t use (extra logic exists)

```java
list.forEach(x -> System.out.println(x + " hi"));
```

Cannot convert.

---

# 🔥 TYPES OF METHOD REFERENCES

## 1️⃣ Static Method Reference

Syntax:

```java
ClassName::method
```

Example:

```java
Math::abs
```

Usage:

```java
list.stream().map(Math::abs);
```

---

## 2️⃣ Instance Method Reference

Syntax:

```java
object::method
```

Example:

```java
System.out::println
```

---

## 3️⃣ Method of arbitrary object (VERY COMMON)

Syntax:

```java
ClassName::instanceMethod
```

Example:

```java
String::length
```

Usage:

```java
list.stream().map(String::length);
```

👉 calls length() on each string.

---

## 4️⃣ Constructor Reference

Syntax:

```java
ClassName::new
```

Example:

```java
Supplier<User> s = User::new;
```

Used for object creation.

---

# 🔥 METHOD REFERENCE RULES

✔ Method already exists
✔ Same parameters as lambda
✔ No extra logic
✔ Cleaner than lambda

---

# 🔥 LAMBDA → METHOD REFERENCE CONVERSION

| Lambda                     | Method Reference    |
| -------------------------- | ------------------- |
| x -> System.out.println(x) | System.out::println |
| s -> s.length()            | String::length      |
| x -> Math.abs(x)           | Math::abs           |
| () -> new User()           | User::new           |
| u -> u.getName()           | User::getName       |

---

# 🔥 MOST USED METHOD REFERENCES IN REAL PROJECTS

### ✔ Printing

```java
System.out::println
```

---

### ✔ Get property

```java
User::getName
```

Used in DTO mapping & streams.

---

### ✔ String operations

```java
String::toUpperCase
String::length
```

---

### ✔ Constructor mapping

```java
UserDTO::new
```

---

### ✔ Sorting

```java
list.sort(String::compareTo);
```

---

# 🔥 LAMBDA vs METHOD REFERENCE

Use lambda when:

✔ logic exists

Use method reference when:

✔ just calling method

---

# 🧠 SIMPLE MEMORY SUMMARY

Lambda → write logic
Method reference → reuse existing method

Lambda = mini function
Method reference = shortcut call

---
