
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class NganHang implements ChucNang{
    private List<GiaoDich> list;

    public NganHang() {
        list=new ArrayList<>();
        
    }

    public List<GiaoDich> getList() {
        return list;
    }

    public void setList(List<GiaoDich> list) {
        this.list = list;
    }
    

    @Override
    public void nhapGDVang(Scanner in) {
        GiaoDichVang v=new GiaoDichVang(
                in.nextLine(),
                Double.parseDouble(in.nextLine()),
                Integer.parseInt(in.nextLine()),
                in.nextLine());
        v.setMa();
        list.add(v);
    }

    @Override
    public void nhapGDTT(Scanner in) {
        GiaoDichTT tt=new GiaoDichTT();
        tt.setNgay(in.nextLine());
        tt.setGia(Double.parseDouble(in.nextLine()));
        tt.setSoluong(Integer.parseInt(in.nextLine()));
        String loaiTT=in.nextLine();
        double tg;
        if(loaiTT.equalsIgnoreCase("vnd")){
            tg=1;
        }else{
            tg=Double.parseDouble(in.nextLine());
        }
        tt.setLoaiTT(loaiTT);
        tt.setTygia(tg);
        tt.setMa();
        list.add(tt);
    }

    @Override
    public void out() {
        for(GiaoDich i:list){
            System.out.println(i);
        }
    }

    @Override
    public void xoa(String ma) {
        int k=0;
        for(GiaoDich i:list){
            if(i.getMa().equalsIgnoreCase(ma)){
                k++;
                list.remove(i);
                System.out.println("xoa thanh cong!!!");
                break;
            }
        }
        if(k==0){
            System.out.println("thay dau ma xoa");
        }
    }

    @Override
    public void suaVang(String ma, Scanner in) {
        //lay e vang ra
        List<GiaoDichVang> lVang=new ArrayList<>();
        for(GiaoDich i:list){
            if(i instanceof GiaoDichVang){
                lVang.add((GiaoDichVang)i);
            }
        }
        int p=-1;
        for (int i = 0; i < lVang.size(); i++) {
            if(lVang.get(i).getMa().equalsIgnoreCase(ma)){
                p=i;
                break;
            }
        }
        if(p==-1){
            System.out.println("Khong tim thay");
        }else{
            GiaoDichVang v=lVang.get(p);
            //sua
            v.setNgay(in.nextLine());
            v.setGia(Double.parseDouble(in.nextLine()));
            v.setSoluong(Integer.parseInt(in.nextLine()));
            v.setLoai(in.nextLine());
            System.out.println("sua thanh cong");
        }
    }

    @Override
    public void suaTT(String ma, Scanner in) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timKiemTheoGia(double tu, double den) {
        //tat ca cac giao dich
        int c=0;
        for(GiaoDich i:list){
            if(i.getGia()>=tu && i.getGia()<=den){
                c++;
                System.out.println(i);
            }            
        }
        if(c==0){
                System.out.println("khong thay!");
            }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timTheoLoaiTien(String loai) {
        List<GiaoDichTT> lTT=new ArrayList<>();
        for(GiaoDich i:list){
            if(i instanceof GiaoDichTT){
                lTT.add((GiaoDichTT)i);
            }
        }
        int c=0;
        for(GiaoDichTT k:lTT){
            if(k.getLoaiTT().equalsIgnoreCase(loai)){
                c++;
                System.out.println(k);
            }
        }
        if(c==0){
            System.out.println("khong thay!");
        }
        //chi tren GD tien te
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timTheoNam(int nam) {
        //tat ca
        int c=0;
        for(GiaoDich k:list){
            if(k.getNgay().endsWith(Integer.toString(nam))){
                c++;
                System.out.println(k);
            }
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepTheoMa() {
        Collections.sort(list, new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich t1, GiaoDich t2) {
                return t1.getMa().compareToIgnoreCase(t2.getMa());
            }
        
        });
    }

    @Override
    public void sapxepTheoGia() {
        list.sort(new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich t, GiaoDich t1) {
                return Double.compare(t1.getGia(), t.getGia());
            }
        
        });
    }

    @Override
    public void sapxepVangTheoSoluong() {
        //nhat Van
        
        //sap xep vang
                
          //viet vang      
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepGDVangTheoThanhTien() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //moi nam co bao nhieu giao dich
    public void demSoGDTheoNam(){
        Map<Integer,Long> c=list.stream().collect(Collectors.groupingBy(
                GiaoDich::getNam,Collectors.counting()));
        for(Integer i:c.keySet()){
            System.out.println(i+":"+c.get(i));
        }
    }
    //tinh giao dich vang tinh so tien thu duoc cho moi loai vang 
    public void tongTienGDVangTheoLoai(){
        List<GiaoDichVang> lVang=new ArrayList<>();
        for(GiaoDich i:list){
            if(i instanceof GiaoDichVang){
                lVang.add((GiaoDichVang)i);
            }
        }
        Map<String,Double> m=lVang.stream().collect(Collectors.groupingBy(
                GiaoDichVang::getLoai,Collectors.
                        summingDouble(GiaoDichVang::getThanhTien)));
        for(String k:m.keySet()){
            System.out.println(k+":"+m.get(k));
        }
    }
    //dua ra vang co thanh tien cao nhat -max
    public void maxVangTT(){
        List<GiaoDichVang> lVang=new ArrayList<>();
        for(GiaoDich i:list){
            if(i instanceof GiaoDichVang){
                lVang.add((GiaoDichVang)i);
            }
        }
        Optional<GiaoDichVang> max=lVang.stream().collect(Collectors.maxBy(
                Comparator.comparing(GiaoDichVang::getThanhTien)));
        System.out.println(max.get());
    }
    //dua ra cac giao dich vang co thanh tien cao nhat cua moi loai tien
    public void maxVangTTTheoLoai(){
        List<GiaoDichVang> lVang=new ArrayList<>();
        for(GiaoDich i:list){
            if(i instanceof GiaoDichVang){
                lVang.add((GiaoDichVang)i);
            }
        }
        Map<String,GiaoDichVang> m=lVang.stream().collect(Collectors.groupingBy(
                GiaoDichVang::getLoai,Collectors.collectingAndThen(
                        Collectors.reducing((GiaoDichVang v1,
                                GiaoDichVang v2)->
                                v1.getThanhTien()>v2.getThanhTien()?v1:v2),
                        Optional::get)));
        for(String key:m.keySet()){
            System.out.println(key);
            System.out.println(m.get(key));
        }
        
    }
    public void maxSoGDTheoNam(){
        Map<Integer,GiaoDich> m=list.stream().collect(Collectors.groupingBy(
                GiaoDich::getNam,Collectors.collectingAndThen(
                Collectors.reducing((GiaoDich g1,GiaoDich g2)->
                    g1.getSoluong()>g2.getSoluong()?g1:g2),Optional::get)));
        for(Integer key:m.keySet()){
            System.out.println(key);
            System.out.println(m.get(key));
        }
    }
}
