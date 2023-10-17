class Solution {
    public String capitalizeTitle(String title) {
      title=  title.toLowerCase();
        String word[] = title.split(" ");
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<word.length;i++){
            if(word[i].length()<3){
                sb.append(word[i]+" ");
            }
            else{
               char c= word[i].charAt(0);
              c= Character.toUpperCase(c);
              sb.append(c+word[i].substring(1)+" ");
            }
        }
      return sb.toString().trim();
    }
}