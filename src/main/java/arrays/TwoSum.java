package arrays;

// Problem: Two Sum (LeetCode #1)
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
// Link : https://leetcode.com/problems/two-sum/description/

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5};
        int target = 8;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Indexes : [" + result[0] + "," + result[1] + "]");
    }

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if (map.containsKey(complement)) {
                return new int[]{
                        map.get(complement), i
                };
            }

            map.put(numbers[i], i);
        }

        return new int[]{};
    }
}

