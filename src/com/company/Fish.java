package com.company;

public abstract class Fish extends Animal{

    private String ColourDzumbunu56874;

    public Fish() {
        super();
        ColourDzumbunu56874 = "nn";
    }
    public Fish(String nameDzumbunu56874, int ageDzumbunu56874, int weightDzumbunu56874, String colourDzumbunu56874)
    {
        super(nameDzumbunu56874,ageDzumbunu56874,weightDzumbunu56874);
        this.ColourDzumbunu56874=colourDzumbunu56874;

    }

    public Fish( int ageDzumbunu56874, String colourDzumbunu56874)
    {
        super();
        this.ColourDzumbunu56874=colourDzumbunu56874;


    }

    public void actionDzumbunu56874()
    {
        System.out.println("Gulping Gulping");
    }
    @Override
    public void getVoiceDzumbunu56874()
    {
        System.out.println("The fish is quiet");

    }
    @Override
    public void eatingDzumbunu56874(String FoodName)
    {
        System.out.println("The fish is eating" +FoodName);
    }
    public String ColourDzumbunu56874()
    {
        return ColourDzumbunu56874;
    }
    public void setColourDzumbunu56874(String ColourDzumbunu56874)
    {
        this.ColourDzumbunu56874=ColourDzumbunu56874;
    }
    @Override
    public String toStringDzumbunu56874()
    {
        return
                "Fish"+"ColourDzumbunu56874'" + ColourDzumbunu56874;
    }
}
