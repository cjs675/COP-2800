import  java.util.Arrays;

/*
 * Module 7 - Max Subarray Sum
 * COP-2800
 */

/**
 * @author Chris Silva
 * <p>
 * This program generates the maximum sum of a contiguous subarray from a user-defined
 * array using Kadane's Algorithm.
 * </p>
 */
public class MaxSubarraySum
{
    /**
     * Stores the starting index, ending index and max sum of the contiguous subarray within
     * an original array.
     */
    public static class Result
    {
        /** Starting index of the max subarray */
        public int startIdx;
        /** Ending index of the max subarray */
        public int endIdx;
        /** Max sum of the contiguous subarray */
        public int maxSum;

        /** Parameterized constructor which accepts values
         * for all fields to create a Result object.
         *
         * @param startIdx starting index of the max. subarray
         * @param endIdx ending index of the max. subarray
         * @param maxSum max. sum of the contiguous subarray
         */
        public Result(int startIdx, int endIdx, int maxSum)
        {
            this.startIdx = startIdx;
            this.endIdx = endIdx;
            this.maxSum = maxSum;
        }

        /**
         * Returns the maximum contiguous subarray using Kadane's Algorithm,
         * which runs in O(n) time and uses O(1) space.
         *
         * @param inputArray array of integers expected as input
         * @return the resulting subarray containing the max sum with its beginning
         *         and ending indices
         * @throws IllegalArgumentException if the entered array is empty
         *
         */
        public static Result findMaxSubarraySum(int[] inputArray)
        {
            if (inputArray == null || inputArray.length == 0)
            {
                throw new IllegalArgumentException(("Input cannot be empty"));
            }

            int currentSum = inputArray[0];
            int maxSum = inputArray[0];
            int currentStart = 0;
            int maxStartIdx = 0;
            int maxEndIdx = 0;

            for (int i = 1; i < inputArray.length; i++)
            {
                /**
                 * Checks whether the combined sum of the current subarray
                 * is higher than the value of the element at the current index.
                 *  If greater than or equal to the final element, the subarray is extended.
                 *  If the combined subarray's value is less than the current element,
                 *  the existing subarray is discarded, and the current subarray
                 *  now begins with the element at the current index.
                 */
                if (currentSum + inputArray[i] < inputArray[i])
                {
                        currentSum = inputArray[i];
                        currentStart = i;
                }
                else {
                    currentSum += inputArray[i];
                }

                if (currentSum > maxSum)
                {
                    maxSum = currentSum;
                    maxStartIdx = currentStart;
                    maxEndIdx = i;
                }
            }
            return new Result(maxStartIdx, maxEndIdx, maxSum);
        }
    }

    /** Returns the max subarray from the original array using the start & end indices
     * stored in the given result.
     *
     * @param original the original input array
     * @param r the result containing the start and end indices of the subarray
     * @return a subarray containing the elements from the original array
     *
     */
    private static int[] buildSubarray(int[] original, Result r)
    {
        int length = r.endIdx - r.startIdx + 1;
        int[] maxSubArray = new int[length];
        for (int i = 0; i < length; i++)
        {
            maxSubArray[i] = original[r.startIdx + i];
        }
        return  maxSubArray;
    }

    /**
     * Handles user input and included hard-coded examples,
     *          returning the resulting highest value subarray
     *          of contiguous values from the original array.
     *
     * @param args array of command line arguments to be passed into the main function
     */
    public static void main(String[] args)
    {
       java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("\nPlease enter the size of the array: \n");
        int arraySize = scanner.nextInt();
        scanner.nextLine();

        int[] inputArray = new int[arraySize];
        System.out.println("\nPlease enter the elements of the array (separated by a space) ");

        for (int i = 0; i < arraySize; i++)
        {
            inputArray[i] = scanner.nextInt();
        }


        // Returning output from user-submitted array
        Result userResult = Result.findMaxSubarraySum(inputArray);
        int[] userMax = buildSubarray(inputArray, userResult);
        System.out.println("\nMax Subarray Sum: " + userResult.maxSum);
        System.out.println("\nMax contiguous subarray: " + Arrays.toString(userMax));
        System.out.println("Indices: \n\nStart = " + userResult.startIdx + "\nEnd = " + userResult.endIdx);

        // Hard-coded example #1
        // Expected sum = 16
        // Original Array = [-2, 1, 5, 10]
        // Subarray = [1, 5, 10]
        // Indices: 1..3
        int[] firstArray = { -2, 1, 5, 10 };
        Result s1 = Result.findMaxSubarraySum(firstArray);
        int[] firstMax = buildSubarray(firstArray, s1);
        System.out.println("\nExample 1: \nMax Subarray Sum: " + s1.maxSum);
        System.out.println("Original Array: " + Arrays.toString(firstArray));
        System.out.println("\nMaximum Contiguous subarray: " + Arrays.toString(firstMax));
        System.out.println("Indices: \n\nStart = " + s1.startIdx + "\nEnd = " + s1.endIdx);

        // Hard-coded example #2
        // Expected sum = -1
        // Original Array = [-5, 3, 7, -12, 6, 0]
        // Subarray = [3, 7]
        // Indices: 1..2
        int[] secondArray = { -5, -3, 7, -12, 6, 0 };
        Result s2 = Result.findMaxSubarraySum(secondArray);
        int[] secondMax = buildSubarray(secondArray, s2);
        System.out.println("\nExample 2: \nMax Subarray Sum: " + s2.maxSum);
        System.out.println("Original Array: " + Arrays.toString(secondArray));
        System.out.println("\nMaximum Contiguous subarray: " + Arrays.toString(secondMax));
        System.out.println("Indices: \n\nStart = " + s2.startIdx + "\nEnd = " + s2.endIdx);
    }


}
