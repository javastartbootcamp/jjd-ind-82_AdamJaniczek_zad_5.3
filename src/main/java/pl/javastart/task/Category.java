package pl.javastart.task;

public class Category {
    private String name;
    private int valueOfVat;

    public Category(String name, int valueOfVat) {
        this.name = name;
        this.valueOfVat = valueOfVat;
    }

    public Category(String name) {
        this.name = name;
    }

    public Category() {
        this.name = "Brak kategorii";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValueOfVat() {
        return valueOfVat;
    }

    public void setValueOfVat(int valueOfVat) {
        this.valueOfVat = valueOfVat;
    }
}
