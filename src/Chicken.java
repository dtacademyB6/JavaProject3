public class Chicken extends Animal implements Edible, Commercializable {
    @Override
    public void eat() {
        System.out.println("Making a fried chicken");
        String str;
    }

    @Override
    public void makeSound() {
        System.out.println("Cluck cluck");
    }

    @Override
    public void commercialize() {
        System.out.println("Sell eggs");
    }
}
