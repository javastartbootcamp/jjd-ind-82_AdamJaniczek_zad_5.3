package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category vegetables = new Category("Warzywa", 5);
        Category drinks = new Category("Napoje", 8);
        Product tomato = new Product("Pomidor", vegetables, 5.50);
        Product pepsi = new Product("Pepsi", drinks, 6.00);
        Product shipment = new Product("Wysyłka zamówienia", 10.00);
        GrossPrice tomatoPrice = new GrossPrice(tomato);
        GrossPrice pepsiPrice = new GrossPrice(pepsi);
        GrossPrice shipmentPrice = new GrossPrice(shipment);
        System.out.println(tomatoPrice.canculateTheFinalPrice());
        System.out.println(pepsiPrice.canculateTheFinalPrice());
        System.out.println(shipmentPrice.canculateTheFinalPrice());
    }
}
