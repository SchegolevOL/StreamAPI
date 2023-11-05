package task1;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.IntStream;

interface MirrorNumbers{
    boolean search(int num);
}
public class App {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            Random rnd = new Random();
            array[i]= rnd.nextInt(2000)-1000;
        }
        printArray(array);
        long countPositive = Arrays.stream(array).filter(n->n>0).count();
        System.out.println("The number of positive: "+countPositive);
        long countNegative = Arrays.stream(array).filter(n->n>0).count();
        System.out.println("The number of negative: "+countNegative);
        long countTwoDigit = Arrays.stream(array).filter(n->(n>9&&n<100)||(n<-9&&n>-100)).count();
        System.out.println("The number of two-digit: "+countTwoDigit);
        Predicate<Integer> mirrorNumbers=(n)->{
            String str=Integer.toString(n);
            return IntStream.range(0, str.length() / 2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
        };
        long countMirrorNumbers = Arrays.stream(array).filter(n->mirrorNumbers.test(n)).count();
        System.out.println("The number of mirror numbers: "+countMirrorNumbers);

    }

    public static void printArray(int []arr){
        System.out.print("| ");
        for (int item:
             arr) {
            System.out.print(item+" | ");
        }
        System.out.println();
    }
}
