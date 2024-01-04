import java.util.Scanner;
import java.util.StringTokenizer;

public class hello {
    public static String chuanhoa(String s)
    {
        String out ="";
        s = s.toLowerCase();
        s = s.replaceAll("\\s+", " ");
        
        s = s.replaceAll("\\s*\\.", "\\.");
        s = s.replaceAll("\\.\\s*", "\\.");
        s = s.replaceAll("\\s*\\?", "\\?");
        s = s.replaceAll("\\?\\s*", "\\?");
        s = s.replaceAll("\\s*\\!", "\\!");
        s = s.replaceAll("\\!\\s*", "\\!");
        s = s.replaceAll("\\s+", " ");
        s=s.trim();
        out = s;
        boolean iscap = true;
        char c ;
        StringBuilder strb = new StringBuilder("");
        for(int i=0;i<out.length()-1;i++)
        {
            c = out.charAt(i);
            if ( c =='.' || c =='?' || c == '!'){
                iscap =true;
            }
            if(iscap && Character.isAlphabetic(c) ){
                c = Character.toUpperCase(c);
                iscap = false;
            }
            strb.append(c);
        }
        strb.append(out.charAt(out.length()-1));
        out = strb.toString();
        if(out.charAt(out.length()-1) != '.' &&  out.charAt(out.length()-1)!='!' && out.charAt(out.length()-1)!='?'){
            out+=".";
        }
        return out;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "";
        while(sc.hasNext())
        {
           String s = sc.nextLine();
           res+=chuanhoa(s);
           
           if(s.isEmpty()) break;
        }
        int st = 0;
           for(int i=0;i<res.length();i++)
           {
                if(res.charAt(i) == '.' || res.charAt(i) == '?' || res.charAt(i)=='!'){
                    String tmp = res.substring(st, i+1);
                    System.out.println(tmp);
                    st = i+1;
                    
                }
           }
        
    }
}
