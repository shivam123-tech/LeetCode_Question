class Solution {
    public int compress(char[] c) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<c.length;i++){
            Integer count=1;
            while(i<c.length-1 && c[i]==c[i+1]){
                count++;
                i++;
            }
            sb.append(c[i]);
            if(count>1){
                sb.append(count.toString());
            }
        }
        String s=sb.toString();
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i);
        }
        return s.length();
    }
}