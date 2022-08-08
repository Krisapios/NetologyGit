public class Main {
    public static void main(String[] args) {
        int[] sales = {1, 4, 66, 31, 15};
        SalesManager allSales = new SalesManager(sales);
        allSales.max();
        System.out.println(allSales.max());
    }
}