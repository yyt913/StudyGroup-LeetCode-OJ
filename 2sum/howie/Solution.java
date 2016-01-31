import java.util.*;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0, 0};
        HashMap<Integer, Integer> map = new HashMap();
        int index = 1;
        for (int a : nums) {
            map.put(a, index);
            index++;
        }
        
        index = 1;
        for (int a : nums) {
            Integer another = map.get(target - a);
            if (another  != null && index != another)
                {
                    result[0] = index;
                    result[1] = another;
                    return result;
                }
                index++;
        }
        return result;
    }
}