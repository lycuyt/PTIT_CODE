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
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
class Employee implements Comparable<Employee> {
    public static int num = 1;
    private String name, sex, address, tax, id;
    public Date birth, dat;

    public Employee(String name, String sex, Date birth, String address, String tax, Date dat) {
        this.id = String.format("%05d", num++);
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.tax = tax;
        this.dat = dat;
    }
    public String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
    @Override
    public int compareTo(Employee other)
    {
        return this.birth.compareTo(other.birth);
    }
    @Override
    public String toString()
    {
        return id + " " + name +" " + sex+" " + formatDate(birth)+" " + address+" " + tax + " " + formatDate(dat);
    }
}
public class J05007_SapXepDoiTuongNhanVien {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        List <Employee> a = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String name = sc.nextLine();
            String sex = sc.nextLine();
            Date birth = sdf.parse(sc.nextLine());
            String address = sc.nextLine();
            String tax = sc.nextLine();
            Date dat = sdf.parse(sc.nextLine());
            Employee e = new Employee(name, sex, birth, address, tax, dat);
            a.add(e);
        }
        Collections.sort(a);
        for( Employee x : a)
        {
            System.out.println(x);
        }
    }
}
/*
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011
*/
