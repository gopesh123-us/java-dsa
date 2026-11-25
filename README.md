
# Java Data Structures and Algorithms

A hands-on learning repository dedicated to mastering Data Structures,
Algorithms (DSA), logic building, computational thinking, and
problem-solving using Java.

## Learning Objectives

- Develop strong computational thinking skills.
- Solve programming problems independently.
- Understand data structures and their internal implementations.
- Understand algorithms rather than merely memorize solutions.
- Analyze time and space complexity.
- Compare alternative solutions and their trade-offs.
- Develop efficient, reusable, and maintainable Java code.
- Strengthen foundations for software engineering and system design.

## Learning Resources

This repository consolidates knowledge from multiple learning sources:

| Learning Source | Focus |
|---|---|
| Smart Programming | Data structures and algorithms |
| Prakash - DurgaSoft | DSA, conceptual understanding, and implementation |
| Independent practice | Logic building and problem-solving |
| Official Java documentation | Language and standard library reference |

Additional learning resources will be incorporated as the project evolves.

Source code and notes are organized by concepts rather than instructors.

## Technology Stack

| Technology | Purpose |
|---|---|
| Java 25 | Programming language |
| Amazon Corretto | Current JDK distribution |
| Maven | Build and dependency management |
| Eclipse IDE | Development environment |
| Git | Version control |
| GitHub | Remote repository |
| Markdown | Technical documentation |
| JUnit | Future unit testing |

## Learning Roadmap

### 1. Logic Building and Problem Solving

- [ ] Computational thinking
- [ ] Problem decomposition
- [ ] Pattern recognition
- [ ] Conditional logic
- [ ] Loops and nested loops
- [ ] Pattern programming
- [ ] Mathematical problems
- [ ] Number manipulation
- [ ] String manipulation
- [ ] Array-based problems
- [ ] Dry running programs
- [ ] Tracing program execution
- [ ] Debugging
- [ ] Brute-force approaches
- [ ] Solution optimization

### 2. Algorithm Analysis

- [ ] Introduction to algorithms
- [ ] Time complexity
- [ ] Space complexity
- [ ] Big O notation
- [ ] Big Omega notation
- [ ] Big Theta notation
- [ ] Best-case analysis
- [ ] Average-case analysis
- [ ] Worst-case analysis
- [ ] Amortized complexity
- [ ] Recursive algorithm analysis
- [ ] Performance comparison

### 3. Arrays and Strings

- [ ] One-dimensional arrays
- [ ] Multidimensional arrays
- [ ] Array traversal
- [ ] Insertion and deletion
- [ ] Dynamic arrays
- [ ] Matrix operations
- [ ] String manipulation
- [ ] Two-pointer technique
- [ ] Sliding window technique
- [ ] Prefix sums
- [ ] Array and string exercises

### 4. Recursion

- [ ] Recursive thinking
- [ ] Base cases
- [ ] Recursive cases
- [ ] Method call stack
- [ ] Stack frames
- [ ] Recursive execution tracing
- [ ] Recursion trees
- [ ] Recursive versus iterative solutions
- [ ] Backtracking fundamentals

### 5. Linked Lists

- [ ] Singly linked lists
- [ ] Doubly linked lists
- [ ] Circular linked lists
- [ ] Insertion
- [ ] Deletion
- [ ] Traversal
- [ ] Searching
- [ ] Reversing linked lists
- [ ] Fast and slow pointers
- [ ] Cycle detection

### 6. Stacks and Queues

- [ ] Stack fundamentals
- [ ] LIFO principle
- [ ] Array-based stack
- [ ] Linked-list-based stack
- [ ] Queue fundamentals
- [ ] FIFO principle
- [ ] Circular queues
- [ ] Double-ended queues
- [ ] Priority queues
- [ ] Practical stack and queue problems

### 7. Searching Algorithms

- [ ] Linear search
- [ ] Binary search
- [ ] Iterative binary search
- [ ] Recursive binary search
- [ ] Binary search variations
- [ ] Searching algorithm comparisons

### 8. Sorting Algorithms

- [ ] Bubble sort
- [ ] Selection sort
- [ ] Insertion sort
- [ ] Merge sort
- [ ] Quick sort
- [ ] Heap sort
- [ ] Counting sort
- [ ] Radix sort
- [ ] Stable and unstable sorting
- [ ] In-place and out-of-place sorting
- [ ] Sorting algorithm comparisons

### 9. Hashing

- [ ] Hash functions
- [ ] Hash codes
- [ ] Hash tables
- [ ] Hash collisions
- [ ] Separate chaining
- [ ] Open addressing
- [ ] Load factor
- [ ] Rehashing
- [ ] HashMap internal implementation
- [ ] HashSet internal implementation
- [ ] equals() and hashCode()

