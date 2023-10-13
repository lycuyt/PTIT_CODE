import java.util.ArrayList;
import java.util.Scanner;
public class J02023_LuaChonThamlam {
    public static void slovemin(int n, int s)
    {
        if(s>9*n|| s==0){
            System.out.print(-1);
            return;
        }

        int tmp =9;
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(n>1){
            s = s-1;
            while(s<tmp) tmp--;
            if(s>= tmp){
                a.add(tmp);
                s= s-tmp;
            }
            s=s+1;
            n--;
        }
        a.add(s);
        for(int i= a.size()-1;i>=0;i--){
            System.out.print(a.get(i));
        }
    }
    public static void slovemax(int n, int s)
    {
        if(s>9*n|| s==0){
            System.out.print(-1);
            return;
        }

        int tmp =9;
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(n>1){
            
            while(s<tmp) tmp--;
            if(s>= tmp){
                a.add(tmp);
                s= s-tmp;
            }
            
            n--;
        }
        a.add(s);
        for(int i= 0;i<a.size();i++){
            System.out.print(a.get(i));
        }        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int s = sc.nextInt();
        slovemin(n, s);
        System.out.print(" ");
        slovemax(n, s);
        
    }
}
