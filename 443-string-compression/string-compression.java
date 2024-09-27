class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<chars.length;i++){
            Integer count=1;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            sb.append(chars[i]);
            if(count>1){
                sb.append(count.toString());
            }
        }
          String st= sb.toString();
          for(int i=0;i<st.length();i++){
            chars[i]=st.charAt(i);
          }
              return st.length();
    }

     
}