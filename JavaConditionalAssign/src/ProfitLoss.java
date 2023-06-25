import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp;
        int sp;
        System.out.println("Enter the cost price :");
        cp = sc.nextInt();
        System.out.println("Enter the selling price :");
        sp = sc.nextInt();
        int amt;
        if(cp>sp)
        {
            amt = cp - sp;
            System.out.println("loss is :" + amt);
        }
        else if (cp<sp) {
            amt  = sp - cp;
            System.out.println("profit is :" + amt);

        }
        else {
            System.out.println("no profit no loss");
        }
    }
}
