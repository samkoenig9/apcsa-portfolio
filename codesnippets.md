---
layout: page
title: Notes and Snippets
---

# TT0

## Data Structures

- Data structures are methods for organizing data
- Data Structures and organizing data require students to become more algorithmic

## Data Structure Algorithms
- There are many algorithms for different purposes
- Interact with different data structures
- Code example:
```java
if (this.value > i.value) {
    int temp = this.value;
    this.value = i.value;
    i.value = temp;
}
```
- Data structures and algorithms combine and allow programmers to build different types of computer programs
- Well managed data structures and algorithms ensures well-optimized and efficient code

# TT1

## Linked Lists

- Data structures conventions begin with arrays most of the time
- College Board units 6-8
- Continue with linked lists, foundation of stacks and queues

# TT2

- Math Symbols
- Each symbol has its own priority, shown below
    
```java
private final Map<String, Integer> OPERATORS = new HashMap<>();
{
    // Map<"token", precedence> 
    OPERATORS.put("*", 3);
    OPERATORS.put("/", 3);
    OPERATORS.put("%", 3);
    OPERATORS.put("+", 4);
    OPERATORS.put("-", 4);
}
```
Calculator must convert the input into RPN so that it can understand how to calculate
- Original:

```Java
2 + 2
4 * 6 + 3
5 + 1 * 8
(7 + 5) * 9
```

- Tokenized:

```Java
[2, +, 2]
[4, *, 6, +, 3]
[5, +, 1, *, 8]
[(7, +, 5), *, 9]
```

- Reverse Polish Notation:
```Java
[2, 2, +]
[4, 6, *, 3, +]
[5, 1, 8, *, +]
[7, 5, +, 9, *]
```

- Result:
```Java
4.0
27.0
13.0
108.0
```

# TT3

## Bubble Sort
- Swaps 2 elements next to each other until order is correct
- Checks the entire lineup to see if things should be switchd
- Snippet of sample bubble sort code

```java
while (!sorted) {
    sorted = true;
    for (int i = 0; i < list.size()-1; i++) {
        if (list.get(i).compareTo(list.get(i + 1)) > 0) {
            temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
            sorted = false;
        }
    }
}
```

## Selection Sort
- Finds the minimum value element repeadly
- Scans and picks smallest value to be put in another array
- Repeats this process until sorted
- Snippet of sample code

```java
for (int i = 0; i < arr.size() - 1; i++)  
{  
    int index = i;  
    for (int j = i + 1; j < arr.size(); j++){  
        if (arr.get(j) < arr.get(index)){  
            index = j; //searching for lowest index  
        }  
    }  
    int smallerNumber = arr.get(index);   
    arr.set(index, arr.get(i)); 
    arr.set(i, smallerNumber);  
}  
```

## Merge Sort
- Merge sort divides into different sections
- Input array is divided into 2 halves, calls each half, and then merges the halves back together
- Merge is the key process and is executed after the halves are sorted
- Small sample of merge sort code

```java
ArrayList<Integer> left = new ArrayList<Integer>();
ArrayList<Integer> right = new ArrayList<Integer>();
int center;

if (whole.size() == 1) {    
return whole;
} else {
    center = whole.size()/2;
    // copy the left half of whole into the left.
    for (int i=0; i<center; i++) {
            left.add(whole.get(i));
    }

    //copy the right half of whole into the new arraylist.
    for (int i=center; i<whole.size(); i++) {
            right.add(whole.get(i));
    }

    // Sort the left and right halves of the arraylist.
    left  = mergeSort(left);
    right = mergeSort(right);

    // Merge the results back together.
    merge(left, right, whole);

    return whole;
}
```

## Insertion Sort
- Works similar to merge sort
- 2 arrays: sorted and unsorted
- Sorts elements in unsorted array then adds them to the sorted array
- Snippet of insertion sort code

```java
for (int j = 1; j < list.size(); j++) {
    Integer current = list.get(j);
    int i = j-1;
    while ((i > -1) && (list.get(i) > current)) {
        list.set(i+1, list.get(i));
        i--;
    }
    list.set(i+1, current);
}
```