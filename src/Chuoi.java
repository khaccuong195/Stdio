import java.util.Scanner;

public class Chuoi {
    public static void main(String [] agrs)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap chuoi");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int v=s1.indexOf(s2);
        System.out.println("vi tri xuat hien:"+v);
        char[] chuoi= s1.toCharArray();
        int vt,vp=0;
        vp=chuoi.length-1;
        for (vt=0; vt < vp ; vt++ ,vp--)
        {
            char temp = chuoi[vt];
            chuoi[vt] = chuoi[vp];
            chuoi[vp]=temp;
        }
        String s3= new String(chuoi);

    }
}
