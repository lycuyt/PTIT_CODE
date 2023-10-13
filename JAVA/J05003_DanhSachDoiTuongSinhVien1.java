/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
class student{
    public static int num = 1;
    private String id, name, bith, clas;
    private double gpa;

    

    public student( String name, String bith, String clas, double gpa) {
        this.id = String.format("B20DCCN%03d", num++);
        this.name = name;
        this.bith = bith;
        this.clas = clas;
        this.gpa = gpa;
    }
    
    @Override
    public String toString()
    {
        return id+" " + name + " " + clas + " " + bith + " " + String.format("%.2f", gpa);
    }
}
public class J05003_DanhSachDoiTuongSinhVien1 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            String name = sc.nextLine();
            String clas = sc.nextLine();
            String birth = sdf.format(sdf.parse(sc.nextLine()));
            double gpa = Double.parseDouble(sc.nextLine());
            student sd = new student(name, birth, clas, gpa );
            System.out.println(sd);
        }
        
    }
}
/*
1
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
*/