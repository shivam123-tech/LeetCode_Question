class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String s[] = title.split(" ");
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length;i++){
            if(s[i].length()<3){
              sb.append(s[i]+" ");
            }else{
                char c = s[i].charAt(0);
                c=Character.toUpperCase(c);
                sb.append(c+s[i].substring(1)+" ");
            }
        }
        return sb.toString().trim();
    }
}