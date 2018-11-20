import java.util.*;
public class TestCatList{
   public static void main (String[] args){
       ArrayList <Cat> CatList = new ArrayList <Cat>();
       for (int i=0; i<4; i++){
           CatList.add (new Cat());
       }
       CatList.get(0).setName("Sarastro");
       CatList.get(1).setName("Tamino");
       CatList.get(2).setName("Papageno");
       CatList.get(3).setName("Pamina");
       for (Cat Cat: CatList){
           Cat.setWeight(Math.random()*10+5);
           System.out.println(Cat.getWeight());
           System.out.println(Cat.getName());
           Cat.meow();
       }
   }
}
 