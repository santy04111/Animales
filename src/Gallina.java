import Interface.Volar;

public class Gallina extends Ave implements Volar{
    @Override
    public void makeSound() {
        System.out.println("Gasna");
    }


    @Override
    public void vuela() {
        System.out.println("vuela con alas");
    }
}
