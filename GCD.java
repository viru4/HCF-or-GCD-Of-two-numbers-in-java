
import static java.lang.Double.min;
import java.util.Scanner;

public class GCD {
    public static void gcd1(int a, int b) {
        //method1
        int gcd=1;
        for (int i = 1; i < min(a,b); i++) {
            if (a % i== 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("the HCF/GCD is :" + gcd);
    }

    //method 2
    public static void gcd2(int a, int b) {
        int gcd=1;
        for (int i = (int)min(a, b); i >=1; i--) {
            if (a % i== 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("the HCF/GCD is :" + gcd);
    }

    //method3 with EUCLIDEAN ALGORITHM i.e.
    //HCF(a,b)=HCF(a-b,b) where a>b;
    //or we can say HCF(a,b)=HCF(a%b,b) where a>b;
    public static void gcd3(int a, int b){
        while(a>0&&b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            System.out.println("The HCF is:"+b);
        }
        else{
            System.out.println("The HCF is: "+a);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        gcd3(a, b);
    }
}
