Good question 👍
Instead of random examples, I’ll give you the **most commonly used method references developers actually write in real Java code** (Streams, collections, utility methods).

I’ll group them by the **4 types of method references**.

---

# 1️⃣ Instance Method of a Particular Object

Pattern:

```
object::method
```

Object is **already known**.

### Most Used Examples

1.

```java
System.out::println
```

Equivalent:

```java
x -> System.out.println(x)
```

Very common in **Streams forEach()**.

---

2.

```java
logger::info
```

Equivalent:

```java
msg -> logger.info(msg)
```

Used in **logging frameworks**.

---

3.

```java
writer::write
```

Equivalent:

```java
s -> writer.write(s)
```

Used in **file writing**.

---

4.

```java
bufferedReader::readLine
```

Equivalent:

```java
() -> bufferedReader.readLine()
```

Used when reading files.

---

5.

```java
map::put
```

Equivalent:

```java
(k,v) -> map.put(k,v)
```

Used when populating maps.

---

6.

```java
set::add
```

Equivalent:

```java
x -> set.add(x)
```

---

7.

```java
list::add
```

Equivalent:

```java
x -> list.add(x)
```

---

8.

```java
queue::offer
```

Equivalent:

```java
x -> queue.offer(x)
```

---

9.

```java
fileWriter::append
```

Equivalent:

```java
s -> fileWriter.append(s)
```

---

10.

```java
printStream::printf
```

Equivalent:

```java
s -> printStream.printf(s)
```

---

# 2️⃣ Instance Method of an Arbitrary Object of a Class

Pattern:

```
ClassName::instanceMethod
```

Object comes **from lambda parameter**.

### Most Used Examples

1.

```java
String::toLowerCase
```

Equivalent:

```java
s -> s.toLowerCase()
```

---

2.

```java
String::toUpperCase
```

Equivalent:

```java
s -> s.toUpperCase()
```

---

3.

```java
String::trim
```

Equivalent:

```java
s -> s.trim()
```

---

4.

```java
String::length
```

Equivalent:

```java
s -> s.length()
```

---

5.

```java
List::size
```

Equivalent:

```java
list -> list.size()
```

---

6.

```java
Object::toString
```

Equivalent:

```java
obj -> obj.toString()
```

---

7.

```java
String::isEmpty
```

Equivalent:

```java
s -> s.isEmpty()
```

---

8.

```java
String::charAt
```

Equivalent:

```java
(s,i) -> s.charAt(i)
```

---

9.

```java
Integer::compareTo
```

Equivalent:

```java
(a,b) -> a.compareTo(b)
```

---

10.

```java
String::compareToIgnoreCase
```

Equivalent:

```java
(a,b) -> a.compareToIgnoreCase(b)
```

---

# 3️⃣ Static Method of a Class

Pattern:

```
ClassName::staticMethod
```

### Most Used Examples

1.

```java
Math::abs
```

---

2.

```java
Math::max
```

---

3.

```java
Math::min
```

---

4.

```java
Integer::parseInt
```

---

5.

```java
Double::parseDouble
```

---

6.

```java
Long::parseLong
```

---

7.

```java
Objects::nonNull
```

Very common in streams:

```java
list.stream().filter(Objects::nonNull)
```

---

8.

```java
Objects::isNull
```

---

9.

```java
Collections::reverse
```

---

10.

```java
Arrays::sort
```

---

# 4️⃣ Constructor Reference

Pattern:

```
ClassName::new
```

### Most Used Examples

1.

```java
ArrayList::new
```

---

2.

```java
HashMap::new
```

---

3.

```java
HashSet::new
```

---

4.

```java
User::new
```

---

5.

```java
String::new
```

---

6.

```java
Thread::new
```

---

7.

```java
File::new
```

---

8.

```java
StringBuilder::new
```

---

9.

```java
StringBuffer::new
```

---

10.

```java
Scanner::new
```

---

# ⭐ Quick Summary (Very Important)

| Type              | Pattern               | Example               |
| ----------------- | --------------------- | --------------------- |
| Particular Object | `object::method`      | `System.out::println` |
| Arbitrary Object  | `Class::method`       | `String::toLowerCase` |
| Static Method     | `Class::staticMethod` | `Math::abs`           |
| Constructor       | `Class::new`          | `ArrayList::new`      |

---

✅ If you want, I can also show you **the 7 method references that appear the most in real Spring Boot + Stream API code**, which is **much more useful for interviews and real projects**.
