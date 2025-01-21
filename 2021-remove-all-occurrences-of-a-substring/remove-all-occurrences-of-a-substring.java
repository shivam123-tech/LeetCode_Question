class Solution {
    public String removeOccurrences(String s, String part) {
    
        while(s.indexOf(part)!= -1 ){
        int  inx=s.indexOf(part);
       s=s.substring(0,inx)+s.substring(inx+part.length());
      
      }
       return s;
    }
   
}