import java.util.Scanner;


public class J03004_ChuanHoaXauHoTen_1 {
    public static Scanner ip = new Scanner(System.in);
    public static void testcase()
    {
        String s= ip.nextLine().trim();
        String[] a= s.split("\\s+");
        for (int i=0;i<a.length;i++)
        {
            String ss= a[i].substring(0,1 ).toUpperCase() + a[i].substring(1, a[i].length()).toLowerCase();
            System.out.print(ss+" ");

        }
        
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        ip.nextLine();
        while(t-->0)
        {
            testcase();
            System.out.println();
        }
    }
}
