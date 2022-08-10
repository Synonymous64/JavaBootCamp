interface  myCamera{
    void takeSnap();
    void recordVideo();
    // ! You can't update any interface you have to make every abstract method to the class
    //! Using default you can use method without implementing
    private void greet(){ //* this is hou you can use private method to build the logic in other function and implement to some other 
        System.out.println("Morning Mate");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording Videos");
    }; 
}
interface myWifi{
    String[] getNetwork();
    void connectToBroadband(String netWork);
}
interface myGPS{
    void findlocation();
}
class myCellphone{
    void callNumber(){
        System.out.println("CALLING THE NUMBER");
    }
    void pickCall(){
        System.out.println("PICK YOUR CALL");
    }
}
class mySmartPhone extends myCellphone implements myCamera, myWifi, myGPS{
    public void recordAudio(){
        System.out.println("RECORDING AUDIO");
    }
    public void takeSnap(){
        System.out.println("SNAP HAS BEEN TAKEN");
    }
    public void recordVideo(){
        System.out.println("VIDEO RECORDING IN PROGRESS");
    }
    @Override //! it's entirely your choice if you want to override you can if not then it won't be displaying any error 
    // public void record4kVideo(){
    //     System.out.println("4K VIDEO RECORDING IN PROGRESS");
    // }
    public String[] getNetwork(){
        String[] myNetworks = {"PU89","PSLV1","ROCKY13"};
        return myNetworks;
    }
    public void connectToBroadband(String netWork){
        netWork = "PSLV1";
        System.out.println("CONNECTED TO PSLV" + netWork);
    }
    public void findlocation(){
        System.out.println("LOCATION FOUND");
    }

}
public class interfacesexampleanddefault {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        ms.record4kVideo();
        // ms.greet(); //* Throws an error
        String[] Networks = ms.getNetwork();
        for(String s : Networks){
            System.out.print(s + " ");
        }
    }
}
