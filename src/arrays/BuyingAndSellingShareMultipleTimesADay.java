package arrays;

public class BuyingAndSellingShareMultipleTimesADay

 {

    public static void main(String[] args)
    {

        int[] sharePrice = {10,22,5,4,75,65,80};

        int maxProfit = maxProfit(sharePrice);
        System.out.println("Maximum Profit fetched = " + maxProfit);

    }

    public static int maxProfit(int[] arr)
    {
        int totalProfit = 0;
        for(int i = 1; i < arr.length; i++)
        {
            int currentProfit = arr[i] -arr[i-1];
            if(currentProfit > 0)
            {
                totalProfit += currentProfit;
            }
        }

        return totalProfit;
    }
}
