// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         char st1[]= s1.toCharArray();
//         char st2[]=  s2.toCharArray();
//         for (int i =0;i<st1.length-1;i++){
//             for(int j=0;j<st2.length-1;j++){
//                 if(st1[i]==st2[j]||st1[i]==st2[j-1]){
//                     if(st1[i+1]==st2[j]||st1[i+1]==st2[j+1]||st1[i+1]==st2[j-1]){
//                         return true;
//                     }
//             }
//         }
//     }
//     return false;
// }
// }


class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        if (java.util.Arrays.equals(count1, count2)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            count2[s2.charAt(i) - 'a']++;
            count2[s2.charAt(i - s1.length()) - 'a']--;

            if (java.util.Arrays.equals(count1, count2)) {
                return true;
            }
        }

        return false;
    }
}
