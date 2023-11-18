/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class J07030_CapSoNguyenToTrongFile {
    public static final int N =(int) 1e6;
    public static int[] prime = new int [N+1];
    
    public static void sieve()
    {
        Arrays.fill(prime, 1);
        prime [0] = prime[1] = 0;
        for (int i = 2; i <= (int) 1e3; i++) {
            if(prime[i] == 1)
            {
                for (int j = i*i; j <=N; j+=i) {
                    prime[j] =0;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        sieve();
        ObjectInputStream os1 = new ObjectInputStream( new FileInputStream("DATA1.in"));
        List <Integer> a1 = (ArrayList<Integer>) os1.readObject();
        Set<Integer> b1= new TreeSet<>();
        for(Integer i : a1 )
        {
            if(prime[i] == 1)
            {
                b1.add(i);
            }
        }
        ObjectInputStream os2 = new ObjectInputStream( new FileInputStream("DATA2.in"));
        List <Integer> a2 = (ArrayList<Integer>) os2.readObject();
        Set<Integer> b2= new TreeSet<>();
        for(Integer i : a2 )
        {
            if(prime[i] == 1)
            {
                b2.add(i);
            }
        }
        
        for (Integer i : b1)
        {
            Integer k = 1000000 -i;
            if(i>=k){
                break;
            }
            if(b1.contains(k) && !b2.contains(i)  && !b2.contains(k)){
                System.out.println(i + " "+(1000000-i));
            }
        }
        
        
    }
}
