import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
public class J03020_TuThuanNhichDaiNhat {
    public static boolean pail(String s)
    {
        for (int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String res = "";
        while (sc.hasNext()) {
            
            String s = sc.next();
            res+=s+" ";
            if (s.isEmpty()) break;
        }
        
        // scanner.close();
        // System.out.println(res);
        String [] a= res.split("\\s+");
        LinkedHashMap<String, Integer>  mp = new LinkedHashMap<>();
        for (int i=0;i<a.length;i++)
        {
            if(pail(a[i])){
                if (mp.containsKey(a[i])){
                    mp.put(a[i], mp.get(a[i])+1);
                }else{
                    mp.put(a[i], 1);
                }
            }
            // System.out.println(a[i]);
        }
        int maxx =0;
        for(Map.Entry<String, Integer> entry : mp.entrySet()){
            // System.out.println(entry.getKey()+":"+entry.getValue());
            maxx = Math.max(maxx,entry.getKey().length());
        }
        // System.out.println(maxx);
        for(Map.Entry<String, Integer> entry : mp.entrySet())
        {
            if(entry.getKey().length()==maxx)
            {
                System.out.println(entry.getKey()+" "+entry.getValue());
                // System.out.println();
            }
        }
        

        
    }
}
