import java.util.Scanner;

public class SingleLineFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first_name = sc.next();
        String last_name = sc.next();
        int roll_no = sc.nextInt();
        String field_of_interest = sc.nextLine();

        System.out.println("Name :"+ first_name + " " + last_name);
        System.out.println("Roll Number :"+ roll_no);
        System.out.println("Field of interest "+ field_of_interest);


    }
}
