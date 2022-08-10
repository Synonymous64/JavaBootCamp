@FunctionalInterface
interface anonFace1{
    void meth1(int a);
    // void meth2();
}
interface anonFace{
    void meth1();
    void meth2();
}
// class anonymousClass implements anonFace{
//     public void display(){
//         System.out.println("This is about dispalying the function");
//     }
//     @Override
//     public void meth1(){
//         System.out.println("This is about meth1");
//     }
//     public void meth2(){
//         System.out.println("This is about meth2");
//     }
// }
public class anonymousclassandlambda {
    public static void main(String[] args) {
        // anonymousClass c = new anonymousClass();
        // c.display();
        // c.meth1();
        // c.meth2();
        //! This is named as an anonymous class
        anonFace f = new anonFace() {
            @Override
            public void meth1(){
                System.out.println("This is about meth1");
            }
            @Override
            public void meth2(){
                System.out.println("This is about meth2");
            }
        };   
        f.meth1();
        f.meth2();     
        //!This is named as Lambda expression
        // anonFace1 g = new anonFace1() {
        //     @Override
        //     public void meth1(){
        //         System.out.println("This is the lambda expression example for functionalinterface annotations");
        //     }
        // };
        // g.meth1();
        //! Lambda Expression better way to instantianized and also with arguments
        anonFace1 g = (a)->{ //* Don't have to write datatype just directly a(arguments)
            System.out.println("This is aout lambda expression example for functionalinterface annotation " + a);
        };
        g.meth1(4);
    }
}
