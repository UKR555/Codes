class Solution {
    public int maxVowels(String s, int k) {
        int maxvowels =0;
        int windowsvowels=0;
        Set<Character> vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for(int i=0;i<k;i++){
            if(vowels.contains(s.charAt(i))){
                windowsvowels++;
            }
        }
        maxvowels=windowsvowels;

        for(int i=k;i<s.length();i++){
            if(vowels.contains(s.charAt(i-k))){
                windowsvowels--;
            }
            if(vowels.contains(s.charAt(i))){
                windowsvowels++;
            }

            maxvowels=Math.max(maxvowels,windowsvowels);
        }

        return maxvowels;
        
    }
}