import java.util.*;
public class Day9_17_CheckAlternateSignInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the element of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<n-1;i++){
            if((a[i]*a[i+1])>=0){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("No");
        }
        else
        System.out.println("Yes");
    }
    
}
