package lesson7;

import java.util.Arrays;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String str1 = "Cat";
        String str2 = "Cat";
        String str3 = new String("Cat");

//        System.out.println("str1 == str2: " + (str1 == str2));
//        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 == str2: " + str1.equals(str2));
        System.out.println("str1 == str3: " + Objects.equals(str1, str3));

        final int[] testArray = {1, 1, 1, 1, 1, 1};
//        testLinkArray(testArray);
        testLinkArray(testArray.clone());
        int[] copyArr = new int[testArray.length];
        System.arraycopy(testArray, 0, copyArr, 0, testArray.length);
//        testLinkArray(testArray.clone());
        testLinkArray(Arrays.copyOf(testArray, testArray.length));
        testLinkArray(copyArr);
        System.out.println(Arrays.toString(testArray));
    }

    private static void testLinkArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
