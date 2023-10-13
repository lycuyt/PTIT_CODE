import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
class SV{
    public static int Number = 1;
    private String id, name, clas, birth;
    private float gpa;

    public SV(){

    }
    public SV(String name, String clas, String birth, float gpa) throws ParseException
    {
        this.id = "B20DCCN"+String.format("%03d",Number++);
        this.name =name;
        this.clas = clas;
        this.gpa= gpa;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        this.birth = formatter.format(formatter.parse(birth));
    }
    @Override
    public String toString()
    {
        return id +" "+ name+" "+ clas+' '+birth+" "+String.format("%.2f",gpa);
    }

}
public class J07010_DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException,ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            String name = sc.nextLine();
            String clas = sc.nextLine();
            String bi = sc.nextLine();
            float g = Float.parseFloat(sc.nextLine());
            SV s = new SV(name, clas, bi, g);
            System.out.println(s);

        }
    }
}
