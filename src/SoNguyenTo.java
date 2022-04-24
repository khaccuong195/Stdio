import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] agrs)
    {
        int n;
        int status = 1;
        int num = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n ");
        n = scanner.nextInt();
        if (n >= 1)
        {
            System.out.println(n+" so nguyen to :");
            System.out.print(2+"\t");
        }
        for ( int i = 2 ; i <=n ;num++ )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.print(num+"\t");
                i++;
            }
            status = 1;
        }
    }

}
