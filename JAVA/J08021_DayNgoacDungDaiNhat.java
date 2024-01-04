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
public class J08021_DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char k = s.charAt(i);
                if(!st.isEmpty() && ((s.charAt(st.peek()) == '(' && k == ')')
                      || ((s.charAt(st.peek()) == '{' && k == '}')) 
                        ||((s.charAt(st.peek())) == '[' && k == ']'))){
                    
                    
                    st.pop();
                }else{
                    st.add(i);
                }
//                System.out.println(st.size());
            }
            int [] a = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                a[i] = -1;
            }
            while(!st.isEmpty())
            {
                a[st.peek()] = st.peek();
//                System.out.println(st.peek());
                st.pop();
            }
            
//            System.out.println();
            // dem xau co nhieu 0 nhat
            int j = 0;
            int dem =0, cnt =0;
            while(j<s.length())
            {
                if(a[j] == -1)
                {
                    dem++;
                    cnt = Math.max(dem,cnt);
                    j++;
                }else{
                    dem =0;
                    j++;
                }
                
            }
            System.out.println(cnt);
        }
    }
}
/*
3
((()
)()())
()(()))))
*/