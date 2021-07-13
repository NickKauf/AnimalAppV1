/*
 * All Birds are Animals but all Animals are not Birds
 */
public class Bird extends Animal {
    public Bird() { //basic constructor
        System.out.println("A bird is hatched...");   //this method shows inheritance
    }


    @Override
    public String sleep() {
        return "A bird sleeps soundly...";   //this method shows polymorphism
    }

    @Override
    public String eat() {
        return "A bird eats...";
    }


    public String fly() {  //method unique to bird class
        //Birds can fly but other animals can't so this method
        //is unique to the Bird class
        return "A bird flies...";     //this method shows encapsulation
    }
}
