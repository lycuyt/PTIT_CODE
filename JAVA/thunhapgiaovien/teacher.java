/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thunhapgiaovien;

/**
 *
 * @author Lycuy
 */
public class teacher {
    private String ip, name;
    private int crash;
    private int bac, phucap;
    
    public teacher(){
    }

    public teacher(String ip, String name, int crash) {
        this.ip = ip;
        this.name = name;
        this.crash = crash;
        
        bac = Integer.parseInt(ip.substring(2));
        if(ip.substring(0, 2).equals("HT")){
            phucap= 2000000;
        }else if(ip.substring(0, 2).equals("HP")){
           phucap =900000;
        }else if (ip.substring(0, 2).equals("GV")){
            phucap= 500000;
        }
    }
    
    
    public int getLuong()
    {
        return crash*bac + phucap;
    }
    @Override
    public String toString(){
        return ip+" "+name+" "+bac+" "+phucap+" "+getLuong();
    }
}
//HP04
//Tran Quoc Huy
//1578000