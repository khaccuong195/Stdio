import java.util.Scanner;

public class Arrayy {
    public static void main(String [] agrs)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap size cua mang");
        int n=sc.nextInt();
        int[] a= new int[n];
        int s=0;
        System.out.println("nhap vao mang");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("day so chan");
        for (int i=0;i<n;i++){
            if (a[i]%2==0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println(" ");
        System.out.println("day so le");
        for (int i=0;i<n;i++){
        if (a[i]%2!=0){
            System.out.print(a[i]+" ");
        }
    }
        for (int i=0;i<n;i++){
           s +=a[i];
        }
        System.out.println(" ");
        System.out.println("s = "+s);
        int max=a[0];
        int min=a[0];
        for (int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }

        System.out.println("max:"+max);
        for (int i=0;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
        }

        System.out.println("min:"+min);
        System.out.println("sap xep tang dan");
        for (int i=0;i<n;i++){
            for (int j=i+1;j<=n-1;j++){
              if (a[i]>a[j]) {
                int temp = a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
            }
        }
        for (int i=0;i<n;i++){

                System.out.print(a[i]+" ");

        }

        for (int i=0;i<n;i++){
            for (int j=i+1;j<=n-1;j++){
                if (a[i]<a[j]) {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("sap xep giam dan");
        for (int i=0;i<n;i++){

            System.out.print(a[i]+" ");

        }
    }

}
