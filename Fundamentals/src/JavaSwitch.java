public class JavaSwitch {
    public static void main(String[] args) {
        String animal = "cat";
        String result;
//        switch (animal) {
//            case "dog":
//                result = "domestic animal";
//                break;
//            case "cat":
//                result = "domestic animal";
//                break;
//            case "TIGER":
//                result = "wild animal";
//                break;
//            default:
//                result = "unknown animal";
//                break;
//
//        }
//        System.out.println(result);
//        switch (animal) {
//            case "dog":
//            case "cat":
//                result = "domestic animal";
//                break;
//            case "TIGER":
//                result = "wild animal";
//                break;
//            default:
//                result = "unknown animal";
//                break;
//
//        }
//        System.out.println(result);

//    new switch statement
        switch(animal){
            case "dog", "cat" -> result =  "domestic animal";
//            case "cat" -> result = "domestic animal";
            case "Tiger" -> result = "wild animal";
            default -> result = "unknown animal";
        }

        System.out.println(animal + " is " + result);
    }
}
