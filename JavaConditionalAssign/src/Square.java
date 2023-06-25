import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.println("Enter the length :");
        length = sc.nextInt();
        int breadth;
        System.out.println("Enter the breadth :");
        breadth = sc.nextInt();
        if(length == breadth)
        {
            System.out.println("It is a Square");
        }
        else {
            System.out.println("It is not a square");
        }


    }
}
