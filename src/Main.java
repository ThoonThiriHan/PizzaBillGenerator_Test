public class Main {
    public static void main (String[] args){
        Pizza basedPizza = new Pizza(false);
        basedPizza.addExtraToppings();
//        basedPizza.addExtraCheese();
//        basedPizza.takeAway();
        basedPizza.getBill();
    }
}
