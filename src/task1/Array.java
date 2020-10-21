package task1;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
            if (array[i] < 0)
                array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}