/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Admin
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class student1 {
    private String name, id, birth;
    private float lt, tt;
    private int tuoi;
    public static int num =1;
    private SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    public student1 (){

    }
    public student1 (String name, String birth, float lt, float tt) throws ParseException
    {
        this.name = chuanhoaten(name.trim());
        this.birth = chuanhoangay(birth);
        this.lt = lt;
        this.tt = tt;
        this.id = String.format("PH%02d", num++);
        this.tuoi = 2021 - sdf2.parse(birth).getYear() - 1900;
        
    }

    public float getThuong()
    {
        if(lt >= 8f && tt>=8f)
        {
            return 1f;
        }
        if(lt >=7.5f && tt >= 7.5f)
        {
            return 0.5f;
        }
        return 0f;
    }
    private String chuanhoangay(String s)
    {
        try{
            Date date = sdf2.parse(s);
            return sdf2.format(date);
        }catch(ParseException e){
            System.out.println(e);
        }
        return "";
    }
    private String chuanhoaten(String s)
    {
        String[] a= s.split("\\s+");
        String res = "";
        for (int i = 0; i < a.length; i++) {
            res+=a[i].substring(0,1).toUpperCase()+ a[i].substring(1).toLowerCase()+" ";
        }
        
        return res.substring(0, res.length() -1);
    }
    public int getDiem()
    {
        int diem = Math.round((lt + tt)/ 2 + getThuong());
        if(diem<=10){
            return diem;
        }else{
            return 10;
        }

    }
    public String XH()
    {
        if(getDiem() < 5) return "Truot";
        if(getDiem()  == 5 || getDiem() == 6) return "Trung binh";
        if(getDiem() == 7) return "Kha";
        if(getDiem() == 8) return "Gioi";
        return "Xuat sac";
    }
    @Override
    public String toString()
    {
        return  id + " " + name + " " + tuoi+ " " + getDiem() + " " + XH();
    }
}
public class J07053_XetTuyen {
    public static void main(String[] args) throws ParseException, FileNotFoundException{
        Scanner sc  = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<student1 > arr = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String name = sc.nextLine();
            String birth = sc.nextLine();
            float lt = Float.parseFloat(sc.nextLine());
            float tt = Float.parseFloat(sc.nextLine());
            student1 b = new student1(name, birth, lt, tt);
            arr.add( b);

        }
        for(student1 x : arr)
        {
            System.out.println(x);
        }    
        
    }
}
