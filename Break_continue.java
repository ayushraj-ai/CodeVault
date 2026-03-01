import java.util.*;


public class Break_continue {
    public static void main(String[] args) {

        Scanner ay = new Scanner(System.in);
        while(true) {
            System.out.print("enter number you want to find multipication upto 10: ");
            int n = ay.nextInt();

            //break
            for(int i = 1 ; i <= 10 ; i++){

                int multiplication = n * i;
                if(multiplication % 10 == 0){
                    break;
                }
                System.out.println(multiplication);

            }
            System.out.println("Break ends Here");


            //continue
            for (int i = 1; i <= 10; i++) {

                int multiplication = n * i;
                if (multiplication % 10 == 0) {
                    continue;
                }
                System.out.println(multiplication);
            }
            System.out.println("continue ends here");
        }
    }
}
