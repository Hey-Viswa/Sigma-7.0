# 🎯 Bit Manipulation - The Power of Binary

## 📋 Overview

Bit manipulation involves directly manipulating bits and bit patterns. It's one of the most efficient ways to perform certain operations and is essential for optimization, cryptography, and low-level programming. Many tech companies love bit manipulation problems for their elegance and efficiency.

## 📁 Folder Structure

```
07_BitManipulation/
└── 📁 Basic/                    # Fundamental bit operations
```

## 🎯 Learning Path

### 1. **Basic Bit Operations**

- **AND (&)**: Both bits must be 1
- **OR (|)**: At least one bit must be 1  
- **XOR (^)**: Bits must be different
- **NOT (~)**: Flip all bits
- **Left Shift (<<)**: Multiply by 2^n
- **Right Shift (>>)**: Divide by 2^n

### 2. **Common Bit Manipulation Tricks**

- **Check Even/Odd**: Use `n & 1`
- **Power of Two**: Use `n & (n-1) == 0`
- **Set/Clear/Toggle Bits**: Specific bit operations
- **Count Set Bits**: Population count
- **Find Single Number**: XOR properties

## 🏢 Company Focus

### 🔴 **Google Favorites**

- Bit manipulation optimization
- Complex bit patterns
- Efficient algorithms using bits

### 🟠 **Amazon Frequently Asked**

- Basic bit operations
- Power of two problems
- XOR applications

### 🔵 **Microsoft Common**

- Bit manipulation in optimization
- Low-level operations
- Performance critical algorithms

## ⏱️ Bit Operations Complexity

| Operation | Time Complexity | Space Complexity | Notes |
|-----------|----------------|------------------|-------|
| AND, OR, XOR | O(1) | O(1) | Single instruction |
| Left/Right Shift | O(1) | O(1) | Single instruction |
| Count Set Bits | O(log n) | O(1) | Number of bits |
| Find Rightmost Set | O(1) | O(1) | n & (-n) |
| Clear Rightmost Set | O(1) | O(1) | n & (n-1) |

## 🚀 Essential Bit Manipulation Patterns

```java
// Basic Operations
int setBit(int n, int i) { return n | (1 << i); }
int clearBit(int n, int i) { return n & ~(1 << i); }
int toggleBit(int n, int i) { return n ^ (1 << i); }
boolean getBit(int n, int i) { return (n & (1 << i)) != 0; }

// Advanced Tricks
boolean isEven(int n) { return (n & 1) == 0; }
boolean isPowerOfTwo(int n) { return n > 0 && (n & (n-1)) == 0; }
int multiplyBy2(int n) { return n << 1; }
int divideBy2(int n) { return n >> 1; }

// XOR Magic
int swapNumbers(int a, int b) {
    a = a ^ b;
    b = a ^ b; // b = a ^ b ^ b = a
    a = a ^ b; // a = a ^ b ^ a = b
}
```

## 📝 Key Concepts to Master

### Fundamental Principles

1. **Binary Representation**: How numbers are stored
2. **Two's Complement**: Negative number representation
3. **Bit Positions**: Counting from right (0-indexed)
4. **Masks**: Using specific bit patterns

### Common Bit Patterns

1. **Single Bit**: `1 << i` (bit at position i)
2. **All Ones**: `~0` or `-1`
3. **Lower n Bits**: `(1 << n) - 1`
4. **Clear Rightmost**: `n & (n-1)`
5. **Isolate Rightmost**: `n & (-n)`

## 🎯 Practice Strategy

### Phase 1: Master the Basics

1. Learn all basic bitwise operators
2. Practice number base conversions
3. Understand two's complement
4. Master single bit operations

### Phase 2: Advanced Techniques

1. Solve XOR-based problems
2. Practice bit counting algorithms
3. Learn bit manipulation tricks
4. Optimize algorithms using bits

## 💡 Common Interview Problems

### Easy Level
1. Check if number is even or odd
2. Check if number is power of 2
3. Count number of set bits
4. Swap two numbers without temp variable

### Medium Level
1. Find the single number in array (XOR)
2. Find two non-repeating elements
3. Reverse bits of a number
4. Add 1 to number using bit manipulation

### Hard Level
1. Find missing number in range
2. Maximum XOR of two numbers in array
3. Count total set bits from 1 to n
4. Divide two integers without division

## 🔧 Bit Manipulation Applications

### Performance Optimization
- **Fast Multiplication/Division**: Using shifts
- **Set Operations**: Using bitmasks
- **Flag Management**: Multiple boolean flags in one integer
- **Memory Optimization**: Compact data structures

### Real-World Uses
- **Graphics Programming**: Color manipulation, pixel operations
- **Cryptography**: Encryption algorithms, hash functions
- **Networking**: IP address manipulation, protocol headers
- **Database Systems**: Bitmap indexes, compression

## 🧠 Bit Manipulation Tricks

### Essential Formulas

```java
// Check if bit i is set
boolean isSet = (n & (1 << i)) != 0;

// Set bit i
n = n | (1 << i);

// Clear bit i  
n = n & ~(1 << i);

// Toggle bit i
n = n ^ (1 << i);

// Clear all bits from i to 0
n = n & (~((1 << (i + 1)) - 1));

// Clear all bits from MSB to i
n = n & ((1 << i) - 1);
```

### XOR Properties

1. **a ^ a = 0**: Any number XOR with itself is 0
2. **a ^ 0 = a**: Any number XOR with 0 is itself
3. **XOR is commutative**: a ^ b = b ^ a
4. **XOR is associative**: (a ^ b) ^ c = a ^ (b ^ c)

## 💡 Debugging Bit Operations

### Visualization Techniques

```java
// Print binary representation
public static void printBinary(int n) {
    for (int i = 31; i >= 0; i--) {
        System.out.print((n & (1 << i)) != 0 ? "1" : "0");
        if (i % 4 == 0) System.out.print(" "); // Group by 4
    }
    System.out.println();
}

// Count set bits
public static int countSetBits(int n) {
    int count = 0;
    while (n != 0) {
        count += n & 1;
        n >>= 1;
    }
    return count;
}
```

## 🔄 Advanced Techniques

### Brian Kernighan's Algorithm
```java
// Count set bits efficiently
int countSetBits(int n) {
    int count = 0;
    while (n != 0) {
        n = n & (n - 1); // Clear rightmost set bit
        count++;
    }
    return count;
}
```

### Bit Manipulation in Competitive Programming
- **Subset Generation**: Using bitmasks to represent subsets
- **Dynamic Programming**: State compression using bits
- **Graph Algorithms**: Adjacency matrix compression

## 🚀 From Bits to Algorithms

Many advanced algorithms use bit manipulation:
- **Bloom Filters**: Probabilistic data structures
- **Bitsets**: Efficient set operations
- **Hash Tables**: Fast hashing functions
- **Compression**: Data compression algorithms

Think in Binary, Code Efficiently! 🚀
