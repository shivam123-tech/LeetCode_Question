class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int re=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            re=re*10+r;
        }
        if(re==x){
            return true;
        }
        return false;
    }
}