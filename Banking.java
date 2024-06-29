
import java.util.Scanner;

public class Banking {
    public static int bank(int balance, int withdrawl){
        return balance - withdrawl ;
      
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Account balance: "+ a);
        int c = sc .nextInt();
        System.out.println("Withdrawl Amount: "+c);
         int f=  bank(a , c);
        System.out.println("Bank Balance: "+f);
        if(a > c){
            System.out.println("completion Transation"); 
        }
        else{
            System.out.println("Incomplete Transation");
        }
         
        

        
    }
    
}
