import java.util.Scanner;


public class Sportovec extends Osoba{
  
  private String nazovSportu;
  private float BMI;
  
  
  public String getNazovSportu(){
    return nazovSportu;
  }
  public float getBMI(){
    return BMI;
  }
  
  public void setNazovSportu(String nazovSportu){
    this.nazovSportu = nazovSportu;
  }


  
  public Sportovec(){
    Scanner userValue = new Scanner(System.in);
    
    System.out.print("Zadaj nazov sportu: ");
    this.nazovSportu = userValue.next();
    
    this.BMI = Bmi.vypocetBmi(super.getVaha(), super.getVyska());
    
  }
  
  public String toString(){
    return
    "\n====SPORTOVEC====\n\n" +
    "Meno :" + super.getMeno() +
    "\nPriezvisko: " + super.getPriezvisko() +
    "\nVaha: " + super.getVaha() + " kg" + 
    "\nVyska: " + super.getVyska() + " cm" +
    "\nVek: " + super.getVek() + " rokov" +
    "\nSport: " + getNazovSportu() +
    "\nBMI: " + getBMI();  
  }


}
