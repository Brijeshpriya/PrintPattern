 import java.util.*;
public class PrimeOrNot{
    public static void main(String args[]){
        Scanner sc  =new Scanner(System.in);
        int a=sc.nextInt();
        boolean prime=true; 
        for(int i=2;i<a;i++){
            if(a%i==0){
                 prime =false;
            }
        }
        if(prime==true){
            System.out.println("Number is prime.");
        }else{
            System.out.println("Not prime.");
        }
    }
}