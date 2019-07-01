package ObjectOriented;

public class Child extends Parent {

    void run(){
        System.out.println("I am in child class");
    }

    public static void main(String[] args) {
        Parent obj = new Child();
        ((Child) obj).run();
        obj.show();
        Child obj1= (Child)obj;
obj1.show();
((Child) obj).run();

    }
}
