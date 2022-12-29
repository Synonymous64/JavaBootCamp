public class innerClass {
    public void run() {
        System.out.println("This is run method");
    }

    // ! for non static class
    class myInnerClass {    //* InnerClass$myInnerClass
        public void runThisShit() {
            System.out.println("This shit is running!");
        }
    }

    // ! for static class
    static class mySecondInnerClass {
        public void runThisdeeperShit() {
            System.out.println("This deeper is running too!");
        }
    }

    public static void main(String[] args) {
        innerClass c = new innerClass();
        innerClass.myInnerClass obj = c.new myInnerClass();
        obj.runThisShit();
        innerClass.mySecondInnerClass obj2 = new mySecondInnerClass();
        obj2.runThisdeeperShit();
    }
}
