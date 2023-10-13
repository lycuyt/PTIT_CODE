import java.util.Scanner;

class MH{
    private String ip, name, dv;
    private long buy, seld;
    public MH(){

    }
    public MH(String ip,String name,String dv, long buy, long seld){
        this.ip = ip;
        this.name = name;
        this. dv = dv;
        this.buy = buy;
        this.seld = seld;
    }
    public String getInp(){
        return ip;
    }
    public long getLoinhuan(){
        return seld-buy;
    }
    @Override
    public String toString()
    {
        return ip+" "+name+" "+dv +" "+buy+" "+seld+" "+getLoinhuan();
    }

}
public class DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        MH[] a= new MH[n];
        for (int i=0;i<n;i++){
            String res=Integer.toString(i+1);
            while(res.length()<3){
                res="0"+res;
            }
            res="MH"+res;
            sc.nextLine();
            String b = sc.nextLine();
            String c= sc.nextLine();
            long d = sc.nextLong();
            long e = sc.nextLong();
            a[i]= new MH(res, b, c, d, e);

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i].getLoinhuan()>a[j].getLoinhuan()){
                    MH tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }else if(a[i].getLoinhuan()==a[j].getLoinhuan()){
                    if(a[i].getInp().compareTo(a[j].getInp())<0){
                        MH tmp = a[i];
                        a[i]=a[j];
                        a[j]=tmp;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

    }
}
