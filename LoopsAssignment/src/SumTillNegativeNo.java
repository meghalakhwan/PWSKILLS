
import java.util.Scanner;
public class SumTillNegativeNo {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int sum = 0;
            while(scn.hasNextInt()){
                int num = scn.nextInt();
                if(num >= 0){
                    sum += num;
                }
                else{
                    sum = -1;
                    break;
                }
            }
            System.out.print(sum);
        }
    }

