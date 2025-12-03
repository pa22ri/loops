import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int fact = 1;
        int i;
        for(i=1;i<=n;i++)
        {
            fact *= i;
        }
        System.out.println("Factorial Number : "+fact);
    }
}
