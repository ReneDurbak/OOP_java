import java.util.Scanner;

public class OverRozmer{
  //globalna premenna - ak nepotrebujem, vyhybame sa globalnej premennej
  //private float rozmer;
  
  
  public static float overRozmer(Scanner userValue, char pismenko){
    //lokalna premenna - viditelna len v ramci metody
    float rozmer;
    
    System.out.println("Zadaj stranu " + pismenko + " :");
    rozmer = userValue.nextFloat();
  
    while(rozmer <= 0){
      
        System.out.println("Zadaj kladnu nenulovu stranu " + pismenko + " :");
        rozmer = userValue.nextFloat();
    }
    
   return rozmer;
  
}
}