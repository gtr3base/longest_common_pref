<div align = "center">

# Longest Common Prefix

### 🤝 The easiest solution to implement

![Runtime](https://img.shields.io/badge/Runtime-1ms-brightgreen)
![Beats](https://img.shields.io/badge/Beats-58.56%25-success)
![LeetCode](https://img.shields.io/badge/LeetCode-Longest%20Common%20prefix-orange)

</div>

---

## 🧠 The Problem
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string ""

**Example:**
```text
Input: strs = [flower, flow]
Output: flow
```
## Solution is in src/main/java/com/gtr3base/Main.java

## 🤓 Explanation
Firstly we create mutable buffer - StringBuilder,
then we sort our array strs to put words into ascending order.
This made to know what word is the shortest, this word has the longest prefix we could find.
You can see this in for loop, where we use Math.min between first and last words of array.
If there is no match we just return an empty string, if there is - we modify the string buffer with 1 letter of word
before we reach the longest pref.

