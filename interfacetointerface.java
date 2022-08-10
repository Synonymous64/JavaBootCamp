interface tvRemote{
    public void changeChannel();
    public void increaseVolume();
}
interface smartTVRemote extends tvRemote{   
    public void onAC();
    public void powerCooler();
}
class TV implements smartTVRemote{
    @Override
    public void changeChannel(){
        System.out.println("Channel being changed");
    }
    @Override
    public void increaseVolume(){
        System.out.println("Volume to be increased");
    }
    @Override
    public void onAC(){
        System.out.println("The AC is functioning");
    }
    @Override
    public void powerCooler(){
        System.out.println("The cooler is on");
    }
}
public class interfacetointerface {
    public static void main(String[] args) {
        
    }
}
