package hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciBase {

    public static void main(String[] args) {
        long[] mass = new long[10000000];
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        List<Byte> listNumbers = new ArrayList<>();
        int len = 0;
        mass[0] = 0;
        mass[1] = 1;
        int index = 2;
        while (mass[index] <= N) {
            mass[index] = mass[index - 1] + mass[index - 2];

            if (mass[index] > N) {
                len = index - 1;
                break;
            }
            index++;
        }
        int temp = 0;

        while (N != 0) {
            if (mass[len - temp] <= N) {
                N -= mass[len - temp];
                listNumbers.add((byte) 1);
                temp += 2;
                if (N != 0) {
                    listNumbers.add((byte) 0);
                } else {
                    for (int j = 0; j < len - temp; j++) {
                        listNumbers.add((byte) 0);
                    }
                    break;
                }
                if (len - temp < 0) {
                    break;
                }
            } else {
                listNumbers.add((byte) 0);
                temp += 1;
            }
        }
        for (Byte tempPrint : listNumbers) {
            System.out.println(tempPrint);
        }
    }
}