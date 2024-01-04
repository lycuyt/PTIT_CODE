/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
import java.util.Stack;
public class J08020_KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char k = s.charAt(i);
                if(!st.isEmpty() && ((st.peek() == '(' && k == ')')
                      || (st.peek() == '{' && k == '}') 
                        ||(st.peek() == '[' && k == ']'))){
                    
                    
                    st.pop();
                }else{
                    st.add(k);
                }
//                System.out.println(st.size());
            }
            
            if(st.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");}
        }
    }
}
/*
2
[()]{}{[()()]()}
[(])
*/