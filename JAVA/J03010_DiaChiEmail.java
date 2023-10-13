import java.util.ArrayList;
import java.util.Scanner;

public class J03010_DiaChiEmail {
    public static Scanner ip= new Scanner(System.in);
    public static ArrayList<String> arr= new ArrayList<String>();
    public static void testcase()
    {
        String s= ip.nextLine().trim().toLowerCase();
        // s.toLowerCase();
        String [] a= s.split("\\s+");
        String res="";
        res+=a[a.length-1];
        for (int i=0;i<a.length-1;i++)
        {
            String k= a[i];
            res+=k.charAt(0);
        }
        // System.out.println(res);
        arr.add(res);
        
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        ip.nextLine();
        while(t-->0)
        {
            testcase();
            
        }
        int len= arr.size();
        int[] d= new int[len+1];
        for (int i=0;i<len;i++){
            d[i]=1;
        }
        for (int i=1;i<arr.size();i++)
        {
            for (int j=0;j<i;j++)
            {
                boolean check= arr.get(i).equals(arr.get(j));
                if(check){
                    d[i]=d[j]+1;
                }
            }
        }
        // for (int x: d){
        //     System.out.println(x);
        // }
        for (int i=0;i<arr.size();i++)
        {
            if(d[i]>1){
                System.out.println(arr.get(i)+d[i]+"@ptit.edu.vn");
            }else{
                System.out.println(arr.get(i)+"@ptit.edu.vn");
            }
        }
    }
}
