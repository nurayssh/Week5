package animals;

public class AnimalInfo {
    public static void main(String[] args) {
        Animals animals = new Animals();

        Animals cat = new Cat(); // animal class is superclass
        cat.animalsSound();

        Animals cow = new Cow();
        cow.animalsSound();

        Animals dog = new Dog();
        dog.animalsSound();
        }    // полиморфизм разные поведения разныее обьекты но один родит класс



    }

