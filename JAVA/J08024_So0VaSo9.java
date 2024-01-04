/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J08024_So0VaSo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("9");
            while(!q.isEmpty())
            {
               
                String tmp = q.peek();
                if(Long.parseLong(tmp) % n == 0) {
                    System.out.println(tmp);
                    break;
                }
                q.poll();
                String a = tmp +"0";
                if( Long.parseLong(a) % n == 0) {
                    System.out.println(a);
                    break;
                }
                String b = tmp +"9";
                if(Long.parseLong(b) % n == 0 ) {
                    System.out.println(b);
                    break;
                }
                q.add(a);
                q.add(b);
                
            }
        }
    }
}
