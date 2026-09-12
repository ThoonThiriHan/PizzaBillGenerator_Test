public class Pizza {
    private int price;
    private Boolean veg;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else{
            this.price = 400;
        }
    }

    private void addExtraChesse(){

    }

    public void addExtraToppings(){

    }

    public void takeAway(){

    }

    public void getBill(){}


//    public void getPizzaPrice(){
//        System.out.println(this.price);
//    }




}
