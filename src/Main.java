public class Main {
    public static void main (String[] args){
//        Pizza basedPizza = new Pizza(false);
//        basedPizza.addExtraToppings();
//        basedPizza.addExtraCheese();
//        basedPizza.takeAway();
//        basedPizza.getBill();

        DeluxPizza dp =  new DeluxPizza(false);
//        dp.addExtraCheese();
//        dp.addExtraToppings();
        dp.takeAway();
        dp.getBill();
    }
}
