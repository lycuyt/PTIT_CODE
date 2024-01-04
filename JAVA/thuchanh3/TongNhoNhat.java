
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

public class TongNhoNhat {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            int n = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            String [] a= s.split("\\s+");
            List <Integer> arr = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                arr.add(Integer.parseInt(a[i]));
            }
            Collections.sort(arr);
            long c,d;
            String res ="";
                String ans = "";
            for (int i = 0; i < n; i++) {
                
                if(i%2==0)
                {
                    res += arr.get(i);
                }else{
                    ans += arr.get(i);
                }
            }
            c = Long.parseLong(res);
            d = Long.parseLong(ans);
            System.out.println(c+d);
        }
    }
}
