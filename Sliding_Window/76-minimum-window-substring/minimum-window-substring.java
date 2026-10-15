// class Solution {
//     public String minWindow(String s, String t) {
//         int maps[]= new int[256];
//         int mapt[]=new int[256];

//         for(char ch:t.toCharArray())mapt[ch]++;

//         int left=0,right = 0, minlen=Integer.MAX_VALUE, minstart=0;

//         for(;right<s.length();right++){
//             maps[s.charAt(right)]++;
//             while(contains(mapt,maps)){
//                 if(right-left+1<minlen){
//                     minlen=right-left+1;
//                     minstart= left;
//                 }
//                 maps[s.charAt(left++)]--;
//             }
//         }
//        return minlen == Integer.MAX_VALUE
//         ? ""
//         : s.substring(minstart, minstart + minlen);
//     }
//     private boolean contains(int[]maps,int[]mapt){
//         for(int i=0;i<256;i++)
//             if(mapt[i]>maps[i])
//                 return false;
//         return true;
//     }
// }

class Solution {
    public String minWindow(String s, String t) {
        int[] maps = new int[256];
        int[] mapt = new int[256];

        for (char ch : t.toCharArray()) {
            mapt[ch]++;
        }

        int left = 0, minlen = Integer.MAX_VALUE, minstart = 0;

        for (int right = 0; right < s.length(); right++) {
            maps[s.charAt(right)]++;

            while (contains(maps, mapt)) {
                if (right - left + 1 < minlen) {
                    minlen = right - left + 1;
                    minstart = left;
                }

                maps[s.charAt(left)]--;
                left++;
            }
        }

        return minlen == Integer.MAX_VALUE
                ? ""
                : s.substring(minstart, minstart + minlen);
    }

    private boolean contains(int[] maps, int[] mapt) {
        for (int i = 0; i < 256; i++) {
            if (maps[i] < mapt[i]) {
                return false;
            }
        }
        return true;
    }
}