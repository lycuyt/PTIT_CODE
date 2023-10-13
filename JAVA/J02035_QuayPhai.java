import java.util.Scanner;
import java.util.Arrays;
public class J02035_QuayPhai {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
           int n = sc.nextInt();
           int[] a = new int[n];
           int[] b = new int[n];
           for(int i=0;i<n;i++)
           {
                a[i]= sc.nextInt();
                b[i]=a[i];
           } 
           Arrays.sort(a);
           int vt =0;
           for(int i=0;i<=n;i++)
           {
                if(b[i]==a[0]){
                    vt=i;
                    break;
                }
           }
           System.out.println(vt);
        }
    }
}
