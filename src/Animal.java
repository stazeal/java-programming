public class Animal {
    String name;
    String color;
    int age;
    String wings;
    int numberOfLegs;

    public void move(){
        System.out.println("Animal is moving");
    }

    public void move(int numberOfLegs){
        System.out.println("am moving with " + numberOfLegs + " legs");
    }

    public void move(String name){
        System.out.println("my name is " + name);
    }

    public void moveWithWings(String wings){
        System.out.println("my wings are " + wings);
    }
}