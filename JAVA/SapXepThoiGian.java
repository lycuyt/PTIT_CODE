import java.util.Scanner;

class  time{
    int hour, min, se;
    public time(){

    }
    public time(int hour, int min, int se){
        this.hour = hour;
        this.min = min;
         this.se = se;
    }
    public int getTime(){
        return hour*60*60+min*60+se;
    }
    @Override
    public String toString()
    {
        return hour+" "+min+" "+se;
    }
}
public class SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        time [] arr= new time[n];
        for (int i=0;i<n;i++){
            int  a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr[i]= new time(a, b, c);

        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(arr[i].getTime()<arr[j].getTime()){
                    time tmp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
}
