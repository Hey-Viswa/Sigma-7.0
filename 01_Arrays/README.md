# 🔢 Arrays - Data Structure Guide

## 📋 Overview

Arrays are fundamental data structures that store elements of the same type in contiguous memory locations. This section covers everything from basic array operations to advanced algorithms and patterns commonly asked in technical interviews.

## 📁 Folder Structure

```
01_Arrays/
├── 📁 Basic/                    # Fundamental array operations
├── 📁 TwoPointers/             # Two-pointer technique problems
├── 📁 DynamicProgramming/      # DP problems using arrays
└── 📁 TwoDimensional/          # 2D array and matrix problems
```

## 🎯 Learning Path

### 1. **Basic Operations** (Start Here)
- Array initialization and traversal
- Searching and basic operations
- Reverse, swap, and manipulation

### 2. **Two Pointers Technique**
- Container with most water
- Pair sum problems
- Array optimization techniques

### 3. **Dynamic Programming**
- Kadane's Algorithm (Maximum Subarray)
- Optimal substructure problems

### 4. **Two Dimensional Arrays**
- Matrix operations
- Spiral traversal
- Search in sorted matrix

## 🏢 Company Focus

### 🔴 **Google Favorites**
- Kadane's Algorithm
- Two Pointers problems
- Matrix algorithms

### 🟠 **Amazon Frequently Asked**
- Best Time to Buy/Sell Stock
- Container with Most Water
- Trapping Rain Water

### 🔵 **Microsoft Common**
- Array manipulation
- Two-dimensional problems
- Optimization challenges

## ⏱️ Complexity Guide

| Operation | Best Case | Average | Worst Case | Space |
|-----------|-----------|---------|------------|-------|
| Access | O(1) | O(1) | O(1) | O(1) |
| Search | O(1) | O(n) | O(n) | O(1) |
| Insertion | O(1) | O(n) | O(n) | O(1) |
| Deletion | O(1) | O(n) | O(n) | O(1) |

## 🚀 Quick Examples

```java
// Basic Array Declaration
int[] arr = new int[5];
int[] nums = {1, 2, 3, 4, 5};

// Array Traversal
for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// Enhanced for loop
for(int num : nums) {
    System.out.println(num);
}
```

## 📝 Key Patterns to Master

1. **Two Pointers**: For pair problems and optimization
2. **Sliding Window**: For subarray problems
3. **Prefix Sum**: For range queries
4. **Kadane's Algorithm**: For maximum subarray
5. **Matrix Traversal**: For 2D problems

## 🎯 Practice Strategy

1. Start with **Basic/** folder problems
2. Master **TwoPointers/** techniques
3. Understand **DynamicProgramming/** concepts
4. Challenge yourself with **TwoDimensional/** problems

Happy Coding! 🚀