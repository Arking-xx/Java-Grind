package com.fake;

public final class Cat {
    private int weight;

//    public Cat(int weight) {
//        this.weight = weight;
//    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public int getWeight() {
        return weight;
    }

}


// would cause compiler error because of final keyword in parent class
//public class BlackCat extends Cat {
//}

// same with methods, variables and primitive variables if it's already marked as final keyword
// but for final reference variables example with this:
//    final Cat cat = new Cat()
//
// well see a compiler error
// but, it doesn't mean the object refers to it is immutable
// we can still change property instance of it.

// we can also use final keyword inside of parameter
// public void method(final int x ){
//
//}














