import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number :");
        num = sc.nextInt();
        if(num<0)
        {
            num = num*-1;

        }
        System.out.println("The absolute value is :" + num);
    }
}
