public class inhertance {
    public static void main(String[] args) {
        dogs kutta = new dogs();
        kutta.eat();

        kutta.breeds = "German shepherd";
        System.out.println(kutta.breeds);

        kutta.bark();
    }
}
class animal{
    String Name;

    void eat(){
        System.out.println("Eat");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

class mammal extends animal{
    int legs;
}

class dogs extends mammal{
    String breeds;

    void bark(){
        System.out.println("BHOW BHOW...");
    }
}