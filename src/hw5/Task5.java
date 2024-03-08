package hw5;

import java.util.LinkedList;
// Not mine still trying to understand!!
public class Task5 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        System.out.println("Original LinkedList: " + list);

        reverseLinkedList(list);

        System.out.println("Reversed LinkedList: " + list);

    }

    public static void reverseLinkedList(LinkedList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {

            int temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
    }
}
