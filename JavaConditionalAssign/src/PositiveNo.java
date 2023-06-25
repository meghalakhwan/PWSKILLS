import java.util.Scanner;

public class PositiveNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the Number : ");
        num=sc.nextInt();
        if(num>=0)
        {
            System.out.print("You entered a positive number");
        }else{
            System.out.print("You number is negative and is skipped");
        }
    }
}
