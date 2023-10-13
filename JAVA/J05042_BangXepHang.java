/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class stu implements Comparable< stu >{
    private String name;
    private int correct, summit;

    public stu() {
    }

    public stu(String name, int correct, int summit) {
        this.name = name;
        this.correct = correct;
        this.summit = summit;
    }
    @Override
    public String toString()
    {
        return name + " " + correct + " " + summit;
    }

    @Override
    public int compareTo(stu o) {
        if(this.correct > o.correct)
        {
            return -1;
        }else if(this.correct < o.correct)
        {
            return 1;
        }else{
            if(this.summit < o.summit) return -1;
            else if(this.summit > o.summit) return 1;
            else{
                return this.name.compareTo(o.name);
            }
        }
    }
}
public class J05042_BangXepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<stu> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String s = sc.nextLine();
            int cor = sc.nextInt();
            int sum = sc.nextInt();
            stu x = new stu(s, cor, sum);
            a.add(x);
        }
        Collections. sort(a);
        for ( stu x : a) {
            System.out.println(x);
        }

    }
}
/*
2
Nguyen Van Nam
168 600
Tran Thi Ngoc
168 600
*/