package hw1;

import java.util.Scanner;

public class Searcher {

    private long rank;
    private int searchPos = 9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        long ans = new Searcher().getNumber(k + 1);
        System.out.println(ans);
    }

    public long getNumber(long position) {
        int a = 1;
        long temp = searchPos;
        long p = 1;
        rank = 10;
        while (position % temp < position && (double) position / temp > 1) {
            position -= temp;
            a = a + 1;
            temp = (long) searchPos * (a) * (p *= rank);
        }
        return calcValue(a, position, temp);
    }

    private long calcValue(int a, long positionValue, long temp) {
        if (a == 1) {
            return positionValue;
        }
        temp /= 9;
        if (positionValue % a == 1) {
            return positionValue / temp + 1;
        }
        positionValue %= temp;
        temp /= rank;
        for (int i = 2; i < a; i++) {
            if (positionValue % a == i) {
                return (positionValue / temp);
            }
            positionValue %= temp;
            temp /= rank;
        }
        if (positionValue % a == 0) {
            return (positionValue / a) - 1;
        }
        return 0;
    }
}