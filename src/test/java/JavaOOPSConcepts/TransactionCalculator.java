package JavaOOPSConcepts;

public class TransactionCalculator {
    int profit;
    public int calculateProfit(int revenue, int exp1){
        profit = revenue - exp1;
        return profit;
    }
    public int calculateProfit(int revenue, int exp1, int exp2){
        profit = revenue - (exp1+exp2);
        return profit;
    }
    public int calculateProfit(int revenue, int exp1, int exp2, int exp3){
        profit = revenue - (exp1+exp2+exp3);
        return profit;
    }
}
