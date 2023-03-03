import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = randomInt(0, 2001);
        System.out.println("Случайное целое число: " + i);
        System.out.println("Число " + i + " в двоичном представлении: " + Integer.toBinaryString(i));
        int n = highBitNumber(i);
        System.out.println("Номер старшего значащего бита числа " + i + ": " + n);
        int[] m1 = multiples(n, i, Short.MAX_VALUE);
        int[] m2 = noMultiples(n, Short.MIN_VALUE, i);
    }

    static int randomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }

    static int highBitNumber(int number) {
        return Integer.toBinaryString(number).length();
    }

    static int[] multiples(int divider, int min, int max) {
        int size = 0;
        for (int i = min; i < max; i++) {
            if (i % divider == 0)
                size++;
        }
        int[] multiples = new int[size];
        int index = 0;
        for (int i = min; i < max; i++) {
            if (i % divider == 0)
                multiples[index++] = i;
        }
        return multiples;
    }

    static int[] noMultiples(int divider, int min, int max) {
        int size = 0;
        for (int i = min; i < max; i++) {
            if (i % divider != 0)
                size++;
        }
        int[] noMultiples = new int[size];
        int index = 0;
        for (int i = min; i < max; i++) {
            if (i % divider != 0)
                noMultiples[index++] = i;
        }
        return noMultiples;
    }
}