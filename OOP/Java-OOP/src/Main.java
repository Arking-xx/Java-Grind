import com.fake.Car;
import com.fake.AbtractClass;
import com.tesla.Tesla;
import com.fake.Manager;
import com.fake.Developer;

public class Main {
    public static void main(String[] args) {
        Car focus = new Car("Ford", "Focus", "red"); // created during runtime
        focus.increaseSpeed(10);

        AbtractClass myCar = new AbtractClass("Toyota");

//        myCar.start();
//        myCar.stop();
//        myCar.honk();
//
//        System.out.println("Initial Speed " + focus.getSpeed());

//        Tesla mySecondCar = new Tesla("Model S", 2020);
//        mySecondCar.displayInfo();
//        mySecondCar.navigate("Home");

        Manager manager = new Manager("Hark", 70000, "Engineering");

        System.out.println(manager.getName());
        System.out.println(manager.getSalary());
        manager.work();
        manager.conductingMeeting();

    }
}