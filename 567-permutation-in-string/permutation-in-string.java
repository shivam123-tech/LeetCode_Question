class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }

        int windsize=s1.length();
        for(int i=0;i<s2.length();i++){
            int windIdx=0; int idx=i;
            int windfreq[] = new int[26];
            
            while(windIdx < windsize && idx<s2.length()){
                windfreq[s2.charAt(idx)-'a']++;
                windIdx++;idx++;
            }
            if(isFreqSame(freq,windfreq)){
                return true;
            }
        }
        return false;
    }

    public static boolean isFreqSame(int f1[],int f2[]){
        for(int i=0;i<26;i++){
            if(f1[i]!=f2[i]){
                return false;
            }
        }
        return true;
    }
}