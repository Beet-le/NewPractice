package Day810.Demo01Instanceof;

public class Instanceof {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.eat();
        if(animal instanceof Dog){
            Dog dog=(Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat){
            Cat cat=(Cat) animal;
            cat.catMouse();
        }
        GiveMeaPet(new Dog());
    }
    public static void GiveMeaPet(Animal animal){
        if(animal instanceof Dog){
            Dog dog=(Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat){
            Cat cat=(Cat) animal;
            cat.catMouse();
        }
    }
}
