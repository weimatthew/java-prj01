package grouplearning.corejava.classes;

public class TestPersonAndCat {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Matthew");
        p.setAge(24);

        Person p2 = new Person();
        p2.setName("Kyle");
        p2.setAge(20);

        System.out.println("Matthew's age is " + p.getAge());
        System.out.println("Kyle's age is " + p2.getAge());
    }
}
