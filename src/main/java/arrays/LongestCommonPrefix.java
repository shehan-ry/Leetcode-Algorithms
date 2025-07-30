package arrays;

//Problem : 14. Longest Common Prefix
//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
//Link : https://leetcode.com/problems/longest-common-prefix/description/?envType=problem-list-v2&envId=array

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix sol = new LongestCommonPrefix();

        String[] input1 = {"flower", "flow", "flight"};
        String[] input2 = {"dog", "racecar", "car"};

        System.out.println("Result 1: " + sol.longestCommonPrefix(input1));
        System.out.println("Result 2: " + sol.longestCommonPrefix(input2));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }

            }
        }

        return prefix;
    }
}
