import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class J07015_SoNguyenToKhacNhauTrongFileNhiPhan {
    public static int[] prime = new int[10000];
    public static void sieve()
    {
        Arrays.fill(prime, 1);
        prime[0]=prime[1]=0;
        for(int i=2;i<=100;i++)
        {
            if(prime[i]==1)
            {
                for(int j=i*i;j<10000;j+=i)
                {
                    prime[j]=0;
                }
            }
        }

    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sieve();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> list = (List<Integer>) ois.readObject();
        int [] d= new int[10000];
        for ( Integer i : list)
        {
            d[i]+=prime[i];
        }
        for(int i=2;i<10000;i++)
        {
            if(d[i]>0)
            {
                System.out.println(i+" "+d[i]);
            }
        }


    }
}
