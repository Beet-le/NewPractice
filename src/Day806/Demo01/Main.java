package Day806.Demo01;



public class Main {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();
        Cat cat =(Cat) animal;
        cat.catMouse();
    }
}
