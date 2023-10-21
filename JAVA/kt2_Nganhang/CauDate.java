
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class CauDate {
    public static void main(String[] args) {
        //bai 1
        SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
        Scanner in=new Scanner(System.in);
        Date tu,den;
        long gio;
        try{
            
            tu=f.parse(in.nextLine());
            den=f.parse(in.nextLine());
            long tm=(den.getTime()-tu.getTime())/1000/60;
            gio=tm/60;
            long le=tm%60;
            int t=0;
            if(gio<=1){
                t=25;
            }else if(le>0){
                t=25+(t)*10;
            }else{
                t=25+(t-1)*10;
            }
            System.out.println("Tien:"+t);
        }catch(ParseException e){
            
        }
        
        //tinh gia phai tra 1 25k 10k
        
        //bai 2
        SimpleDateFormat fn=new SimpleDateFormat("dd/MM/yyyy");
        Date tu1,den1;
        long date;
        try{
            
            tu1=fn.parse(in.nextLine());
            den1=fn.parse(in.nextLine());
            date=(den1.getTime()-tu1.getTime())/1000/60/60/24;
            System.out.println("Tien:"+(date*300));
        }catch(ParseException e){
            
        }
        //moi ngay gia 300k
    }
}
