// class Solution {
//     public int maxProfit(int[] prices) {
//         int maxprofit =0;
        
//         for(int i=1;i<prices.length;i++){
//             int buyprice = prices[i-1];
//             int sellprice= prices[i];
//             int currprice = sellprice - buyprice;
//             if (currprice > maxprofit){
//                 maxprofit = currprice; 
//                 currprice = 0;

//             }

//         }
//         return maxprofit;
        
//     }
// }


class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int buyprice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int sellprice = prices[i];
            int currprice = sellprice - buyprice;

            if (currprice > maxprofit) {
                maxprofit = currprice;
            }

            if (prices[i] < buyprice) {
                buyprice = prices[i];
            }
        }

        return maxprofit;
    }
}
