class Solution {
    public List<String> validStrings(int n) {
        List<String> s = new ArrayList<String>();

        valid(n,1,"",s);
        return s;
    }
    public void valid(int n,int lP,String sb,List<String> s){
        if(n==0){
            s.add(sb);
            return ;
        }
    
        valid(n-1,1,sb+"1",s);
        if(lP==1){
        
            valid(n-1,0,sb+"0",s);
        }
    }
}