import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J03022_XuLyVanBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        ArrayList<String> S = new ArrayList<>();
        while(sc.hasNext()){
            String a = sc.next();
            s=s+a+" ";
            if(s.isEmpty()) break;
        }
        // System.out.println(s);
        // . ? !
        // , :
        String out ="";
        s = s.toLowerCase();
        s = s.replaceAll("\\s+", " ");
        s = s.replaceAll("\\s*\\,", "\\,");
        s = s.replaceAll("\\,\\s*", "\\, ");
        s = s.replaceAll("\\s*\\:", "\\:");
        s = s.replaceAll("\\:\\s*", "\\: ");
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
        if(out.charAt(out.length()-1) != '.'){
            out+=".";
        }
        // System.out.println(out);
        StringTokenizer dt = new StringTokenizer(strb.toString(), ".?!");
        while(dt.hasMoreTokens()){
            System.out.println(dt.nextToken());
        }

    }
}
