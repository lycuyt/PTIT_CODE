
public class GiaoDich {
    //Mã giao dịch, ngày giao dịch 
    //(ngày, tháng, năm), đơn giá, số lượng
    private String ma,ngay;
    private double gia;
    private int soluong;
    private static int sMa=1;

    public GiaoDich() {
    }

    public GiaoDich(String ngay, double gia, int soluong) {
        this.ngay = ngay;
        this.gia = gia;
        this.soluong = soluong;
    }

    public String getMa() {
        return ma;
    }
    public void setMa(){
        this.ma=String.format("%03d", sMa++);
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }
    public int getNam(){
        return Integer.parseInt(getNgay().substring(getNgay().length()-4));
    }
    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

//    @Override
//    public int compareTo(GiaoDich t) {
//        //ma
//        //tang dan
//        //return this.ma.compareToIgnoreCase(t.ma);
//        //giam dan
//        return t.ma.compareToIgnoreCase(this.ma);
//    }

    
    
    
}
