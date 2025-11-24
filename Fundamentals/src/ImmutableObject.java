import java.util.*;
import java.util.Date;

public class ImmutableObject {
    public static void main(String[] args){
      List<String> originalCourses = new ArrayList<>();
      originalCourses.add("Math");
      originalCourses.add("Science");

      Date originalDate = new Date();

      //Create immutable student
        ImmutableStudent student = new ImmutableStudent("Alice", 20, originalCourses, originalDate);
        System.out.println("Original:" + student);

            originalCourses.add("History");
            originalDate.setTime(0L);

            System.out.println("after " + student);

            List<String> coursesFromGetter = student.getCourses();
            try{
                coursesFromGetter.add("art");
            }catch (UnsupportedOperationException e){
                System.out.println("Cannot modify courses through getter!");
            }
            Date dateFromGetter = student.getEnrollmentData();
            dateFromGetter.setTime(0L);

        System.out.println("After trying to modify through getters: " + student);
    }
    static public final class ImmutableStudent {
        private final String name;
        private final int age;
        private final List<String> courses;
        private final Date enrollmentDate;
        public ImmutableStudent(String name, int age, List<String>courses, Date enrollmentData){
        this.name = name;
        this.age = age;

        this.courses = new ArrayList<>(courses);
        this.enrollmentDate = new Date(enrollmentData.getTime());
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }

        public List<String>getCourses(){
            return Collections.unmodifiableList(courses);
        }
        public Date getEnrollmentData(){
            return new Date(enrollmentDate.getTime());
        }
        @Override
        public String toString(){
            return "ImmutableStudent{name='" + name + "', age=" + age + ", courses=" + courses + ", enrollmentDate=" + enrollmentDate + '}';
        }
    }
}
