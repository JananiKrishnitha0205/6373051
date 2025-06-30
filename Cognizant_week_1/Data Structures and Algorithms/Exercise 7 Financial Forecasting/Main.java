public class Main {
    public static void main(String[] args) {
        double principal = 10000; // Starting amount
        double rate = 0.10; // 10% annual growth
        int years = 5;

        double result = Forecast.futureValue(principal, rate, years);
        System.out.printf("Future Value (Recursive) after %d years: ₹%.2f\n", years, result);

        // Optional: Using memoized version
        double[] memo = new double[years + 1];
        double memoResult = Forecast.futureValueMemo(principal, rate, years, memo);
        System.out.printf("Future Value (Memoized) after %d years: ₹%.2f\n", years, memoResult);
    }
}
