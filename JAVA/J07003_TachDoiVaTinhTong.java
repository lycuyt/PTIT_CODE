import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;
import java.io.File;
public class J07003_TachDoiVaTinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        while(s.length()>1)
        {
            String start ="";
            String end ="";
            for(int i=0;i<s.length();i++)
            {
                if(i<s.length()/2){
                    start+=s.charAt(i);
                }else{
                    end+=s.charAt(i);
                }
            }
            BigInteger a = new BigInteger(start);
            BigInteger b = new BigInteger(end);
            s = a.add(b).toString();
            System.out.println(s);

        }
        
        
    }
}
