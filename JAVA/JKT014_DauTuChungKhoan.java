/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JKT014_DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] d = new int[n];
            for(int i =0;i<n;i++)
            {
                a[i] = sc.nextInt();
                d[i] = 1;
            }
            Stack <Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                if(!st.isEmpty() && a[i] >= a[st.peek()]){
                    while(!st.isEmpty() && a[i] >= a[st.peek()]){
                        st.pop();
                    }
                    if(!st.isEmpty()){
                        d[i] = i - st.peek();
                    }else{
                        d[i] = i+1;
                    }
                    
                    st.add(i);
                }else{
                    st.add(i);
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(d[i]+" ");
                
            }
            System.out.println();
        }
    }
}
/*
1
7
100 80 60 70 60 75 85
*/