public class SwapOfTwoNo {
    public static void main(String[] args) {
        int x=2;
        int y =3;
        System.out.println("before swapping value of x is : "+ x);
        System.out.println("before swapping value of y is : "+ y);
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("after swapping value of x is : "+ x);
        System.out.println("after swapping value of y is : "+ y);
    }
}
