public class while_pattern {
    public static void main(String[] args) {
        int i = 0;
        int j;
        while (i<10){
            i++;
            j=0;
            while (j<10){
                j++;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
