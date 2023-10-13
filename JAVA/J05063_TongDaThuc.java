/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
class DaThuc{
    private String s;

    public DaThuc() {
    }

    public DaThuc(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    
    public DaThuc cong(DaThuc b){
        String[] n = s.split("\\+");
        String[] m = b.getS().split("\\+");
        
        String[] tmp = n[0].split("\\*x\\^");
        int p = Integer.parseInt(tmp[1].trim());
        // System.out.println(p);
        String[] tm = m[0].split("\\*x\\^");
        int q = Integer.parseInt(tm[1].trim());
        // System.out.println(q);
        int max = 0;
        if(p<q)
        {
            max = q;
        }else{
            max = p;
        }
        int[] u = new int [ max +1];
        int [] v = new int [max +1];
        for (int i = 0; i < n.length; i++) {
            String[] k = n[i].split("\\*x\\^");
            int l = Integer.parseInt(k[1].trim());
            u[l] = Integer.parseInt(k[0].trim());
        }
        for (int i = 0; i < m.length; i++) {
            String[] k = m[i].split("\\*x\\^");
            int l = Integer.parseInt(k[1].trim());
            v[l] = Integer.parseInt(k[0].trim());
        }
        for (int i = 0; i < max+1; i++) {
            u[i] += v[i];
        }
        String res = "";
        for (int i = max; i >= 0; i--) {
            if(u[i] != 0)
            {
                res+= u[i] +"*x^"+i;
                if(i!=0)
                {
                    res+=" + ";
                }
            }
        }
        
        DaThuc f = new DaThuc();
        f.setS(res);
        return f;
    }
    @Override
    public String toString()
    {
        return s;
    }
}
public class J05063_TongDaThuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
/*
1
3*x^8 + 7*x^2 + 4*x^0
11*x^6 + 9*x^2 + 2*x^1 + 3*x^0
*/