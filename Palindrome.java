import java.util.Scanner;
public class Palindrome {
    public static void main(String args[])
    {
        int n,r,temp,sum=0;
        temp=n;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(sum==temp)
        {
         System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
     }
    
}
