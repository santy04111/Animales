import Interface.Volar;

public class Canario extends Ave implements Volar {
    @Override
    public void makeSound() {
        System.out.println("Canta");
    }

    public void vuela() {
        System.out.println("vuela con alas");
    }
}
