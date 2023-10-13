import java.util.Scanner;

class phanso{
        private long tu;
        private long mau;

        public phanso(){
            tu=0;
            mau=1;
        }
        public phanso(long tu, long mau){
            this.tu =tu;
            this.mau =mau;
        }
        private long gcd(long a, long b)
        {
            while( b!=0){
                long z = a%b;
                a=b;
                b=z;
            }
            return a;
        }
        @Override
        public String toString()
        {
            long bcnn= gcd(this.tu, this.mau);
            return tu/bcnn+"/"+mau/bcnn;
        }
    }
public class J04003_PhanSo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        long a = sc.nextLong();
        long b= sc.nextLong();
        phanso ps = new phanso(a, b);
        System.out.println(ps.toString());
    }
}