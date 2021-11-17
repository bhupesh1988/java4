public class AscendingOrder {

    public static void main(String[] args) {
        int [] array = new int [] {2,7,9,7,5,};
        int a = 0;

        System.out.print("Enter array:- ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }}}
        System.out.println();
        System.out.print("array value in ascending order:-  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");}}}

