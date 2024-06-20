import java.util.*;

public class _2089_find_target_indices_after_sorting_array {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the length of the array :");
    int n = s.nextInt();
    int[] arr = new int[n];
    for(int i =0; i<n; i++){
      arr[i] = s.nextInt();
    }
    System.out.println("enter the target number :");
    int target = s.nextInt();
    System.out.println(Solution.targetIndices(arr,target));
    s.close();

  }
}

class Solution {
  public static List<Integer> targetIndices(int[] nums, int target) {
      List<Integer> x = new ArrayList<Integer>();
      Arrays.sort(nums);
      for(int i = 0; i < nums.length; i++){
          if(nums[i] == target){
              x.add(i);
          }
      }
      return x;
  }
}