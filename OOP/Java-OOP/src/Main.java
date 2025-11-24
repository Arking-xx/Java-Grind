import com.fake.Car;
import com.fake.AbtractClass;

public class Main {
    public static void main(String[] args) {
        Car focus = new Car("Ford", "Focus", "red"); // created during runtime
        focus.increaseSpeed(10);

        AbtractClass myCar = new AbtractClass("Toyota");

        myCar.start();
        myCar.stop();
        myCar.honk();

        System.out.println("Initial Speed " + focus.getSpeed());
    }
}