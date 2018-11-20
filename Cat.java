
public class Cat {
    private String name;
    private double weight;
    public void setName(String newName){
        name = newName;
    }

    public void setWeight(double newWeight){
        weight = newWeight;
    }

    public String getName(){
        return name;
    }

    public double getWeight(){
        return weight;
    }

    public Cat(){   
    }

    public Cat(String catName){
        catName = name;
    }
    
    public void meow(){
        System.out.println("Meow!");
    }
}
