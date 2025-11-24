import com.myapp.utilities.Message;
import com.passparamandrefrence.PassByValueDemo;
import com.passparamandrefrence.PassByReference;

import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args){
        String a = "first hello world";
        int b = 10;
        int c = 5;
        char toggler = 'Y';
        boolean isVerified  = true;
        double d = b + c;
        System.out.println(b + " + " + c + " = " + d );
        System.out.println(a);

        // array

        int [] numbers = new int[100];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        int thirdElement  = numbers[2];
        int lengthOfArray = numbers.length;
        System.out.println(lengthOfArray);
        System.out.println(thirdElement);

        // arithmetic operators
        // + (plus or addition; also used for string concatenation)
        //– (minus or subtraction)
        //* (multiplication)
        //          / (division)
        //        % (modulus or remainder)

        // Logical Operators

        // &&
        // ||
        // ! (Not)

        int number = 6;
        if(number % 2 == 0 && number % 3 == 0 ){
            System.out.println(number + " is divisible by 2 AND 3 " );
        }


        if( number % 2 == 0 || number % 5 == 0){
            System.out.println(number + " is divisible by 2 OR 5");
        }



        boolean result = canVote(17);
        System.out.println(result);

        ///  call message package
//        Message.printMessage("hello world");

        ///  pass value
//        PassByValueDemo.passValue(10);

        /// pass by reference
//        PassByReference.objectPassingDemo("alice");


        printNumbers();
        printNumbers(1);
        printNumbers(1,2);
        printNumbers(1,2,3,4,5);


    }

    public static boolean canVote(int age){
        if(age < 18){
            return false;
        }
        return true;
    }

    public static void printNumbers(int...numbers){
        System.out.println("Numbers of arguments" + numbers.length);
        for(int number: numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}