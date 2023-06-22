import java.util.Scanner;

public class PercentageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark_1 = sc.nextInt();
        int mark_2 = sc.nextInt();
        int mark_3 = sc.nextInt();
        int totalmarks = mark_1 + mark_2 + mark_3;
        int percentage = (totalmarks/3);
        System.out.println("Total marks : "+ totalmarks);
        System.out.println("percentage : " + percentage + "%");
    }
}
