import java.util.ArrayList;
import java.util.Scanner;

public class DayUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s= sc.nextLine();
            String[] a= s.split("\\s+");
            ArrayList<Integer> b = new ArrayList<>();
            for (int i =0;i<a.length;i++){
                int tmp = Integer.parseInt(a[i]);
                b.add(tmp);
            }
            int chan =0;
            int le =0;
            for (int i=0;i<b.size();i++){
                if(b.get(i)%2==0) chan++;
                else le++;
            }
            if (b.size()%2==0 && chan>le){
                System.out.println("YES");
            }else if(b.size()%2==1 && le>chan){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
