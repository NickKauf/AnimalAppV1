public class Mouse extends Animal {
    public Mouse(){
        System.out.println("I am a mouse");
    }

    @Override
    public String eat(){
        return "a mouse eats";
    }

    @Override
    public String sleep(){
        return "a mouse sleeps...";
    }
    public String squeak(){
        return "a mouse squeaks...";
    }

}
