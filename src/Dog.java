public class Dog extends Animal {
    public Dog(){
        System.out.println("Now I am a Dog!");
    }

    @Override
    public String sleep(){
        return "A Dog Sleeps...";
    }

    @Override
    public String eat(){
        return "A Dog Eats...";
    }

    public String bark(){
        return "A Dog Barks!";
    }


}
