import java.util.Scanner;

class Zamestnanec extends Osoba{
  
  private int plat;
  private String zaradenie;
  
  Zamestnanec(){
    
    Scanner userValue = new Scanner(System.in);
    
    System.out.println(" Plat: ");
    plat = userValue.nextInt();
    
    System.out.println(" Zaradenie: ");
    zaradenie = userValue.next();
  }

  
  //===== GETTERI =====
  
  public int getPlat(){
     return plat;
  }
  
  public String getZaradenie(){
    
    return zaradenie;
  }
  
  
  //======= SETTERI =======
  
  public void setPlat(int plat){
    
    this.plat = plat;      
  }
  
  public void setZaradenie(String zaradenie){
    
    this.zaradenie = zaradenie;
  }
  
  
  //========== toString() =========
  
  
  public String toString(){
    
    return super.toString() + 
      "\n Plat: " + getPlat() + 
      "\n Zaradenie: " +  getZaradenie(); 
  }
  
  public void info(){
    
    System.out.println("====== ZAMESTANEC ======");
    System.out.println(toString());
  }



  
}
