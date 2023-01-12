package grouplearning.corejava.classes;

public class CarTest {
    public static void main(String[] args) {

        //Below is Car 1
        
        Car c = new Car();
        c.setBrand("Lexus");
        c.setModel("LS 2018");
        c.setColor("Grey");
        c.setAge(2);
        c.setMileage(15000);
        c.setPrice(12000);

        Car c2 = new Car();
        c2.setBrand("Infiniti");
        c2.setModel("G37x 2019");
        c2.setColor("Silver");
        c2.setAge(4);
        c2.setMileage(20000);
        c2.setPrice(14000);

        System.out.println("Car 1's brand is " + c.getBrand());
        System.out.println("Car 2's brand is " + c2.getBrand());

        System.out.println("Car 1's model is " + c.getModel());
        System.out.println("Car 2's model is " + c2.getModel());

        System.out.println("Car 1's mileage is " + c.getMileage());
        System.out.println("Car 2's mileage is " + c2.getMileage());
    }

}
