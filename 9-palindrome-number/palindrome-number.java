class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int rem=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            rem=rem*10+r;
        }
        if(rem==x){
            return true;
        }
        return false;
    }
}