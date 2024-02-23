public class prime {
    public static void main (String [] args){
    int value_not_prime = 0;
    for (int i = 2; i<100; i++){
        for (int a = 1; a<i; a++){
           if (i%a == 0){
                value_not_prime = 1;               
            }
        }
        if (value_not_prime == 1){ 
            continue;
        }
        else{
            System.out.println(i);
            }
        value_not_prime = 0;
        }
    
}}
