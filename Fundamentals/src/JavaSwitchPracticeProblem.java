import java.util.Scanner;

public class JavaSwitchPracticeProblem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your grade");
        String grade = scanner.next().toUpperCase();
        String result;
        switch (grade){
            case "A" -> result = "excellent";
            case "B" -> result = "Good job";
            case "C" -> result = "Fair";
            case "D" -> result = "Need improvement";
            case "F" -> result = "Failed";
            default -> result = "invalid grade";
        }
        System.out.println("Grade " + grade  + ": " + result);
        scanner.close();

    }
}
