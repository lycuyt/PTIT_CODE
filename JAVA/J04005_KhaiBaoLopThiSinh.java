import java.util.Scanner;

class student
{
    private String name;
    private String date;
    private float d1, d2, d3;

    public student()
    {
        name ="";
        date ="";
        d1= d2= d3=0;
    }
    public student(String name, String date, float d1, float d2, float d3){
        this.name = name;
        this.date = date;
        this.d1 =d1;
        this.d2= d2;
        this.d3= d3;
    }
    public void input()
    {
        Scanner sc = new Scanner (System.in);
        name = sc.nextLine();
        // sc.nextLine();
        date = sc.nextLine();
        d1 = sc. nextFloat();
        d2=sc.nextFloat();
        d3= sc.nextFloat();
    }
    @Override
    public String toString()
    {
        return name +" "+ date +" "+String.format("%.1f", d1+d2+d3);
    }
}
public class J04005_KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        
       student a= new student();
       a.input();
       System.out.println(a);
    }
    
}
