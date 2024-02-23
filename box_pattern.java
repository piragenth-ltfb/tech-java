public class box_pattern {
    public static void main(String[] args) {
        int i;
        int max_row = 10;
        int max_cols = 10;
        for (i=1;i<=max_row;i++){
            for (int j = 1; j<=max_cols; j++){
                if (i == 1 || max_row == i){
                    System.out.print("* ");
                } else {
                    if (j == 1 || max_cols == j){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
}}}
            System.out.println();
}}}
