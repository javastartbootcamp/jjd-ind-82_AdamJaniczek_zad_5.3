package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Product tomato = new Product("Pomidor", "vegetables", 5.50);
        Product pepsi = new Product("Pepsi", "drinks", 6.00);
        Product shipment = new Product("Wysyłka zamówienia", "logistics", 10.00);
        Product accountant = new Product("Obsługa księgowości", 500.00);
        GrossPrice tomatoPrice = new GrossPrice(tomato);
        GrossPrice pepsiPrice = new GrossPrice(pepsi);
        GrossPrice shipmentPrice = new GrossPrice(shipment);
        GrossPrice accountantPrice = new GrossPrice(accountant);
        System.out.println(tomatoPrice.canculateTheFinalPrice());
        System.out.println(pepsiPrice.canculateTheFinalPrice());
        System.out.println(shipmentPrice.canculateTheFinalPrice());
        System.out.println(accountantPrice.canculateTheFinalPrice());
    }
}
