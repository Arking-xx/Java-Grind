import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int[] anArray;

        int anotherArray[];

        // need to define the lenght of array
        anArray = new int[10];
        System.out.println("Array length is: " + anArray[0]);

        // directly set values
        anotherArray = new int[] { 1,2,3,4,5};
        System.out.println("Array length is: " + anotherArray[2]);

        for(int i : anotherArray){
            System.out.println(i);
        }

        List<Integer> aList = new ArrayList<>();
        for ( int x : anotherArray ){
            aList.add(x);
        }

        Integer arrays[] = new Integer[] {1,2,3,4,5};
        List<Integer> list = Arrays.asList(arrays);


        // array into stream
        String[] arrayString=  new String[] {"Milk", "Tomato", "Chips"};
        Stream<String> aStream = Arrays.stream(arrayString);

        int[] resultArray = new int[anotherArray.length + arrays.length];
        Arrays.setAll(resultArray, i -> (i < anotherArray.length ?  anotherArray[i] : anotherArray[i - anotherArray.length]));

        System.out.println(Arrays.toString(resultArray));

        // Arraylist
        // difference between normal array and arraylist, is from tools
        // like numList.add or numList.remove() normal array don't have these methods built
        // also normal array have fixed size unlike to ArrayList its dynamic when use
        // but ArrayList can't store Primitives only Object wrappers (Integer, Doublet etc)

        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);

        }
    }