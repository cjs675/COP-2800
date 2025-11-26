# max subarray sum 

- write program that creates an array and implements an algo to determine __max subarray__ sum 
of a list of numbers entered by the user 
- classic dynamic programming problem 

- __goal__
  -write java program that finds max sum of a contiguous subarray within a one-dimensional numeric array

- __requirements__ 
  - input 
    - prompt user to enter size of array + elements 
    - example input 
      ```
      Enter size of the array: 6
      Enter the elements of the array: -2, 1, -3, 4, -1, 2, 1, -5, 4
      ```
  - output 
    - max subset sum + starting and ending indices that produce the sum 
    - example output
    ```
    Maximum Subarray Sum: 6
    Subarray: [4, -1, 2, 1]
    Indices: Start = 3, End = 6
    ``` 
  - note: program has to try and find contiguous subarray of entries of whatever length 
          that adds up to the highest value that exists 

- __code structure:__ 
  - create main class: __MaxSubarraySum__
  - add class called __Result__ that has 3 values: 
    - start index 
    - end index 
    - sum 
  - include method __findMaxSubarraySum__ that accepts an array and returns a Result object with the 
    maximum sum and indices filled in 
  - in __main__ method: 
    - handle user input 
    - call __findMaxSubarraySum__ method 
    - display output it returns
    - should allow user to enter values
      - also have >= 2 hard-coded examples & passed to the function 
      - comment specifying what the expected answer should be for each of them 
- code should be appropriately commented with __Javadoc__ 
- __two deliverables__ 
  - .java source file containing: 
    - main function 
    - findMaxSubarray functions  
  - generate javadoc info, turn in screenshot showing your __name__ in one of comments 