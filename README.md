# Java-Streams

# ☕ Java Streams Guide

Java **Streams API** (introduced in Java 8) is used to process collections of objects in a **functional and declarative way**.  
It allows filtering, mapping, reducing, and collecting data with clean and concise code.

---

## 🔄 Stream Workflow
A **Stream pipeline** consists of three main parts:
1. **Source** → Collection, Arrays, I/O Channels, etc.
2. **Intermediate Operations** → Transform or filter the stream (returns another Stream).
3. **Terminal Operations** → Produces a result (ends the pipeline).

---

## ⚙️ Intermediate Operations
Intermediate operations are **lazy** (executed only when a terminal operation is called).  
They return a new Stream.

- `filter(Predicate<T>)` → Filters elements based on condition  
- `map(Function<T, R>)` → Transforms each element  
- `sorted()` → Sorts elements  
- `distinct()` → Removes duplicates  
- `limit(n)` → Returns first `n` elements  
- `skip(n)` → Skips first `n` elements  
- `peek(Consumer<T>)` → Debugging/logging values

✅ Example are in above Files

# 🏁 Java Stream Terminal Operations

**Terminal operations** are the final step in a Stream pipeline.  
They produce a **result** (such as a collection, value, or side-effect).  
⚠️ Once a terminal operation is executed, the Stream **cannot be reused**.

---

## ✅ Common Terminal Operations

- **forEach(Consumer<T>)** → Iterates elements of the stream  
- **collect(Collectors.toList())** → Collects elements into a list (or other collection)  
- **reduce(...)** → Combines elements into a single value  
- **count()** → Returns the number of elements in the stream  
- **anyMatch(Predicate<T>)** → Returns `true` if any element matches the condition  
- **allMatch(Predicate<T>)** → Returns `true` if all elements match the condition  
- **noneMatch(Predicate<T>)** → Returns `true` if no elements match the condition  
- **findFirst() / findAny()** → Returns the first or any element (Optional)  
- **max(Comparator<T>) / min(Comparator<T>)** → Returns the maximum or minimum element  

---
✅ Example are in above Files
