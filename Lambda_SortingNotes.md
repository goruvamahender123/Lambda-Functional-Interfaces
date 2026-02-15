
---

## 🔹 First: Rule of Comparator (MOST IMPORTANT)

When Java compares two objects:

```java
compare(o1, o2)
```

Return value meaning:

| Result   | Meaning                  | Action     |
| -------- | ------------------------ | ---------- |
| negative | o1 should come BEFORE o2 | keep order |
| zero     | equal                    | keep order |
| positive | o1 should come AFTER o2  | swap       |

👉 Sorting algorithm uses this rule repeatedly.

---

## 🔹 Think Like This (Golden Rule 🧠)

Comparator answers this question:

> ❓ Should **o1** come before **o2** ?

If YES → return negative
If NO → return positive

---

# 🔥 Now let’s use your numbers

List:

```
100
900
400
800
```

We want to understand both:

### ✅ Ascending sort

### ✅ Descending sort

---

# ✅ 1️⃣ ASCENDING ORDER (small → big)

Target:

```
100 400 800 900
```

Comparator:

```java
(t1, t2) -> t1 - t2
```

---

### Compare 100 & 900

```
100 - 900 = -800
```

Negative → keep order
✔ 100 before 900 ✅

---

### Compare 900 & 400

```
900 - 400 = 500
```

Positive → swap
✔ 400 comes before 900

---

### Compare 900 & 800

```
900 - 800 = 100
```

Positive → swap

---

Final:

```
100 400 800 900
```

✔ ascending achieved

---

## 🧠 Why `t1 - t2` gives ASCENDING?

Because:

| t1    | t2    | result   | meaning       |
| ----- | ----- | -------- | ------------- |
| small | big   | negative | correct order |
| big   | small | positive | swap          |

So small values move to front.

---

# ✅ 2️⃣ DESCENDING ORDER (big → small)

Target:

```
900 800 400 100
```

Comparator:

```java
(t1, t2) -> t2 - t1
```

---

### Compare 100 & 900

```
900 - 100 = 800
```

Positive → swap
✔ 900 comes first

---

### Compare 900 & 400

```
400 - 900 = -500
```

Negative → keep
✔ 900 stays first

---

### Compare 400 & 800

```
800 - 400 = 400
```

Positive → swap

---

Final:

```
900 800 400 100
```

✔ descending achieved

---

## 🧠 Why `t2 - t1` gives DESCENDING?

Because:

| t1    | t2    | result   | meaning |
| ----- | ----- | -------- | ------- |
| small | big   | positive | swap    |
| big   | small | negative | keep    |

So big values move to front.

---

# 🔥 SUPER SIMPLE MEMORY TRICK

### ✔ Ascending:

```
small first → t1 - t2
```

### ✔ Descending:

```
big first → t2 - t1
```

---

# 🔹 What you said: “negative no change, positive change”

Yes ✅ but understand correctly:

When comparing:

```
compare(o1, o2)
```

### ✔ Negative:

means **correct order**
👉 keep as is

### ✔ Positive:

means **wrong order**
👉 swap them

---

# 🔥 Visual Understanding

Imagine comparing:

```
[ o1 , o2 ]
```

Comparator decides:

✔ keep
or
✔ swap

That’s all sorting is.

---

# 🔹 Universal Sorting Logic (for ANY type)

### Ask:

👉 Should o1 come before o2?

If yes → negative
If no → positive

---

# 🔹 Real-world analogy

Line for movie tickets:

If younger should stand first:

```
age1 - age2
```

If result negative → correct
If positive → swap positions

---

# 🔥 PRO TIP (Safe way)

Instead of subtraction:

```java
Integer.compare(t1, t2)   // ascending
Integer.compare(t2, t1)   // descending
```

---

# 🔥 Final understanding check

### If you want:

✔ Small → Big → `t1 - t2`
✔ Big → Small → `t2 - t1`

---
