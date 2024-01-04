/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JKT013_SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("6");
            q.add("8");
            List<String> arr = new ArrayList<>();
            arr.add("6");
            arr.add("8");
            while(!q.isEmpty())
            {
               
                String tmp = q.peek();
           
                q.poll();
                if(tmp.length()>n-1){
                    break;
                }
                String a = tmp +"6";
                arr.add(a);
                String b = tmp +"8";
                arr.add(b);
                q.add(a);
                q.add(b);
                
            }
            System.out.println(arr.size());
            for (int i = arr.size()-1; i >=0; i--) {
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }
}
