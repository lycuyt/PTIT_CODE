import java.util.Scanner;
public class J03005_ChuanHoaHoTen_2 {
    public static Scanner ip= new Scanner (System.in);
    public static void testcase()
    {
        String s= ip.nextLine().trim();
        String[] a= s.split("\\s+");
        for (int i=1;i<a.length;i++){
            String tmp=a[i];
            tmp= tmp.toLowerCase();
            String b= tmp.substring(0, 1).toUpperCase()+ tmp.substring(1, tmp.length()).toLowerCase();
            if(i==a.length-1){
                System.out.print(b+", ");
            }else{
                System.out.print(b+" ");
            }
            
        }
        a[0]=a[0].toUpperCase();
        System.out.println(a[0]);
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
