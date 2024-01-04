/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class J08022_PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            int n = sc.nextInt();
            int [] a = new int[n];
            int [] d = new int [n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                d[i] = -1;
            }
            Stack <Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                
                if(!st.isEmpty() && a[st.peek()] < a[i]){
                    while(!st.isEmpty() && a[st.peek()] < a[i]){
                        d[st.peek()] = a[i];
                        st.pop();
                    }
                    
                    st.add(i);
                }else{
                    st.add(i);
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(d[i] +" ");
            }
            System.out.println();
        }
    }
}
/*
3
4
4 5 2 25
3
2 2 2
4
4 4 5 5
*/