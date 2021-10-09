public class Tester {

    public static void main(String[] args) {


        Edible edible = new Apple();
        Edible edible2 = new GalaApple();
        Edible edible3 = new Chicken();

        eatSomething(new Apple());
        eatSomething(new Chicken());

//        Edible edible1 = new Edible();
    }


    public static void eatSomething(Edible e){
        e.eat();
    }
}
