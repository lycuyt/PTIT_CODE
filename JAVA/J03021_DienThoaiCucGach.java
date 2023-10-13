import java.util.Scanner;

public class J03021_DienThoaiCucGach {
    public static boolean check (String s)
    {
        for (int i=0;i<s.length()/2;i++){
            char a= s.charAt(i);
            char b= s.charAt(s.length()-i-1);
            if (a!= b) return false;
        }
        return true;
    }
    public static void slove(String a)
    {
        String res="";
        for(int i=0;i<a.length();i++)
        {
            char c= a.charAt(i);
            if(c=='a' || c=='b' || c=='c'){
                res+="2";
            }else if(c=='d'|| c=='e'|| c=='f'){
                res+="3";
            }else if(c=='g'|| c=='h'|| c=='i'){
                res+="4";
            }else if(c=='j'|| c=='k'|| c=='l'){
                res+="5";
            }else if(c=='m'|| c=='n'|| c=='o'){
                res+="6";
            }else if ( c=='p'|| c=='q'|| c=='r'|| c=='s'){
                res+="7";
            }
            else if( c=='t'|| c=='u'|| c=='v'){
                res+="8";
            }
            else{
                res+="9";
            }
            
            
        }
        if(check(res)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
    }
    public static void main(String[] args) {
                Scanner ip = new Scanner(System.in);
                int t= ip.nextInt();
                while(t-->0)
                {
                    String a= ip.next().toLowerCase();
                    slove(a);
                }
            }
}
