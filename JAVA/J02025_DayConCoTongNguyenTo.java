import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02025_DayConCoTongNguyenTo {
    public static Scanner sc = new Scanner(System.in);
    public static int n;
    public static int [] a ;
    public static ArrayList<Integer> res = new ArrayList<>();
    public static ArrayList< ArrayList<Integer> > ans = new ArrayList<>();
    public static int [] prime = new int[101];
    public static void sang()
    {
        for(int i=0;i<=100;i++) prime[i]=1;
        prime[0]=0;
        prime[1]=0;
        for(int i=2;i<=Math.sqrt(100);i++)
        {
            if(prime[i]==1){
                for(int j=i*i;j<=100;j=i+j)
                {
                    prime[j]=0;
                }
            }
        }
    }
    public static void back(int i , int s)
    {
        for (int j= i;j<n;j++)
        {
            res.add(a[j]);
            s+=a[j];
            if(prime[s]==1){
                ans.add(new ArrayList<>(res));
            }
            if(j+1<n) back(j+1, s);
            res.remove(res.size()-1);
            s=s-a[j];
        }
    }
    public static void main(String[] args) {
        sang();
        int t = sc.nextInt();
        while(t-->0)
        {
            res.clear();
            ans.clear();
            n= sc.nextInt();
            a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i =0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(a[i]<a[j]){
                        int tmp = a[i];
                        a[i]=a[j];
                        a[j]=tmp;
                    }
                }
            }
            
            back(0, 0);
            Collections.sort(ans, (list1, list2) -> {
                int size = Math.min(list1.size(), list2.size());
                for (int i = 0; i < size; i++) {
                    int cmp = list1.get(i).compareTo(list2.get(i));
                    if (cmp != 0) {
                        return cmp;
                    }
                }
                return Integer.compare(list1.size(), list2.size());
            });
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
