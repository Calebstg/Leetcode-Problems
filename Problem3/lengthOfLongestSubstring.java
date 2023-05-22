/* Author: Caleb St.Germain
 * Date: 5/22/2023
 */
import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        //Creating a set to store unique characters
        Set<Character> uniqueChars = new HashSet<>();

        //Initializing the pointers and the maximum length
        int left = 0;
        int right = 0;
        int maxLength = 0;

        //Move the right pointer in order to expand the window
        while (right < s.length()){
            if(!uniqueChars.contains(s.charAt(right))){
                uniqueChars.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                //Move right pointer
                right++;
            }else{
                uniqueChars.remove(s.charAt(left));
                //Move left pointer
                left++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}