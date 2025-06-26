# 📁 Folder Organization Guide

## Current Structure Overview

```
📂 Apna College Sigma 7.0/
├── 📄 README.md                    # Main documentation
├── 📄 STUDY_PLAN.md               # Learning roadmap
├── 📄 FOLDER_STRUCTURE.md         # This file
├── 📄 Apna College Sigma 7.0.iml   # IntelliJ project file
│
├── � 01_Arrays/
│   ├── 📄 README.md               # Arrays topic overview
│   ├── � Basic/                  # Basic array operations
│   │   ├── 📄 BestTimeToBuySellStock.java
│   │   ├── 📄 Example.java
│   │   ├── 📄 LargestNo.java
│   │   ├── � ReverseArray.java
│   │   ├── 📄 SubArrays.java
│   │   ├── 📄 TrappingRainWater.java
│   │   └── 📁 ImportantQuestions/
│   ├── � TwoPointers/            # Two pointer technique
│   │   ├── 📄 ContainerWithMostWater.java
│   │   ├── 📄 PairSum1.java
│   │   ├── 📄 PairSum2.java
│   │   └── 📄 PairsInArray.java
│   ├── � DynamicProgramming/     # DP problems
│   │   └── 📄 KadaneAlgorithm.java
│   └── � TwoDimensional/         # 2D array problems
│       ├── 📄 DiagonalMatrixSum.java
│       ├── 📄 SpiralMatrix.java
│       └── 📄 twodarray.java
│
├── � 02_Strings/
│   ├── 📄 README.md               # Strings topic overview
│   ├── 📁 Basic/                  # Basic string operations
│   │   ├── 📄 Palindrom.java
│   │   ├── 📄 StringCompression.java
│   │   ├── 📄 LargestString.java
│   │   └── 📄 Substring.java
│   └── � Algorithms/             # String algorithms
│       ├── 📄 Anagram.java
│       └── 📄 LowercaseCount.java
│
├── � 03_SearchingAndSorting/
│   ├── 📄 README.md               # Search & Sort overview
│   ├── 📁 Searching/              # Search algorithms
│   │   ├── 📄 BinarySearch.java
│   │   └── 📄 LinearSearch.java
│   └── 📁 Sorting/                # Sorting algorithms
│       ├── 📄 BubbleSort.java
│       ├── 📄 MergeSort.java
│       ├── 📄 quickSort.java
│       └── 📄 CountingSort.java
│
├── � 04_Recursion/
│   ├── � Basic/                  # Basic recursion
│   │   ├── 📄 Factorial.java
│   │   ├── 📄 Fibonaccai.java
│   │   ├── 📄 powerN.java
│   │   └── 📄 TileProblem.java
│   └── � Advanced/               # Advanced recursion
│       ├── 📄 TowerOfHanoi.java
│       ├── 📄 NumToStr.java
│       └── 📄 BinaryStringProblem.java
│
├── � 05_BackTracking/
│   ├── � Core/                   # Core backtracking
│   │   ├── 📄 NQueen.java
│   │   ├── � Sudoku.java
│   │   └── 📄 FindPermutation.java
│   └── 📁 PathFinding/            # Path finding problems
│       ├── 📄 KnightsTour.java
│       ├── 📄 RatMaze.java
│       └── 📄 Gridway.java
│
├── 🔗 06_LinkedList/
│   └── 📁 Basic/
│       └── 📄 linklist.java       # Complete LinkedList implementation
│
├── 🎯 07_BitManipulation/
│   └── 📁 Basic/
│       ├── 📄 EvenOrOdd.java
│       ├── 📄 PowerOfTwo.java
│       ├── 📄 fastExponentiation.java
│       ├── 📄 BitwiseAddOne.java
│       └── 📄 Chartolower.java
│
└── ⚡ 08_DivideAndConquer/
    └── 📄 rotatedArray.java        # Search in rotated array
```

## 🎯 Recommended Study Order

### Beginner Level (Start Here)
1. **Arrays** → Basic operations, searching, sorting
2. **Strings** → Palindrome, anagrams, basic manipulation
3. **Searching** → Linear and Binary Search
4. **Sorting** → Bubble, Selection, Insertion Sort

### Intermediate Level
1. **Recursion** → Factorial, Fibonacci, Power
2. **LinkedList** → Basic operations, traversal
3. **ArrayList** → Dynamic arrays, important problems
4. **BitManipulation** → Basic bit operations

### Advanced Level
1. **BackTracking** → N-Queens, Sudoku, permutations
2. **DivideAndConquer** → Merge Sort, complex problems
3. **Advanced Array Problems** → Kadane's Algorithm
4. **Complex String Problems** → Pattern matching

## 🏢 Company-wise Important Files

### 🔴 Google Focus

```
- 05_BackTracking/Core/NQueen.java
- 01_Arrays/DynamicProgramming/KadaneAlgorithm.java
- 03_SearchingAndSorting/Searching/BinarySearch.java
- 03_SearchingAndSorting/Sorting/MergeSort.java
```

### 🟠 Amazon Focus

```
- 04_Recursion/Basic/TileProblem.java
- 01_Arrays/TwoPointers/ContainerWithMostWater.java
- 02_Strings/Basic/Palindrom.java
- 01_Arrays/Basic/BestTimeToBuySellStock.java
```

### 🔵 Microsoft Focus

```
- 06_LinkedList/Basic/linklist.java
- 03_SearchingAndSorting/Sorting/quickSort.java
- 05_BackTracking/Core/Sudoku.java
- 07_BitManipulation/Basic/fastExponentiation.java
```

## 📈 Complexity Reference

| Algorithm | Time | Space | Companies |
|-----------|------|-------|-----------|
| Binary Search | O(log n) | O(1) | All |
| Kadane's Algorithm | O(n) | O(1) | Google, Amazon |
| N-Queens | O(N!) | O(N²) | Google, Facebook |
| Merge Sort | O(n log n) | O(n) | Microsoft, Apple |
| Quick Sort | O(n log n) avg | O(log n) | All |
| LinkedList Ops | O(1) head, O(n) tail | O(1) | All |

## 🚀 Quick Start Commands

```bash
# Compile and run a Java file
javac filename.java
java filename

# Compile with package
javac -d . packagename/filename.java
java packagename.filename

# Run specific examples
java LinkedList.linklist
java BinarySearch
java KadaneAlgorithm
java NQueen
```

## 📝 Code Standards

All files follow this structure:
```java
/**
 * PROBLEM_NAME - Category
 * 
 * Problem: Brief description
 * Companies: List of companies
 * Difficulty: Easy/Medium/Hard
 * Topics: Related topics
 * Time/Space Complexity: Big O notation
 */
public class ClassName {
    // Well-commented implementation
}
```

## 🎓 Learning Tips

1. **Start Small**: Begin with basic problems in each category
2. **Understand Patterns**: Many problems share similar approaches
3. **Practice Regularly**: Solve 2-3 problems daily
4. **Time Yourself**: Practice under interview conditions
5. **Code from Scratch**: Don't just read, implement yourself
6. **Explain Aloud**: Practice explaining your approach

Happy Learning! 🚀
