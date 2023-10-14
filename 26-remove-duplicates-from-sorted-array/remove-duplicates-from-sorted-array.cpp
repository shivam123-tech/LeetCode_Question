class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        

        set<int>st;

        for(int i = 0 ; i< nums.size() ; i++)
        {
            st.insert(nums[i]);
        }

        vector<int> vc(st.begin(), st.end());

      for(int i = 0 ; i < vc.size() ; i++)
      {
          nums[i] = vc[i];
      }

      return vc.size();

       

    }
};