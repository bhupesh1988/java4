public class SpecificValues {

    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        int find=6;
        boolean search=false;
        for(int i: array){
            if(i==find){
                search=true;

            }
        }
        if(search) System.out.println(find+" Specific value found");
        else
            System.out.println(find+" Specific value not found");
    }
}
