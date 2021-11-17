public class CountTotalNumberOfA {
    public static void main(String[] args) {
        String personal = "bhupesh kumar patel";
        int conut = 0;
        int i = 0;
        while (i <personal.length()) {
            if (personal.charAt(i) == 'a'){
                conut++;}{
                i++;}}
        System.out.println("Total number of a:- " + conut + " times");}}
