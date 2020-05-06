import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        // Traverse through array elements and 
        // count frequencies 
        //element key count vale
        for(int i =0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]))
            {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            }
            else
            {
                mp.put(nums[i], 1);
            }
            
            
        }
        //checks the condition
        for(int k =0;k<nums.length;k++)
        {
            int m = mp.get(nums[k]);
            if(m > nums.length/2)
            {
                return nums[k];
            }
        }

        return 0;
        
    }
}