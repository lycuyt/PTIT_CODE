import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class J02026_DayConCoKPhanTuTangDan {
    // liet ke to hop chap k cua n phan tu
    public static int n, k;
    public static int[] a = new int[20];
    public static int[] x = new int[20];
    public static ArrayList< ArrayList<Integer>> ans = new ArrayList<>();
    public static void back(int i){
        for(int j=x[i-1]+1;j<=n-k+i;j++){
            x[i]=j;
            if(i==k){
                ArrayList<Integer> b = new ArrayList<>();
                for(int m=1;m<=k;m++)
                {
                    b.add(a[x[m]]);
                }
                // System.out.println();
                ans.add(b);
            }
            else{
                back(i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            ans.clear();
            n = sc.nextInt();
            k = sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                a[i]= sc.nextInt();
            }
            for(int i =1;i<=n-1;i++)
            {
                for(int j=i+1;j<=n;j++)
                {
                    if(a[i]>a[j]){
                        int tmp = a[i];
                        a[i]=a[j];
                        a[j]=tmp;
                    }
                }
            }
            x[0]=0;
            back(1);
            // Collections.sort(ans, (list1, list2)->{
            //     int size = Math.min(list1.size(), list2.size());
            //     for (int i = 0; i < size; i++) {
            //         int cmp = list1.get(i).compareTo(list2.get(i));
            //         if (cmp != 0) {
            //             return cmp;
            //         }
            //     }
            //     return Integer.compare(list1.size(), list2.size());
            // });
            for (int j=0;j<ans.size();j++){
                
                for(int i =0;i<ans.get(j).size();i++)
                {
                    System.out.print(ans.get(j).get(i)+" ");
                }
                System.out.println();
            }
            
        }
    }
}
