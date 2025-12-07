import com.fake.Car;
import com.fake.AbtractClass;
import com.tesla.Tesla;
import com.fake.Manager;
import com.fake.Developer;
import com.fake.Cat;
import com.fake.PersonRecord;
import com.fake.Pizza;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;


enum Priority {
    HIGH, MEDIUM, LOW
}


public class Main {
    public static void main(String[] args) {
        Car focus = new Car("Ford", "Focus", "red"); // created during runtime
        focus.increaseSpeed(10);

        AbtractClass myCar = new AbtractClass("Toyota");
        Cat blackCat = new Cat();
        blackCat.setWeight(1);
        System.out.println("Cat weight is " + blackCat.getWeight());

        // enums
        Pizza newPizza = new Pizza();
        newPizza.setStatus(Pizza.PizzaStatus.READY);
        System.out.println(newPizza.getStatus());

        // record example
        PersonRecord person = new PersonRecord("elina", 23);
        // automatic getters
        System.out.println(person.name());
        // automatic toString()
        System.out.println(person);
        // automatic equals() and hashcode()
//        System.out.println(person.equals());
//        System.out.println(person.hashCode());

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

        //faster than HashMap, there's also an EnumSet
        EnumMap<Priority, String> enumMap = new EnumMap<>(Priority.class);
        enumMap.put(Priority.HIGH, "Urgent");
        enumMap.put(Priority.MEDIUM, "Normal");
        enumMap.put(Priority.LOW, "When possible");

//        Map<String, Integer> nameMap = new HashMap<>();
//        Integer value = nameMap.computeIfAbsent("John", s -> s.length());
//        System.out.println("Namemap: " + value);

        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 4000);
        salaries.put("Freedy", 9000);
        salaries.put("Samuel", 5000);

        salaries.replaceAll((name, oldValue) -> name.equals("Freedy") ? oldValue : oldValue + 1000);
        System.out.println(salaries);

        fetachData(result -> {
            System.out.println("Received: " + result);
        });
    }

    public static void fetachData(Consumer<String> callback) {
        String data = "Hello from callback";

        callback.accept(data);
    }
}