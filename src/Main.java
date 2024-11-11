
public class Main {
    /*
       Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

       You may assume that each input would have exactly one solution, and you may not use the same element twice.

       You can return the answer in any order.



       Example 1:

       Input: nums = [2,7,11,15], target = 9
       Output: [0,1]
       Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
       Example 2:

       Input: nums = [3,2,4], target = 6
       Output: [1,2]
       Example 3:

       Input: nums = [3,3], target = 6
       Output: [0,1]
        */
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];

        for ( int i = 0; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){

                if (nums[i] + nums[j] == target){
                    output = new int[] {i , j};
                }

            }


        }

        return output;
    }
    public static void main(String[] args) {
    int[] nums = new int[] {2,7,11,15};
    int target = 9;

    Main trial = new Main();
    int[] case1 = trial.twoSum(nums, target);

    System.out.println(case1[0]+", "+ case1[1]);
    }
}