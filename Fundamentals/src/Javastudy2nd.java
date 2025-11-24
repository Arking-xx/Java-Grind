public class Javastudy2nd {
     public static void main(String[] args) {
        long l = 1_234_567_890;
        int tenMil = 10_000_000;
        System.out.println(l);
        System.out.println(tenMil);


        int primitiveInt = 10;
         Integer i = primitiveInt;
         System.out.println(i);

         // controlled structure
         int count =  1;
         if(count > 2){
             System.out.println("Count is greater than 2");}
         else {
             System.out.println("Count is lower or equal than 2 ");
         }
         // ternary
         System.out.println(count > 2 ? "Cont is greater than 2" : "Count is lower or equal than 2");


        // switch
         switch(count){
             case 0:
                 System.out.println("Count is equal to 0");
                 break;
             case 1:
                 System.out.println("Count is equal to 1");
                 break;
             default:
                 System.out.println("Count is either negative, or higher than 1");
                 break;
         }



         // for loop
//         for(int c = 1; c <= 50 ; c++){
//             System.out.println(c);
//         }
// while loop
        int whileCounter = 1;
         while (whileCounter <= 50){
             System.out.println(whileCounter);
             whileCounter++;
         }
    }


}
