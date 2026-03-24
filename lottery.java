import java.util.Scanner;
public class lottery{
    public static int reverse(int x){
        int d=x%10;
        x=(d*10)+(x/10);
        return x;
    }
    public static boolean check(int a, int b){
        int a1=a%10;
        int a2=a/10;
        int b1=b%10;
        int b2=b/10;
        boolean x= false;
        if(a1==b1 || a1==b2 || a2==b1 || a2==b2){
            x =true;
        }
        return x;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=(int)(10+(Math.random()*90));
        System.out.print("enter your number: ");
        int ans = sc.nextInt();
        if(ans==x){
            System.out.println("Congratulations You win $10,000");
        }
        else if(x==reverse(ans)){
            System.out.println("Congratulations You win $5,000");
        }
        else if(check(x, ans)){
            System.out.println("Congratulations You win $1,000");
        }
        else{
            System.out.println("Sorry");
        }
        sc.close();
        System.out.println("Number was "+x);
    }
}