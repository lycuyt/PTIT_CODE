import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class XuLi{
    private int n;
    private int[] a;
    private int[] x;
    private List<String> res;
    public XuLi (int  n, int a[])
    {
        this.n = n;
        this.a= a;
        x = new int[n];
        res = new ArrayList<>();
    }
    // xem xau nhi phan co sap xep theo thu tu tang dan hay khong
    private boolean check()
    {
        int cnt =0;
        for(int i=0;i<n;i++)
        {
            if(x[i]==1) cnt++;
        }
        if(cnt>=2) return true;
        else return false;
    }
    private boolean check1()
    {
        List < Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(x[i]==1)
            {
                l.add(a[i]);
            }
        }
        for(int i=0;i<l.size()-1;i++)
        {
            if(l.get(i)>l.get(i+1)) return false;
        }
        return true;
    }
    private void Try(int i)
    {
        for(int j=0;j<=1;j++)
        {
            x[i]=j;
            if(i==n-1){
                if(check() && check1())
                {
                    String s="";
                    for(int k=0;k<n;k++)
                    {
                        if(x[k]==1) 
                        {
                            s+= a[k]+" ";
                        }
                        
                    }
                    res.add(s);
                }
                
                
            }else{
                Try(i+1);
            }
        }
    }
    public void so()
    {
        Try(0);
        Collections.sort(res);
        for(String s: res){
            System.out.println(s);
        }
    }
}
public class J07008_DayConTangDan {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        int [] a = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        // Arrays.sort(a);
        XuLi ss = new XuLi(n, a);
        ss.so();

    }
}
