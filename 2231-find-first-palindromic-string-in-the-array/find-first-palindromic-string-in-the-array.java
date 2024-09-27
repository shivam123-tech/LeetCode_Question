class Solution {
    public String firstPalindrome(String[] words) {
        String s="";
        for(int i=0;i<words.length;i++){
            boolean isPalin=true;
            for(int j=0;j<words[i].length()/2;j++){
                if(words[i].charAt(j) != words[i].charAt(words[i].length()-j-1)){
                    isPalin=false;
                    break;
                }
            }
            if(isPalin){
                s=words[i];
                return s;
            }
        }
        return "";
    }
}