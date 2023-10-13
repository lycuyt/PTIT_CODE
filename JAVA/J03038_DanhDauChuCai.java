import java.util.HashSet;
import java.util.Scanner;

public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
        HashSet<Character> a = new HashSet<Character>();
        for (int i=0;i<s.length();i++)
        {
            a.add(s.charAt(i));
        }
        System.out.println(a.size());
    }
}
