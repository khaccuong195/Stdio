import java.util.Scanner;

public class baitap1 {

    public static void main(String[] agrs)
    {
        double delta;
        double x1;
        double x2;
        System.out.println("nhap a b");
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextFloat();
        /*if (a==b){
            System.out.println("a va b bang nhau");
        } else {
            System.out.println("a va b khong bang nhau");
        }
        System.out.println((a==b)?"bang nhau":"khong bang nha");

        if(a==0&b==0){
            System.out.println("phuong trinh vo so nghiem");
        }else if (a==0&b!=0){
            System.out.println("phuong trinh vo nghiem");
        }else {
            System.out.println(-b/a);
        }

        System.out.println((a==0&&b==0)?"phuong trinh vo nghiem":((a==0&&b!=0)?"phuong trinh vo nghiem ":((-b)/a)+""));*/
         delta=(b*b)-(4*a*c);
        if (delta<0){
            System.out.println("phuong trinh vo nghiem");
        }
        else if (delta==0){
            System.out.println(x1=x2=-b/a);
        }
        else {
            x1=(-b+Math.sqrt(delta))/(2*a);
            x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println(x1+"/n"+x2);
        }
    }

}
