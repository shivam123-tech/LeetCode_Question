class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
           return "";
    }
        public static boolean isPalindrome(String s){
           for(int i=0;i<s.length()/2;i++){
               if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                   return false;
               }
           }
           return true;
        }
     
}