public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileObserver = new MobileApp("InvestNow");
        Observer webObserver = new WebApp("TradeDesk");

        stockMarket.registerObserver(mobileObserver);
        stockMarket.registerObserver(webObserver);

        System.out.println("\nStock price update #1:");
        stockMarket.setStockData("TCS", 3575.50);

        System.out.println("\nStock price update #2:");
        stockMarket.setStockData("INFY", 1498.30);

        stockMarket.removeObserver(webObserver);

        System.out.println("\nStock price update #3 (after removing WebApp):");
        stockMarket.setStockData("RELIANCE", 2820.00);
    }
}
