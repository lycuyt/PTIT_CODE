/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class GiaoDichTT extends GiaoDich implements IThanhTien{
    private double tygia;
    private String loaiTT;

    public GiaoDichTT() {
    }

    public GiaoDichTT( String ngay, double gia, int soluong,
            double tygia, String loaiTT) {
        super(ngay, gia, soluong);
        this.tygia = tygia;
        this.loaiTT = loaiTT;
    }

    public double getTygia() {
        return tygia;
    }
    public void setMa(){
        super.setMa();
        super.setMa("TT-"+super.getMa());
    }
    public void setTygia(double tygia) {
        this.tygia = tygia;
    }

    public String getLoaiTT() {
        return loaiTT.toUpperCase();
    }

    public void setLoaiTT(String loaiTT) {
        this.loaiTT = loaiTT;
    }
    

    @Override
    public double getThanhTien() {
        if(getLoaiTT().equalsIgnoreCase("VND")){
            return getGia()*getSoluong();
        }else{
            return getGia()*getSoluong()*getTygia();
        }
    }
    public String toString(){
        return getMa()+" "+getNgay()+" "+
                getGia()+" "+getSoluong()+" "+getLoaiTT()+
                " "+getTygia()+ " "+getThanhTien();
    }
    
}
