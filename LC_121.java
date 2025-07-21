
//     public static void main(String[] args) {
//         int[] prices = {7,1,5,3,6,4};
//         System.out.println(maxProfit(prices));
//     }
//     public static int maxProfit(int[] prices) {
//         List<Integer> ans = new ArrayList<>();
//         int maxProfit = 0;
//         for(int i=0 ; i < prices.length; i++){
//             int max = Integer.MIN_VALUE;
//             for(int j = i ; j < prices.length; j++){
//                 if(prices[j]>max){
//                     max = prices[j];
//                 }
//             }
//             if(max > prices[i]){
//                 ans.add(max-prices[i]);
//             }
//             if(max>prices[i]){
//                 ans.add(max-prices[i]);
//             }
//         }
//         for (int i = 0; i < ans.size(); i++) {
//             if(ans.get(i) > maxProfit){
//                 maxProfit = ans.get(i);
//             }
//         }

//         return maxProfit;
//     }
// }

public class LC_121 {
    public static void main(String[] args) {
        int[] prices = {7, 15,1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));  // Output: 5
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
 
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
}

