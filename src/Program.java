import java.io.*;
class Car implements AutoCloseable {
    public void close() {
        System.out.println("Машина закрывается...");
    }

    public void drive() {
        System.out.println("Машина поехала.");
    }
}
public class Program {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}