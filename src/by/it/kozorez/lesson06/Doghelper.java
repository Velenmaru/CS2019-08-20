package by.it.kozorez.lesson06;

/**
 * Created by User on 031 31.08.19.
 */
public class Doghelper {
     static void printAllNames(Dog[] dogs){
        for (Dog dog:dogs){
            System.out.print(dog.getName()+" ");
        }
         System.out.println();
    }
   static double averageAge(Dog[] dogs){
         double sum=0;
         for(Dog dog :dogs){
             sum=sum+dog.getAge();
         }


         return sum/dogs.length;
   }
}
