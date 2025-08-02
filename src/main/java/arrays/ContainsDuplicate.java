package arrays;

//Problem : 217. Contains Duplicate
//Given an integer array nums, return true if any value appears at least twice in the array,
//and return false if every element is distinct.
//Link : https://leetcode.com/problems/contains-duplicate/description/?envType=problem-list-v2&envId=array

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
