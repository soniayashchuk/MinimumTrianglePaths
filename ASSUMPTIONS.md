## Assumptions

Details any assumptions made during implementation, the
reasons these assumptions made and why they were justified.

#### Input validation

Since its mentioned that input data is triangle, its important to validate if input match this requirement. 
To do that, I will check that each successive line has one more element than the previous one.

#### Algorithms 

Task could be solved using bottom-up approach in dynamic programming.
Lets say that dp[i] - represents minimum path summation at position triangle[i][j].
So while computing dp[i] could be counted as 
```
triangle[i][j] + min( previous dp[j], previous dp[j - 1])
```
For example, we have triangle:
```
     7
  6    3
 3   8   5
11  2  10  9
```
On the first iteration we are going to have:
[11, 2, 10, 9]

During the second one:
```
[3+min(11,2), 8 + min(2, 10), 5 + min(10, 9)] = [5, 10, 14]
```
Second and third iteration:
```
[6 + min(5, 10), 3 + min(10, 14)] = [11, 13]
[7 + min(11, 13)] = 18
```
So the result is: 18.

This approach would have:
```
time complexity: O(N)
        N is the height of triangle
        all element are visited once
space complexity: O(N)
        N is the height of triangle
        Create array which size is equals to the length of the last row in triangle
```