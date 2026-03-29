//import java.util.*;
class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        int l=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        if(l==set.size())
        {
            return false;
        }
        else
        {
            return true;
        }


        
        
    }
}