import java.util.*;
class Solution {
    public static int lengthOfLastWord(String s) {
        int len = s.length();
        int count = 0;
        for(int i = len -1; i >= 0; i--){
            if(s.charAt(i) == ' ' & count > 0){
                break;
            }else if(s.charAt(i)==' '){
                continue;
            }else{
                count++;
            }
        }
        return count;
    }
}
public class _58_length_of_last_word{
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the String of which last word you want to count");
        String s = ss.nextLine();
        int number = Solution.lengthOfLastWord(s);
        System.out.println(number);
    }
}