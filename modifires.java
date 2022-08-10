class myEmployee{
    private int id;
    private String name;
    public void setid(int id){
        this.id = id;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getid(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}
public class modifires {
    public static void main(String[] args) {
        myEmployee nuke = new myEmployee();
        nuke.setname("Prajwal");
        nuke.setid(23);
        System.out.println(nuke.getid() + " " + nuke.getName());

    }
}
