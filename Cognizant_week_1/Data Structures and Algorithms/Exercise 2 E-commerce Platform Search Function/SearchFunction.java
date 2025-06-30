public class SearchFunction {

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = targetName.compareToIgnoreCase(products[mid].productName);

            if (comparison == 0) return products[mid];
            else if (comparison < 0) right = mid - 1;
            else left = mid + 1;
        }
        return null;
    }
}
