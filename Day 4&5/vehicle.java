public class Vehicle { 
        public void start() {
        System.out.println("two vehicles");
    }
}
public class Car extends Vehicle {
    public void start() {
    System.out.print("BMW");
    }
}
public class Bike extends Vehicle {
    public void start() {
    System.out.print("R15");
    }
}
public class Main { 
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start(); 
    }
}
