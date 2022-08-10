abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();

}
class SmartPhone extends Telephone{
    @Override
    public void ring(){
        System.out.println("The phone is ringing.");
    }
    public void lift(){
        System.out.println("The phone needs to lift.");
    }
    public void disconnect(){
        System.out.println("The phone is disconnected.");
    }
    public void playAudio(){
        System.out.println("The audio is playing.");
    }
    public void playGame(){
        System.out.println("The game being played.");
    }
}
public class practicepolymorphism {
    public static void main(String[] args) {
        Telephone t = new SmartPhone();
        t.disconnect();
        t.ring();
        t.lift();
    }
}
