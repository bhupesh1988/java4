import java.util.Arrays;

public class SumOfTheArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int sum = Arrays.stream(a).sum();
        System.out.println("The sum is :- " + sum);
    }
}
