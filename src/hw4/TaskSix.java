package hw4;



public class TaskSix {
    public static void main(String[] args) {

        int[] list = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};


        for (int j : list) {
            if (j == 150) {
                System.out.println(j + " is reached the loop is stopped");
                break;

            } else if (j % 5 == 0) {
                System.out.println(j);
            }
        }

    }
}
