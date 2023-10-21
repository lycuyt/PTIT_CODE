
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class NganHang implements ChucNang {
    private List<GiaoDich> list;
    private boolean x;

//    public NganHang() {
//        list = new ArrayList<>();
//    }
    public NganHang(){
        list = new ArrayList<>();
        GiaoDichVang v = new GiaoDichVang("1/1/2022", 100, 10, "24k");
        v.setMa();
        list.add(v);
        v = new GiaoDichVang("12/10/2023", 200, 20, "9999");
        v.setMa();
        list.add(v);
        GiaoDichTT t = new GiaoDichTT("13/09/2022", 100, 10, 1, "VND");
        t.setMa();
        list.add(t);
    }

    @Override
    public void nhapGDVang(Scanner in) {
        GiaoDichVang v = new GiaoDichVang(in.nextLine(), Double.parseDouble(in.nextLine()), 
                             Integer.parseInt(in.nextLine()), in.nextLine()  );
        v.setMa();
        list.add(v);
    }

    @Override
    public void nhapGDTT(Scanner in) {
        GiaoDichTT tt = new GiaoDichTT();
        tt.setNgay(in.nextLine());
        tt.setGia(Double.parseDouble(in.nextLine()));
        tt.setSoluong(Integer.parseInt(in.nextLine()));
        String loaiTT = in.nextLine();
        double tg;
        if(loaiTT.equalsIgnoreCase("VND")){
            tg = 1;
        }
        else{
            tg = Double.parseDouble(in.nextLine());
        }
        tt.setLoaiTT(loaiTT);
        tt.setTygia(tg);
        tt.setMa();
        list.add(tt);
       
    }
    
    @Override
    public void out()
    {
        for(GiaoDich x : list){
            System.out.println(x);
        }
    }
    @Override
    // xoa theo ma
    public void xoa(String ma) {
        int c =0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equals(ma)){
                c++;
                list.remove(i);
                System.out.println("xoa thanh cong!!!");
                break;
            }
        }
        if(c==0){
            System.out.println("thay dau ma xoa");
        }
    }
    // xoa tat cac cac gv vang 4 con 9
    public void xoaVangTheoLoai(String loai)
    {
        // xoa dung iterator
        // viet ra ds vang dc xoa
        //loc vang
        
        // dung iterator
        
    }
    @Override
    public void suaVang(String ma, Scanner in) {
        int c =-1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equals(ma) && list.get(i) instanceof GiaoDichVang){
                
                c = i;
                
                break;
            }
        }
        if(c==-1){
            System.out.println("Khong tim thay");
        }else{
            GiaoDichVang v = (GiaoDichVang) list.get(c);
            v.setNgay(in.nextLine());
            v.setGia(Double.parseDouble(in.nextLine()));;
            v.setSoluong(Integer.parseInt(in.nextLine()));
            v.setLoai(in.nextLine());
            System.out.println("sua thanh cong");
        }
    }

    @Override
    public void suaTT(String ma, Scanner in) {
        int c = -1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equals(ma) && list.get(i) instanceof GiaoDichTT){
                c = i;
                break;
            }
        }
        if(c == -1){
            System.out.println("Khong tim thay");
        }else{
            GiaoDichTT tt = (GiaoDichTT) list.get(c);
            tt.setNgay(in.nextLine());
            tt.setGia(Double.parseDouble(in.nextLine()));
            tt.setSoluong(Integer.parseInt(in.nextLine()));
            String loaiTT = in.nextLine();
            double tg;
            if(loaiTT.equalsIgnoreCase("VND")){
                tg = 1;
            }
            else{
                tg = Double.parseDouble(in.nextLine());
            }
            tt.setLoaiTT(loaiTT);
            tt.setTygia(tg);
            tt.setMa();
            list.add(tt);
        }
    }

    @Override
    public void timKiemTheoGia(double tu, double den) {
        int kt =0;
        for(GiaoDich x: list)
        {
            if(x.getGia() >= tu && x.getGia()<= den)
            {
                System.out.println(x);
                kt =1;
            }
        }
        if(kt == 0){
            System.out.println("Khong tim thay");
        }
    }

    @Override
    public void timTheoLoaiTien(String loai) {
        List<GiaoDichTT> tt = new ArrayList<>();
        for( GiaoDich i : list)
        {
            if( i instanceof GiaoDichTT)
            {
                // ep kieu
                tt.add((GiaoDichTT) i);
            }
        }
        int c =0;
        for(GiaoDichTT i : tt)
        {
            if(i.getLoaiTT().equalsIgnoreCase(loai))
            {
                System.out.println(i);
            }
        }
        if(c == 0){
            System.out.println("khong nhin thay");
        }
    }

    @Override
    public void timTheoNam(String nam) {
        int c = 0;
        for( GiaoDich x : list)
        {
            if( x.getNgay().endsWith(nam))
            {
                System.out.println(x);
                c++;
            }
        }
        if(c == 0)
        {
            System.out.println("Khong tim thay");
        }
    }

    @Override
    public void sapxepTheoMa() {
        Collections.sort(list, new Comparator<GiaoDich>()
            {
            @Override
            public int compare(GiaoDich o1, GiaoDich o2) {
                return o1.getMa().compareToIgnoreCase(o2.getMa());
            }
                    
            });
        
    }

    @Override
    public void sapxepTheoGia() {
        list.sort(new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich o1, GiaoDich o2) {
                return Double.compare(o2.getGia(), o1.getGia());
            }
            
        });
    }

    @Override
    public void sapxepVangTheoSoluong() {
        List<GiaoDichVang> tt = new ArrayList<>();
        for( GiaoDich i : list)
        {
            if( i instanceof GiaoDichVang)
            {
                // ep kieu
                tt.add((GiaoDichVang) i);
            }
        }
        tt.sort(new Comparator<GiaoDichVang>(){
            @Override
            public int compare(GiaoDichVang o1, GiaoDichVang o2) {
                return Integer.compare(o2.getSoluong(), o1.getSoluong());
            }
            
        });
        
    }

    @Override
    public void sapxepGDVangTheoThanhTien() {
        List<GiaoDichVang> tt = new ArrayList<>();
        for( GiaoDich i : list)
        {
            if( i instanceof GiaoDichVang)
            {
                // ep kieu
                tt.add((GiaoDichVang) i);
            }
        }
        tt.sort(new Comparator<GiaoDichVang>(){
            @Override
            public int compare(GiaoDichVang o1, GiaoDichVang o2) {
                return Double.compare(o1.getThanhTien(), o2.getThanhTien());
            }
            
        });
    }
    
    // dem so giao dich theo nam
    public void demTheoNam()
    {
//        Map <Integer, Long> c = list.stream().collect(
//        Collectors.groupingBy(GiaoDich :getNam(),Collectors.counting()));
    }
//    public void maxSoGiaoDichTheoNam()
//    {
//        Map<Integer, Long> m = list.stream().collect(Collectors.groupingBy(GiaoDich::getNam() , 
//                 Collectors.collectingAndThen(Collectors.reducing(''))))
//    }
}
//39.Nguyen Thi Cam Ly
/*
4 cau
1
*/
    
    

