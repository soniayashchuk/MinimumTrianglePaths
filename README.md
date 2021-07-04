# Minimum Triangle Paths

Solution for finding minimum path in the triangle.
Task:

*Write a command-line program that reads a text-format triangle from standard input and outputs a minimal path to the standard-
output as follows:*
```
$ cat << EOF | scala MinTrianglePaths*
> 7
> 6 3
> 3 8 5
> 11 2 10 9
> EOF
> Minimal path is: 7 + 6 + 3 + 2 = 18*
```
---
#### About solution:
Check [assumptions](https://github.com/soniayashchuk/MinimumTrianglePaths/blob/main/ASSUMPTIONS.md) for more understanding of algorithms. 

---

##### Pre-requirements:

You need to have scala and sbt on your local machine. 

##### Run:
To run the program, clone repository and use next command:
```
sbt run
```