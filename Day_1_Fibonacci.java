import java.util.Scanner;
public class Day_1_Fibonacci {
    public static void main(String[] args) {
        int nos1=0,nos2=1,nos,res;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the no of fibonnaci numbers you wanna see");
        nos = scr.nextInt();
        if(nos<=0)
        {
            System.out.println("Invalid Input");
        }
        else if(nos==1)
            System.out.println(nos1);
        else if(nos==2)
        {
            System.out.println(nos1+" "+nos2);
        }
        else{
            System.out.print(nos1+" "+nos2+" ");
            res=0;
            for(int i=0;i<=nos-3;i++)
            {
                res=nos1+nos2;
                System.out.print(res);
                nos1=nos2;
                nos2=res;
            }
        }

    }
}
