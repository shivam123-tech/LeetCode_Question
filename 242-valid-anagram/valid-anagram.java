class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int count[] = new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int frS=c-97;
            count[frS]++;

            char d=t.charAt(i);
            int frT=d-97;
            count[frT]--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}