import javax.lang.model.element.Name;

public abstract class Animal {

    private String NameDzumbunu56874;
    private int AgeDzumbunu56874;
    private int WeightDzumbunu56874;

    public Animal(){
        AgeDzumbunu56874=WeightDzumbunu56874=0;
        NameDzumbunu56874="Namez";
    }

    public Animal(String NameDzumbunu56874, int AgeDzumbunu56874, int WeightDzumbunu56874)
    {
        this.NameDzumbunu56874= NameDzumbunu56874;
        this.AgeDzumbunu56874=AgeDzumbunu56874;
        this.WeightDzumbunu56874=WeightDzumbunu56874;
    }

    public Animal(int AgeDzumbunu56874)
    {this.AgeDzumbunu56874=AgeDzumbunu56874;}

    public abstract void eat(String foodName);

    public abstract void getVoice();

    public String getNameDzumbunu56874() {return NameDzumbunu56874;}
    public void setNameDzumbunu56874(String NameDzumbunu){this.NameDzumbunu56874=NameDzumbunu56874}

    public int getAgeDzumbunu56874(){return AgeDzumbunu56874;}
    public void setAgeDzumbunu56874(int AgeDzumbunu){this.AgeDzumbunu56874=AgeDzumbunu;}
    public int getWeightDzumbunu56874(){return WeightDzumbunu56874;}
    public void setWeightDzumbunu56874(int WeightDzumbunu56874){this.WeightDzumbunu56874=WeightDzumbunu56874;}

    public abstract void getVoiceDzumbunu56874();

    public abstract void eatDzumunu56874(String FoodName);

    public abstract void eatDzumbunu56874(String FoodName);
}
