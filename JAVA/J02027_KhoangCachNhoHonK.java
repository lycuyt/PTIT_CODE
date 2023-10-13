import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class J02027_KhoangCachNhoHonK {
    public static int findFirstGreaterOrEqual(List<Integer> sortedArray, int target) {
        int left = 0;
        int right = sortedArray.size();

        while (left < right) {
            int mid = left + (right - left) / 2;
            int  midValue = sortedArray.get(mid);

            if (midValue-(target) < 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            // int [] a = new int[n];
            List<Integer> a = new ArrayList<>();
            for (int i=0;i<n;i++)
            {
                a.add(sc.nextInt());
            }
            long cnt =0;
            Collections.sort(a);
            for(int i =0;i<a.size();i++)
            {
                int idx = findFirstGreaterOrEqual(a, a.get(i) + k);
                if(idx >=0)
                {
                    cnt += idx -i-1;
                }
                
            }
            System.out.println(cnt);
        }
    }
}
