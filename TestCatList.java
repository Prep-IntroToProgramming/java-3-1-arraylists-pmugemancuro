import java.util.*;
public class TestCatList{
   public static void main (String[] args){
       //Creation of new arrayList.
       ArrayList <Cat> CatList = new ArrayList <Cat>();
       //for loop to add elements to Cat arrayList.
       for (int i=0; i<4; i++){
           CatList.add (new Cat());
       }
       /*The next four lines set names for all of the cats. 
       I was listening to Mozart's opera Magic Flute as I was doing this assignment, hence the names.*/
       CatList.get(0).setName("Sarastro");
       CatList.get(1).setName("Tamino");
       CatList.get(2).setName("Papageno");
       CatList.get(3).setName("Pamina");
       /*An enhanced for loop. It takes care of all of the rest (randomizing, printing, and the meow method).*/
       for (Cat Cat: CatList){
           Cat.setWeight(Math.random()*10+5);
           System.out.println(Cat.getName());
           System.out.println(Cat.getWeight());
           Cat.meow();
       }
   }
}
 