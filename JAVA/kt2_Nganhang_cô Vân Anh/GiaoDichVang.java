/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class GiaoDichVang extends GiaoDich implements IThanhTien{
    private String loai;

    public GiaoDichVang() {
    }

    public GiaoDichVang( String ngay, double gia, int soluong,String loai) {
        super(ngay, gia, soluong);
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
    }
    public void setMa(){
        super.setMa();
        super.setMa("V-"+super.getMa());
    }
    public void setLoai(String loai) {
        this.loai = loai;
    }
    

    @Override
    public double getThanhTien() {
        return super.getSoluong()*super.getGia();
    }
    public String toString(){
        return getMa()+" "+getNgay()+" "+
                getGia()+" "+getSoluong()+" "+getLoai()+" "+getThanhTien();
    }
}
