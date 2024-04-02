package Practice_Project_L4;
import java.util.*;

public class LongestIncreasingSubsequence 
{
    public static List<Integer> findLongestIncreasingSubsequence(List<Integer> nums) 
    {
        if (nums == null || nums.isEmpty())
        {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) 
        {
            List<Integer> currentSubsequence = new ArrayList<>();
            currentSubsequence.add(nums.get(i));
            for (int j = i + 1; j < nums.size(); j++) 
            {
                if (nums.get(j) > currentSubsequence.get(currentSubsequence.size() - 1)) 
                {
                    currentSubsequence.add(nums.get(j));
                }
            }
            if (currentSubsequence.size() > result.size()) 
            {
                result = currentSubsequence;
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        List<Integer> longestIncreasingSubsequence = findLongestIncreasingSubsequence(nums);
        System.out.println("Longest Increasing Subsequence: " + longestIncreasingSubsequence);
    }
}
