package grouplearning.corejava.classes;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int age;
    private int mileage;
    public int price;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
