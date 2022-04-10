package com.company;

public abstract class Bird extends Animal
{
    private String ColourOfFeathersDzumbunu56874;


    public Bird()
    {
        super ();
        ColourOfFeathersDzumbunu56874="NN";

    }

    public Bird (String NameDzumbunu56874, int AgeDzumbunu56874, int WeightDzumbunu56874, String ColourofFeathersDzumbunu56874)
    {
        super (NameDzumbunu56874,AgeDzumbunu56874,String ColourofFeathersDzumbunu56874);
        this.ColourOfFeathersDzumbunu56874=ColourofFeathersDzumbunu56874;
    }

    public Bird(int AgeDzumbunu56874 , String ColourofFeathersDzumbunu56874){
        super(nameDzumbunu56874, AgeDzumbunu56874, weightDzumbunu56874);
        this.ColourOfFeathersDzumbunu56874=ColourofFeathersDzumbunu56874;
    }

    public void flyingDzumbunu56874(){
        System.out.println("Flap");
    }

    @Override
    public void getVoiceDzumbunu56874() {
        System.out.println("com.company.Bird is making sounds");
    }

    @Override
    public void eatDzumbunu56874(String FoodName) {
        System.out.println("com.company.Bird is eating: " + FoodName);
    }

    public String getColourOfFeathersDzumbunu56874() {
        return ColourOfFeathersDzumbunu56874;
    }

    public void setColourOfFeathersDzumbunu56874(String ColourOfFeathersDzumbunu56874) {
        this.ColourOfFeathersDzumbunu56874 = ColourOfFeathersDzumbunu56874;
    }

    @Override
    public String toString() {
        return
                "com.company.Bird {" + "ColourofFeathers='" + ColourOfFeathersDzumbunu56874 + '\'' +
                '}';
    }

}

