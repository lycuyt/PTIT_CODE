import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class student1 implements Comparable<student1> {
    private String name, id, birth;
    private float lt, tt;
    private int tuoi;
    public static int num =1;
    private SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    public student1 (){

    }
    public student1 (String name, String birth, float lt, float tt) throws ParseException
    {
        this.name = name;
        this.birth = birth;
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
    @Override
    public int compareTo(student1 o)
    {
        if(this.getDiem() == o.getDiem())
        {
            return this.id.compareTo(o.id);
        }
        return Float.compare(o.getDiem(), this.getDiem());
    }
}
public class J05060_KetQuaXetTuyen {
    public static void main(String[] args) throws ParseException{
        Scanner sc  = new Scanner(System.in);
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
        Collections.sort(arr);
        for(student1 x : arr)
        {
            System.out.println(x);
        }    
        
    }
}
/*
 
 */