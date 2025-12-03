import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Number : "+n);
        int rmp;
        int rev = 0;
        int tmp = n;
        while(tmp!=0)
        {
            rmp = tmp % 10;
            rev = (rev*10)+rmp;
            tmp = tmp / 10;
        }
        System.out.println("Reverse Number : "+rev);
    }
}
