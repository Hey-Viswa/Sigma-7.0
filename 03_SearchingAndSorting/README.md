# 🔍 Searching & Sorting Algorithms

## 📋 Overview

Searching and sorting are fundamental algorithmic concepts essential for any programmer. This section covers both basic and advanced techniques used across all major tech companies.

## 📁 Folder Structure

```
03_SearchingAndSorting/
├── 📁 Searching/                # Search algorithms
└── 📁 Sorting/                  # Sorting algorithms
```

## 🎯 Learning Path

### 1. **Searching Algorithms**

- **Linear Search**: O(n) - Sequential search
- **Binary Search**: O(log n) - Divide and conquer on sorted arrays

### 2. **Sorting Algorithms**

- **Bubble Sort**: O(n²) - Simple comparison-based
- **Selection Sort**: O(n²) - Find minimum/maximum
- **Insertion Sort**: O(n²) - Build sorted array incrementally
- **Merge Sort**: O(n log n) - Divide and conquer
- **Quick Sort**: O(n log n) average - Pivot-based partitioning
- **Counting Sort**: O(n+k) - Non-comparison based

## 🏢 Company Focus

### 🔴 **Google Favorites**

- Binary Search variations
- Merge Sort implementation
- Search in rotated arrays

### 🟠 **Amazon Frequently Asked**

- Quick Sort optimization
- Custom sorting criteria
- Search algorithms

### 🔵 **Microsoft Common**

- Sorting stability
- Time-space trade-offs
- Hybrid sorting algorithms

## ⏱️ Algorithm Complexity Comparison

| Algorithm | Best Case | Average | Worst Case | Space | Stable |
|-----------|-----------|---------|------------|-------|--------|
| **Searching** |
| Linear Search | O(1) | O(n) | O(n) | O(1) | - |
| Binary Search | O(1) | O(log n) | O(log n) | O(1) | - |
| **Sorting** |
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) | ✅ |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | ❌ |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) | ✅ |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) | ✅ |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) | ❌ |
| Counting Sort | O(n+k) | O(n+k) | O(n+k) | O(k) | ✅ |

## 🚀 Quick Examples

```java
// Binary Search Template
public int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}

// Quick Sort Template
public void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
```

## 📝 Key Concepts to Master

### Searching

1. **Binary Search**: Master the template and variations
2. **Search Space**: Understanding what to search on
3. **Boundary Conditions**: Left and right pointers handling

### Sorting

1. **Stability**: Whether equal elements maintain relative order
2. **In-place vs External**: Memory usage considerations
3. **Adaptive**: Performance on partially sorted data
4. **Comparison vs Non-comparison**: Different algorithmic approaches

## 🎯 Practice Strategy

1. **Start with Linear/Binary Search** - Master the fundamentals
2. **Practice O(n²) sorts** - Understand basic sorting mechanics
3. **Move to O(n log n)** - Learn divide and conquer
4. **Explore special cases** - Custom comparators, stability requirements

## 💡 Interview Tips

- Always ask about data constraints (size, range, duplicates)
- Consider stability requirements
- Discuss time-space trade-offs
- Know when to use each algorithm
- Practice implementing from scratch

## 🔧 When to Use Which Algorithm

### Searching
- **Linear Search**: Unsorted data, small datasets
- **Binary Search**: Sorted data, large datasets

### Sorting
- **Bubble/Selection/Insertion**: Educational purposes, small data
- **Merge Sort**: Stability required, guaranteed O(n log n)
- **Quick Sort**: Average case performance, in-place sorting
- **Counting Sort**: Integer data with limited range

Happy Sorting and Searching! 🚀
