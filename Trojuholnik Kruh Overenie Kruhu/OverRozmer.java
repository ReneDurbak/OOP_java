import java.util.Scanner;

public class OverRozmer{
  /*//globalna premenna
  private float rozmer;*/
  
  public static float overRozmer(Scanner sc, char pismenko){
    //lokalna premenna - ak sa da, vyhnem sa glabalny premennym
    float rozmer;
    
    System.out.print("\n\n\n");
    do {
      System.out.print("Zadaj kladnu nenulovu hodnotu pre stranu " + pismenko + ": ");
      rozmer = sc.nextFloat();
    } while (rozmer <= 0);
    
    return rozmer;  
  }
  
  
}
