public class prime{
    public static void main (String args[]){
        int value_not_prime=0;
        for (int i = 1;i < 1000000000; i++){
            for (int j = 2; j<i; j++){
                if (i/2 <= j){
                    break;
                }
                if (i%j == 0){
                    value_not_prime =1;
                    break;
                }
            }
            if (value_not_prime==0){
                System.out.println(i);
            }
            value_not_prime = 0;
        } 
    }
}