import java.util.ArrayList;
import java.util.Scanner;
import com.Controller;

public class Main {
    public static void main(String[] args) {

        ArrayList<Controller> newTodo = new ArrayList<Controller>();
        Scanner scanner = new Scanner(System.in);
        String todo;

        do{
           System.out.println("Enter new todo or type \"no\" to exit the program");

           todo = scanner.nextLine().toLowerCase();
           Controller a = new Controller(todo);
           newTodo.add(a);

           if(!todo.equals("no")){
               for(Controller t : newTodo){
                   System.out.println("New todo Created: " + t.getTodo());
               }
           }
        }while(!todo.equals("no"));
        scanner.close();

        System.out.println("Program exit");

        System.out.println("All Task today");
        for(Controller t : newTodo){
            System.out.println(t.getTodo());
        }
        }
    }