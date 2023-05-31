/*
Question : Write a program to find for given n lines x-axis, use 2 lines form a container such that it
           holds maximum water.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Enter the size of length container consist");
        int length = scanner.nextInt();
        System.out.println("Enter the height of container");
        for (int start = 0; start < length; start++) {
            int FakeArray = scanner.nextInt();
            array.add(FakeArray);
        }
        int max = 0, count = 0;
        for (int start = 0; start < length; start++) {
            if (max < array.get(start)){
                max = array.get(start);
                count++;
            }
        }

    }
}