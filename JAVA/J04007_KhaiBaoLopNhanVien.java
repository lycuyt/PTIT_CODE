import java.util.Scanner;

class NV{
    private String ten , ns, gt, diachi, thue, nk;

    public NV()
    {

    }
    public NV(String ten, String gt, String ns, String diachi, String thue, String nk)
    {
        this.ten =ten;
        this.gt = gt;
        this.ns =ns;
        this.diachi = diachi;
        this.thue = thue;
        this.nk= nk;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        gt= sc.next();
        ns= sc.next();
        sc.nextLine();
        diachi = sc.nextLine();
        thue = sc.next();
        nk= sc.next();
    }
    @Override
    public String toString(){
        return "00001 "+ten+" "+gt+" "+ns+" "+diachi+" "+thue+" "+nk;
    }
}
public class J04007_KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        NV a = new NV();
        a.input();
        System.out.println(a.toString());
    }
}
