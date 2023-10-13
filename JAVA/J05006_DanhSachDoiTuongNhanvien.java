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
class Employee{
    public static int num = 1;
    private String name, sex, birth, address, tax, dat, id;

    public Employee() {
    }

    public Employee(String name, String sex, String birth, String address, String tax, String dat) {
        this.id = String.format("%05d", num++);
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.tax = tax;
        this.dat = dat;
    }
    @Override
    public String toString()
    {
        return id + " " + name +" " + sex+" " + birth+" " + address+" " + tax + " " + dat;
    }
}
public class J05006_DanhSachDoiTuongNhanvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<n;i++)
        {
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String birth = sc.nextLine();
            String address = sc.nextLine();
            String tax = sc.nextLine();
            String dat = sc.nextLine();
            Employee e = new Employee(name, sex, birth, address, tax, dat);
            System.out.println(e);
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