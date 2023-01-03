import java.util.Scanner;

public class Day2_prime {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Please Enter the number");
        int  nos = scr.nextInt();
        //Declaration of flag inorder to know number is prime
        int flag=0;
        if(nos==0||nos==1)
            System.out.println(nos+" is not a prime number");
        for(int i=2;i<nos;i++)
        {
            if(nos%i==0)
            {
                System.out.println(nos+"is not a prime number");
                flag=1;
            }
        }
        if(flag==0)
            System.out.println(nos+" is a prime number");
    }
}
