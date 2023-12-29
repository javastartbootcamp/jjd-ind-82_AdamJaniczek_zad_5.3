package pl.javastart.task;

public class GrossPrice {
    private Product product;

    public GrossPrice(Product product) {
        this.product = product;
    }

    double canculateTheFinalPrice() {
        String category = product.getCategory();
        switch (category.toLowerCase()) {
            case "drinks":
                return product.getNetPrice() * 0.08 + product.getNetPrice();
            case "vegetables":
                return product.getNetPrice() * 0.05 + product.getNetPrice();
            default:
                return product.getNetPrice() * 0.23 + product.getNetPrice();
        }
    }
}
