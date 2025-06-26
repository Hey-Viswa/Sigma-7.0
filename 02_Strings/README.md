# 📝 Strings - Text Processing Guide

## 📋 Overview

Strings are sequences of characters and one of the most important data types in programming. This section covers string manipulation, pattern matching, and text processing algorithms essential for coding interviews.

## 📁 Folder Structure

```
02_Strings/
├── 📁 Basic/                    # Fundamental string operations
└── 📁 Algorithms/               # Advanced string algorithms
```

## 🎯 Learning Path

### 1. **Basic String Operations**

- String initialization and manipulation
- Palindrome checking
- String compression and formatting
- Character operations

### 2. **String Algorithms**

- Anagram detection
- Pattern matching
- Character frequency analysis
- String optimization techniques

## 🏢 Company Focus

### 🔴 **Google Favorites**

- String pattern matching
- Anagram problems
- Text processing algorithms

### 🟠 **Amazon Frequently Asked**

- Palindrome validation
- String compression
- Character manipulation

### 🔵 **Microsoft Common**

- String algorithms
- Text optimization
- Character encoding problems

## ⏱️ Common Operations Complexity

| Operation | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| Length | O(1) | O(1) |
| Character Access | O(1) | O(1) |
| Substring | O(k) | O(k) |
| Concatenation | O(n+m) | O(n+m) |
| Comparison | O(n) | O(1) |

## 🚀 Quick Examples

```java
// String Declaration
String str = "Hello World";
char[] chars = str.toCharArray();

// String Operations
String reversed = new StringBuilder(str).reverse().toString();
boolean isPalindrome = str.equals(reversed);

// Character Manipulation
str = str.toLowerCase();
str = str.toUpperCase();
```

## 📝 Key Patterns to Master

1. **Two Pointers**: For palindrome and reversal
2. **HashMap/Frequency**: For anagram and character counting
3. **StringBuilder**: For efficient string building
4. **Sliding Window**: For substring problems
5. **Pattern Matching**: For search algorithms

## 🎯 Practice Strategy

1. Start with **Basic/** string operations
2. Master character manipulation techniques
3. Practice **Algorithms/** for pattern recognition
4. Focus on optimization and edge cases

## 💡 Important Tips

- Use `StringBuilder` for multiple concatenations
- Consider character arrays for in-place operations
- Watch out for null and empty string edge cases
- Understand Unicode and character encoding

Happy String Coding! 🚀
