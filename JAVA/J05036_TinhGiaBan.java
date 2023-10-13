import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class MH implements Comparable<MH>{
    private String name, dv, ma;
    private long nhap , sl;
    public static long num =1;
    public MH(String name, String dv, long nhap, long sl){
        this.ma = String.format("MH%02d", num++);
        this.name = name;
        this.dv = dv;
        this.nhap = nhap;
        this.sl = sl;
    }
    public long phivanchuyen()
    {
        return Math.round(this.nhap  * this.sl * 0.05);

    }
    public long thanhtien()
    {
        return Math.round(this.nhap * this.sl + phivanchuyen());
    }
    public long giaban()
    {
        return (long) ((Math.ceil((thanhtien() + thanhtien()*0.02)/sl) +99)/100)*100;
    }
    @Override
    public String toString()
    {
        return ma + " " + name + " " + dv + " " + phivanchuyen()+" " + thanhtien()+" " + giaban();
    }
    @Override
    public int compareTo(MH o)
    {
        if(this.giaban()>o.giaban()) return -1;
        return 1;
    }

}
public class J05036_TinhGiaBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List <MH> a = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String name = sc.nextLine();
            String dv = sc.nextLine();
            long nhap = Long.parseLong(sc.nextLine());
            long sl = Long.parseLong(sc.nextLine());
            MH x = new MH(name, dv, nhap, sl);
            a.add(x);

        }
        Collections.sort(a);
        for(MH x : a)
        {
            System.out.println(x);
        }
    }
}
