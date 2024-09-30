class Solution {
    public int strStr(String haystack, String needle) {
        // if(haystack.length()==needle.length()){
        //     return 0;
        // }
        int n=needle.length();
        for(int i=0;i<=haystack.length()-n;i++){
            if(needle.substring(0,n).equals(haystack.substring(i,i+n))){
                return i;
            }
        }
        return -1;
    }
}