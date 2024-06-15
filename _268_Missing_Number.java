import java.util.*;
class Solution {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        
        for(int i = 0 ; i < len; i++){
            if(i !=  nums[i]){
                return i;
            }else if(i==len-1){
                return len;
            }

        }
        return 0;

    }
}
public class _268_Missing_Number{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums  = new int[n];
        for(int i =0; i < n; i++){
            nums[i] = s.nextInt();
        }  

        System.out.println(Solution.missingNumber(nums));
       
    }
}