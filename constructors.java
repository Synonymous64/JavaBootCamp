class myName{
    String name;
    int weight;
    public myName(String name){
        this.name = name;
        weight = 34;
    }
    public myName(){
        this.name = "Prajwal";
        weight = 59;    
    }
    public void myWeight(){
        this.weight = 21;
    }
    public void myWeight(int weight){
        this.weight = weight;
    }
    public void name(){
        this.name = "YOUHOOO";
    }
    public void name(String name){
        this.name = name;
    }

}
public class constructors {
    public static void main(String[] args) {
        //! constructor called upon here by class name
        myName neek = new myName();
        neek = new myName("Prajwal");
        System.out.println(neek.name + " " + neek.weight);
        //! Constructor called upon class members
        neek.myWeight();
        System.out.println(neek.weight);
        neek.myWeight(234);
        System.out.println(neek.weight);
        neek.name();
        System.out.println(neek.name);
        neek.name("Prajwal");
        System.out.println(neek.name);
    }
}
