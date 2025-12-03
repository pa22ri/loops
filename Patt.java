import java.util.Scanner;

public class Patt {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        int a;
        for(i=1;i<=n;i++)
        {
            a = i;
            for(j=1;j<=i;j++)
            {
               System.out.print(a+" ");
               a += (n-j); 
            }
            System.out.println("");
        }
    }
}
