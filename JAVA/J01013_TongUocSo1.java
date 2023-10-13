/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Lycuy
 */
import java.util.Scanner;
public class J01013_TongUocSo1 {
    public static Scanner ip = new Scanner (System.in);
    public static final int N=(int) 2e6;
    public static  int[] prime= new int[N+5];
    // tim uoc so nguyen to nho nhat cua n
    public static void sang()
    {
        for(int i=2;i<=Math.sqrt(N);i++)
        {
            if(prime[i]==0)
            {
                for (int j=i;j<=N;j+=i)
                {
                    prime[j]=i;
                }
            }
        }
        for(int i=2;i<=N;i++)
        {
            if( prime[i]==0){
                prime[i]=i;
            }
        }
    }
    public static int slove(int n)
    {
        if(prime[n]==0){
            return n;
        }
        int sum=0;
        while( n!=1)
        {
            sum+=prime[n];
            n=n/prime[n];
        }
        return sum;
    }
    public static void main(String[] args) {
        sang();
        int n= ip.nextInt();
        long sum=0;
        while(n-->0)
        {
            int x=ip.nextInt();
//            System.out.println(slove(x));
            sum+=slove(x);
            
        }
        System.out.println(sum);
    }
    
}
