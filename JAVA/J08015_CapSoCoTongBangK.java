/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class J08015_CapSoCoTongBangK {
    public static long lower_bound(long[] a, int l, int r, long x){
        long ans = r+1;
        while(l<=r)
        {
            int m = (l+r)/2;
            if(a[m] == x)
            {
                ans = m;
                r = m - 1;
            }else if(a[m]>=x)
            {
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return ans;
    }
    public static long upper_bound(long[] a, int l, int r, long x){
        long ans = r+1;
        while(l<=r)
        {
            int m = (l+r)/2;
            if(a[m] == x)
            {
                ans = m;
                l = m+1;
            }else if(a[m]>=x)
            {
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long [] a = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                
            }
            Arrays.sort(a);
            long cnt = 0;
            for (int i = 0; i < n-1; i++) {
                long d1 = lower_bound(a, i+1, n-1, k-a[i]);
                long d2 = upper_bound(a, i+1, n-1, k-a[i]);
//                System.out.println(d1+" "+d2);
                if(d1<=n-1)
                {
                    cnt += d2-d1 +1;
                }
                
            }
            
            System.out.println(cnt);
        }
    }
}
