interface Bicycle{
    public int speet = 10; //! Only member functions are important to export to the sub classes
    void applyBrakes(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    public int speet2 = 11; //! Only member functions are important to export to the sub classes
    void applyHorn(int decrement);
    void speedUpHorn(int increment);
}
class Hercules implements Bicycle, HornBicycle{ //! implementation of multiple interfaces
    void blowHorn(){
        System.out.println("The horn is blown");
    }
    @Override
    public void applyBrakes(int decrement){
        System.out.println("Applying the brake for " + decrement + " secs");
    }
    @Override
    public void speedUp(int increment){
        System.out.println("Speeding up for " + increment + " secs");
    }
    @Override
    public void applyHorn(int increment){
        System.out.println("Applying horn for " + increment + " secs");
    }
    @Override
    public void speedUpHorn(int increment){
        System.out.println("Speeding up Horn for " + increment + " secs");
    }

}
public class interfaces {
    public static void main(String[] args) {
        Hercules cycle = new Hercules();
        cycle.applyBrakes(9);
        cycle.speedUp(8);
        System.out.println(cycle.speet);
        //* You can create properties in interfaces
        //* You cannot modify the properties int interface 
        //! Example --> 🎯
        // cycle.speet = 9; //! Not modifiable 🚫
        cycle.blowHorn();
        cycle.applyHorn(7);
        cycle.speedUpHorn(39);
        
    }
}
