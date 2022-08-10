import projects.forJava.trailpackage;

class Using extends trailpackage{
    public void method(){
        //! Only Public and protected to be accessed through packages
        System.out.println(w); //! Public class be accessed through packages
        System.out.println(x); //! Protected class be accessed through packages
        // System.out.println(y); //* Private Modifiers won't work in packages
        // System.out.println(z); 
    }
}

public class usingPackages {
    public static void main(String[] args) {
        System.out.println("Creating a new sample (UsingPackages)");
        trailpackage t = new trailpackage();
        System.out.println(t.w); //! Only Public class be accessed through packages
        // System.out.println(t.x); //* Protected Modifiers won't work in packages
        // System.out.println(t.y); //* Private Modifiers won't work in packages
        // System.out.println(t.z); //* Default Modifiers won't work in packages

        Using u = new Using();
        u.method();
    }
}
