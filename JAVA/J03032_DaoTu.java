import java.util.Scanner;

public class J03032_DaoTu {
    public static Scanner ip = new Scanner(System.in);
    public static void testcase(){
        String[] a= ip.nextLine().split("\\s+");
        for (int i=0;i<a.length;i++)
        {
            String s = a[i];
            StringBuilder str= new StringBuilder(s);
            System.out.print(str.reverse().toString()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        ip.nextLine();
        while(t-->0)
        {
            testcase();
        }
    }
}
