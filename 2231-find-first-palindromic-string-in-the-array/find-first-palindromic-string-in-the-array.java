class Solution {
    public String firstPalindrome(String[] words) {
        
        for(int i=0;i<words.length;i++){
            boolean isPali=true;
            for(int j=0;j<words[i].length()/2;j++){
                if(words[i].charAt(j)!=words[i].charAt(words[i].length()-1-j)){
                   isPali=false;
                   break;
                }
            }
            if(isPali){
                return words[i];
            }
        }
        return "";
    }
}