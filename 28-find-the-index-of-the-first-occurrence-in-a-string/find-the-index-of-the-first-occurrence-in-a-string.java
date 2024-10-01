class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        for(int i=0;i<=m-n;i++){
            if(needle.substring(0).equals(haystack.substring(i,i+n))){
                return i;
            }
        }
        return -1;
    }
}