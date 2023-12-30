package pl.javastart.task;

public class GrossPrice {
    private Product product;

    public GrossPrice(Product product) {
        this.product = product;
    }

    double canculateTheFinalPrice() {
        String category = product.getCategory();
        double vat = switch (category.toLowerCase()) {
            case "drinks":
                yield 0.08;
            case "vegetables":
                yield 0.05;
            default:
                yield 0.23;
        };
        return product.getNetPrice() + (product.getNetPrice() * vat);
    }
}
