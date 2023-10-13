import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class J02017_ThuGonDaySo {
    public static Scanner ip = new Scanner(System.in);
    public static void testcase()
    {
        int n= ip.nextInt();
        List<Integer> a= new ArrayList<>(n+1);
        for (int i=0;i<n;i++)
        {
            int x= ip.nextInt();
            a.add(x);

        }
        int i=0;
        while(i<a.size()-1)
        {
            if((a.get(i)+ a.get(i+1)) %2==0)
            {
                a.remove(i+1);
                a.remove(i);
                if(i>0){
                    i--;
                }
            }else{
                i++;
            }
        }

        System.out.println(a.size());
    }
    public static void main(String[] args) {
        testcase();
    }
}
