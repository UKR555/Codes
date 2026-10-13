// class Solution {
//     public String longestPalindrome(String s) {
//         int left =0 ;
//         int right =0;
//         StringBuffer str = new StringBuffer();
//         char [ ] S = s.toCharArray();
//         while(left<right){
//             int count = 0;
//             if (S[left] == S[right]){
//                 count+=1;
//                 str.append(S[left]+S[right]);
//             }else if(S[left]!=S[right]) {
//                 left++;
//             }else{
//                 right--;
//             }
//         }
//         return new String(str);
//     }
// }


class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindrome, e.g. "aba"
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            if (right - left - 1 > maxLength) {
                maxLength = right - left - 1;
                start = left + 1;
            }

            // Even-length palindrome, e.g. "abba"
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            if (right - left - 1 > maxLength) {
                maxLength = right - left - 1;
                start = left + 1;
            }
        }

        return s.substring(start, start + maxLength);
    }
}
