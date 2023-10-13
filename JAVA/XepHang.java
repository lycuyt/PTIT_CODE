import java.util.Scanner;

public class XepHang {
    public static Scanner  sc= new Scanner (System.in);
    public static void main(String[] args) {
        int n= sc.nextInt();
        int[] t= new int [n];
        int [] d= new int[n];
        for(int i=0;i<n;i++){
            t[i]=sc.nextInt();
            d[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(t[i]>t[j]){
                    int tmp1= t[i];
                    t[i]=t[j];
                    t[j]=tmp1;

                    int tmp2=d[i];
                    d[i]=d[j];
                    d[j]=tmp2;
                }
            }
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(t[i]+" "+d[i]);
        // }
        int s =0;
        for (int i=0;i<n;i++){
            if(s<t[i]){
                s=t[i];
            }
            s+=d[i];
        }
        System.out.println(s);
    }
}
