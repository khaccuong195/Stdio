import java.util.Scanner;

public class Array_2 {
    public static void main(String[] agrs)
    {
        int s=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao so dong va so cot");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int A[][]=new int[m][n];
        System.out.println("nhap phan tu vao mang");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("xuat mang:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                s+=A[i][j];
            }
        }
        System.out.println("tong= "+s+"\n");
    }

}
