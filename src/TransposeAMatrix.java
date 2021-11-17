public class TransposeAMatrix {

    public static void main(String[] args) {
        int m1[][]={{1,3,},{2,4,},{3,4,}};
        int m2[][]=new int[2][2];
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 2; j++) {
                m2[i][j] = m1[j][i];
            }}
        System.out.println("Printing Matrix without m2:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Printing Matrix After Transpose:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }}}