class Solution {
    public int characterReplacement(String s, int k) {
       int freq[]= new int[26];
        int left=0;
        int maxfreq=0;
        int maxwindow=0;
        for(int i=0;i<s.length();i++){
            //update the freq of the current character 
            freq[s.charAt(i)-'A']++;
            maxfreq = Math.max(maxfreq,freq[s.charAt(i)-'A']);

            int windowsize = i- left+1;

            if(windowsize-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;

            }

            windowsize=i-left+1;
            maxwindow = Math.max(maxwindow,windowsize);
        }

        return maxwindow;
    }
}