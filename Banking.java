
import java.util.Scanner;

public class Banking {
    public   int bank(int balance, int withdrawl){
        if(withdrawl > balance){
            System.out.println("incompletion Transation"); 
        }
        else{
            balance = balance - withdrawl;
            System.out.println("complete Transation");
        }
        return  balance;
      
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Balance: ");
        int a= sc.nextInt();
        System.out.println("Account balance: "+ a);
        System.out.println("Enter Your Withdrawl: ");
        int c = sc .nextInt();
        System.out.println("Withdrawl Amount: "+c);
        Banking b = new Banking();
        int d =  b.bank(a , c);
        System.out.println("Bank Balance: "+d);
        sc.close();
    }
    
}
