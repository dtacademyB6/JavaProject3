public abstract interface Commercializable {



    // All interfaces are assumed to be abstract
  // All interfaces methods are assumed to be public and abstract
    // All interfaces constants are assumed to be public static and final
    // Interfaces do not have any constructors



//      public void commercialize();
//      abstract void commercialize();
    void commercialize();



//    public static final int price = 10;

    int price = 10;


    public  default void makeProfit(){
       //deafult methods must have a body
    }
    public default void makeProfit(int i){
        //deafult methods must have a body
    }

    public static void makeMoney(){
        //static methods must have a body
    }


}
