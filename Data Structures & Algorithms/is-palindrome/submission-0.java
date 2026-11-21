
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        s = s.toLowerCase();
        char[] letters = s.toCharArray();

        while(start < end) {

            if(!Character.isLetterOrDigit(letters[start])) {
                start++;
            }
            else if(!Character.isLetterOrDigit(letters[end])) {
                end--;
            }
            else if(letters[start] != letters[end]) {
                return false;
            }
            else {
                start++;
                end--;
            }
        }
        return true;
    }
}
