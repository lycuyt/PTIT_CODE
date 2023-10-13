import java.util.ArrayList;
import java.util.Scanner;

public class J03027_RutGonXauKiTu {
    public static void slove(String s){
        ArrayList <Character> res= new ArrayList<Character>(s.length()+1);
        for(int i=0;i<s.length();i++)
        {
            res.add(s.charAt(i));
        }
        int i=1;
        while(i<res.size())
        {
            if(res.get(i)== res.get(i-1)){
                res.remove(i);
                res.remove(i-1);
                if(i>1) i--;
            }else{
                i++;
            }
            
        }
        // System.out.println(res.size());
        if( res.size()==0){
            System.out.println("Empty String");

        }else{
            for(int j=0;j<res.size();j++){
                System.out.print(res.get(j));
            }
        }
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner (System.in);
        String s = ip.next();
        slove(s);
        
    }
}
