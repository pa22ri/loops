public class Pattern
{
    public static void main(String[] args) 
    {
        int n = 5,i,j;
        for(i = 1;i<=5;i++)
        {
            for(j = 1;j<=5;j++)
            {
                if(i==(n+1)/2 && j==(n+1)/2)
                {
                    System.out.print("x");
                }
                else if(i==j)
                {
                    System.out.print("\\");
                }
                else if(i+j == n+1)
                {
                    System.out.print("/");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
