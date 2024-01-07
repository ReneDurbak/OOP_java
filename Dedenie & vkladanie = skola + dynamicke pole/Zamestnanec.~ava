import java.util.Scanner;

public class Zamestnanec extends Osoba{
  private String zaradenie;
  private float plat;
  
  //konstruktory

  public Zamestnanec(){
    Scanner sc = new Scanner(System.in); 
  
    System.out.println("Zadaj zaradenie: ");
    zaradenie=sc.nextLine();
    
    System.out.println("Zadaj plat: ");
    plat=sc.nextFloat();
  }
  
  public Zamestnanec(String meno, String priezvisko, String pohlavie, int datumNarodenia, float vyska, float vahu, String zaradenie, float plat){
    super(meno, priezvisko, pohlavie, datumNarodenia, vyska, vahu);
    this.zaradenie=zaradenie;
    this.plat=plat;
  }
  
  //getter
  
  public String getZaradenie(){
    return zaradenie;
  }
  
  public float getPlat(){
    return plat;
  }
  
  //setter
  
  public void setZaradenie(String zaradenie){
    this.zaradenie=zaradenie;
  }
  
  public void setPlat(float plat){
    this.plat=plat;
  } 
  
  public String toString(){  
    return 
    "\n Meno: " + super.getMeno() + 
    "\n Priezvisko: " + getPriezvisko() +
    "\n Pohlavie: " + getPohlavie() +
    "\n datum narodenia: " + getDatumNarodenia() + 
    "\n vyska: " + getVyska() + 
    "\n vaha: " + getVahu() +  
    "\n zaradenie: " + getZaradenie() + 
    "\n plat: " + getPlat() + " " + super.toString();  
  }
  
  public void info(){ 
    System.out.println(toString());                
  }      
}