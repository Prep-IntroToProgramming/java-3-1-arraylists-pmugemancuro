
public class Cat {
    //The two private variables, as per instruction.
    private String name;
    private double weight;
    //setters for name and weight.
    public void setName(String newName){
        name = newName;
    }

    public void setWeight(double newWeight){
        weight = newWeight;
    }
    //getters for name and weight. 
    public String getName(){
        return name;
    }

    public double getWeight(){
        return weight;
    }
    //constructor 1.
    public Cat(){   
    }
    //constructor 2 (overloaded).
    public Cat(String catName){
        catName = name;
    }
    //meow method. The phrase changes based on weight.
    public void meow(){
        if (weight <= 10){
            System.out.println("Purr!");
        }
        else if (weight <= 12){
            System.out.println("Meow!");
        }else{
            System.out.println("Grrr!");
        }
    }
}