### 10. Trees and Heaps

- [ ] Tree terminology
- [ ] Binary trees
- [ ] Binary search trees
- [ ] Preorder traversal
- [ ] Inorder traversal
- [ ] Postorder traversal
- [ ] Level-order traversal
- [ ] Balanced trees
- [ ] AVL trees
- [ ] Red-black trees
- [ ] Min heaps
- [ ] Max heaps
- [ ] Tries

### 11. Graphs

- [ ] Graph terminology
- [ ] Directed and undirected graphs
- [ ] Weighted and unweighted graphs
- [ ] Adjacency matrices
- [ ] Adjacency lists
- [ ] Breadth-first search
- [ ] Depth-first search
- [ ] Cycle detection
- [ ] Topological sorting
- [ ] Dijkstra's algorithm
- [ ] Bellman-Ford algorithm
- [ ] Minimum spanning trees
- [ ] Union-Find

### 12. Advanced Problem-Solving Techniques

- [ ] Divide and conquer
- [ ] Greedy algorithms
- [ ] Backtracking
- [ ] Dynamic programming
- [ ] Memoization
- [ ] Tabulation
- [ ] Bit manipulation
- [ ] Monotonic stacks
- [ ] Interval problems
- [ ] Independent coding challenges

### 13. Java-Specific Applications

- [ ] Java Generics
- [ ] Java Collections Framework
- [ ] ArrayList internals
- [ ] LinkedList internals
- [ ] HashMap internals
- [ ] TreeMap internals
- [ ] Comparable and Comparator
- [ ] Custom generic data structures
- [ ] Choosing appropriate collections
- [ ] Performance trade-offs

## Planned Project Structure

```text
java-dsa/
├── .editorconfig
├── .gitattributes
├── .gitignore
├── README.md
├── pom.xml
├── notes/
├── resources/                 # Local course materials
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/gsdevops/dsa/
    │   │       ├── introduction/
    │   │       ├── complexity/
    │   │       ├── arrays/
    │   │       ├── strings/
    │   │       ├── recursion/
    │   │       ├── linkedlist/
    │   │       ├── stack/
    │   │       ├── queue/
    │   │       ├── searching/
    │   │       ├── sorting/
    │   │       ├── hashing/
    │   │       ├── tree/
    │   │       ├── heap/
    │   │       ├── graph/
    │   │       ├── backtracking/
    │   │       └── dynamicprogramming/
    │   └── resources/
    └── test/
        ├── java/
        └── resources/
```

Packages will be created progressively as new concepts are introduced.

## Learning Methodology

1. Understand the problem.
2. Identify the inputs and expected outputs.
3. Develop an initial solution independently.
4. Dry run the solution.
5. Implement the solution in Java.
6. Test normal and edge cases.
7. Analyze time and space complexity.
8. Explore alternative approaches.
9. Optimize where appropriate.
10. Document important observations.
11. Commit meaningful changes to Git.

## Prerequisites

- JDK 25
- Apache Maven
- Git
- Basic Java programming knowledge
- Object-oriented programming fundamentals

## Build Instructions

Compile the project:

```bash
mvn clean compile
```

Build the project:

```bash
mvn clean package
```

Individual programs can be executed through Eclipse or another
compatible Java IDE.

## Engineering Conventions

- UTF-8 character encoding
- LF line endings by default
- CRLF for Windows batch and command scripts
- No unnecessary trailing whitespace
- Final newline in every text file
- Four-space Java indentation
- Meaningful naming conventions
- Conventional Commits
- IDE-independent Maven configuration
- Markdown-first documentation
- No generated artifacts in version control
- No unauthorized redistribution of course materials

## Repository Configuration

| File | Responsibility |
|---|---|
| `.gitignore` | Excludes unwanted files from Git |
| `.gitattributes` | Defines Git file-handling policies |
| `.editorconfig` | Establishes editor formatting conventions |
| `pom.xml` | Defines Maven build configuration |
| `README.md` | Provides project documentation |

## Related Learning Repositories

This repository is part of a broader Java learning initiative.

- [Java Generics](https://github.com/gopesh123-us/java-generics)
- Java Collections Framework (planned)
- Java Problem Solving (planned)
- Java 8 Features (planned)
- Java Streams API (planned)
- Modern Java (planned)
- Java Learning Roadmap (planned)

Each learning repository is independently managed while following
common engineering standards.

## Guiding Principles

> Understand before memorizing.

> Develop the ability to solve unfamiliar problems independently.

> Correctness first, optimization second.

> Learn the internal implementation, not just the API.

> Predict, implement, execute, observe, and reflect.

## Project Status

Currently under active development as part of a structured
Java learning journey.
