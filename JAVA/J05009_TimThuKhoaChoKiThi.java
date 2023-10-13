/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable < Student> {
    public static int num = 1;
    private String name, birth;
    private int id;
    public Float mark1, mark2, mark3, sum;

    
    public Student(String name, String birth, float mark1, float mark2, float mark3) {
        this.id = num++;
        this.name = name;
        this.birth = birth;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.sum = mark1+ mark2+mark3;
    }

    public Float getSum() {
        return sum;
    }
    
    @Override
    public int compareTo(Student o) {
        if (this.sum.compareTo(o.sum) == 0) {
            return (this.id - o.id);
        }
        return -this.sum.compareTo(o.sum);
    }
    @Override 
    public String toString()
    {
        return id + " " + name + " " + birth + " " + sum;
    }
}
public class J05009_TimThuKhoaChoKiThi {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Student>  list= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String name = sc.nextLine();
            String birth = sc.nextLine();
            float mark1 = Float.parseFloat(sc.nextLine());
            float mark2 = Float.parseFloat(sc.nextLine());
            float mark3 = Float.parseFloat(sc.nextLine());
            Student x = new Student(name, birth, mark1, mark2, mark3);
            list.add(x);
        }
        Collections.sort(list);
        float high = list.get(0).getSum();
        for(Student x : list)
        {
            if(x.getSum() == high ){
                System.out.println(x);
            }else{
                break;
            }
        }
        
    }
}
/*
3
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5
*/