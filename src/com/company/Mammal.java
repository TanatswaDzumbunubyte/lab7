package com.company;

public abstract class Mammal extends Animal {

    private String OrderDzumbunu56874;

    public Mammal(){
        super();
        OrderDzumbunu56874 = "NN";
    }

    public Mammal(String NameDzumbunu56874, int AgeDzumbunu56874, int WeightDzumbunu56874, String OrderDzumbunu56874, int weightDzumbunu56874)
    {
        super(NameDzumbunu56874, AgeDzumbunu56874, weightDzumbunu56874);
        this.OrderDzumbunu56874=OrderDzumbunu56874;
    }

    public Mammal(int AgeDzumbunu56874, String OrderDzumbunu56874, int weightDzumbunu56874){
        super( AgeDzumbunu56874,OrderDzumbunu56874, weightDzumbunu56874);
        this.OrderDzumbunu56874=OrderDzumbunu56874;
    }

    public void drinkingDzumbunu56874(){
        System.out.println("Sip");
    }


    @Override
    public void getVoiceDzumbunu56874() {
        System.out.println("Mammal is making sounds");
    }

    @Override
    public void eatingDzumbunu56874(String FoodName) {
        System.out.println("Mammal is eating: " + FoodName);
    }

    public String getOrderShava56415() {
        return OrderDzumbunu56874;
    }

    public void setOrderDzumbunu56874(String OrderDzumbunu56874) {
        this.OrderDzumbunu56874 = OrderDzumbunu56874;
    }
//meths
    public abstract void action2Dzumbunu56874();

    public abstract void getVoiceDzumbunu56874();

    public abstract void eatDzumbunu56874(String FoodName);

    @Override
    public String toString() {
        return
                "Mammal{" + "OrderDzumbunu56874='" + OrderDzumbunu56874 + '\'' +
                '}';
    }
}