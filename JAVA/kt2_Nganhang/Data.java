
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Data {
    public List<GiaoDich> getData(){
        List<GiaoDich> list=new ArrayList<>();
        GiaoDichVang v=new GiaoDichVang("2/5/2022", 100, 10, "9999");
        v.setMa();
        list.add(v);
        v=new GiaoDichVang("12/5/2022", 100, 30, "9999");
        v.setMa();
        list.add(v);
        v=new GiaoDichVang("21/6/2023", 200, 5, "24K");
        v.setMa();
        list.add(v);
        v=new GiaoDichVang("21/6/2020", 200, 30, "24K");
        v.setMa();
        list.add(v);
        GiaoDichTT tt=new GiaoDichTT("12/7/2022", 200, 10, 1, "VND");
        tt.setMa();
        list.add(tt);
        tt=new GiaoDichTT("10/02/2023", 22000, 40, 1, "EU");
        tt.setMa();
        list.add(tt);
        return list;
    }
}
