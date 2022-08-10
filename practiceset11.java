abstract class Pen{
    abstract public void write();
    abstract public void refill();
}
class FoundationPen extends Pen{
    @Override
    public void write(){
        System.out.println("The pen is ready to be written");
    }
    @Override
    public void refill(){
        System.out.println("The pen needs to refill");
    }
    public void changeNib(){
        System.out.println("The nib needs to change");
    }
}
interface BasicAnimals{
    public void eats();
    public void sleeps();
}
class Monkey{
    public void jump(){
        System.out.println("Monkey is Jumping");
    };
    public void bite(){
        System.out.println("Monkey began to bite");
    }

}
class Humans extends Monkey implements BasicAnimals{
    public void study(){
        System.out.println("Humans are studying");
    }
    public void pianoLessons(){
        System.out.println("Human taking piano Lessons");
    }
    @Override
    public void eats(){
        System.out.println("From eats method of interface");
    }
    @Override
    public void sleeps(){
        System.out.println("From sleep method of interface");
    }
}
public class practiceset11 {
    public static void main(String[] args) {
        Monkey m = new Humans();
        m.bite();
        m.jump();
    }
}
