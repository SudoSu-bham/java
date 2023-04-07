/* 2.Write a java program to represent Abstract class with example.*/

abstract class name{
    String name="NULL";
    name(){}
    name(String name){
        this.name = name;
    }
    abstract void display();
}
public class prog2 extends name {
    void display(){
        System.out.print(name);
    }
    prog2(){}
    prog2(String n){
        super(n);
    }
    public static void main(String[] args){
           prog2 p = new prog2("Shubham");
           p.display();
    }
}
