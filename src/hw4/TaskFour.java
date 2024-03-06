package hw4;

public class TaskFour {
    public static void main(String[] args) {

        /* Whit goggle and gemini help*/

        int[] nums = {30, 42, 7, 103, 11, 69};
        int setLargest = nums[0]; // selecting the first number in the array for the largest

        for (int i = 1; i < nums.length; i++){
            if (nums[i] > setLargest){
                setLargest = nums[i];  // updating the largest num if there is a bigger one from the initial

            }

        }

        System.out.println(setLargest);
    }
}
