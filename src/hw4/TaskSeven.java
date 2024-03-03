package hw4;

public class TaskSeven {
    public static void main(String[] args) {

        int[] list = {10, 20, 30, 40, 50};
        int listLength = list.length ;

        for (int i = listLength - 1; i >= 0; i--){ // -1 за да изравним дължината на арея с начина по който се брой в арей
            System.out.println(list[i]);
        }

    }
}
