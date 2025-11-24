import java.util.Objects;

public class Hashcode {
    public static void  main (String[] args){

        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person("Bob", 30);
//        Person person3 = person1;

//        System.out.println("Person1 hascode" + person1.hashCode());
//        System.out.println("Person2 hascode" + person2.hashCode());
//        System.out.println("Person1 hascode" + person3.hashCode());
//
//        System.out.println("person1.equals(person2)" + person1.equals(person2));

        System.out.println("person1.equals(person2)" + person1.equals(person2));
        System.out.println("person1.hashCode() == person2.hashCode(): " + (person1.hashCode() == person2.hashCode()));
        System.out.println("person1.equals(person3)" + person1.equals(person3));


    }
//  static class Person{
//        String name;
//        int age;
//
//        Person (String name, int age){
//            this.name = name;
//            this.age = age;
//        }
//    }
       static class Person {
        String name;
        int age;
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        @Override
    public boolean equals(Object o){
            if(this == o) return true;
            if(o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }
        @Override
    public int hashCode(){
            return Objects.hash(name, age);
        }
}
}
