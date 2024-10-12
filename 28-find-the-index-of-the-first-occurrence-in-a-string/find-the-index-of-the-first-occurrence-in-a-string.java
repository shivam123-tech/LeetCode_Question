class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        for(int k=0;k<=m-n;k++){
            if(needle.substring(0).equals(haystack.substring(k,k+n))){
                return k;
            }
        }
        return -1;
    }
}