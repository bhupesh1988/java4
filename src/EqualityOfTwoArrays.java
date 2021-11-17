import java.util.Arrays;

public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        int [][] arrays1 = {{18, 22},
                {32, 43},
                {-02,22}};
        int [][] arrays2 = {{18, 22},
                {32, 43},
                {-01, 22}};
        System.out.println("your statement is = "+Arrays.deepEquals(arrays1, arrays2));
    }}

