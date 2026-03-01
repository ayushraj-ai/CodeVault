import java.util.*;

public class Stock_Price {
    public static int stock_Price(int price[]) {
        // Profit = Selling pricee - buying price.
        int buyprice = Integer.MAX_VALUE;
        int Maxprofit = 0;

        for(int i = 0 ; i < price.length ; i++){
            if(buyprice < price[i]){
               int profit = price[i] - buyprice; //todayprofit
               Maxprofit = Math.max(Maxprofit , profit); //Maxprofit

            }else {
                buyprice = price[i];
            }
        }
        return Maxprofit;
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number of days: ");
            int days = ay.nextInt();

            int prices[] = new int[days];
            for (int i = 0; i < prices.length; i++) {
                System.out.print("Enter Money at day " + i + " is: ");
                prices[i] = ay.nextInt();
            }

            int x = stock_Price(prices);
            System.out.println("Max profit is : " + x);
        }
    }
}
