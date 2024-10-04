class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        double half=myPow(x,(int)(N/2));
        double halfSq= half*half;

       if(N%2!=0){
        halfSq=x*halfSq;
       }
       return halfSq;
    }
}