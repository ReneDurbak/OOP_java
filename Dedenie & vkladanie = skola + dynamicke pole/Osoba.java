import java.util.Scanner;

public class Osoba{
  private String meno;
  private String priezvisko;
  private String pohlavie;
  private int datumNarodenia;
  private float vyska;
  private float vahu;
  
  //konstruktorz
  
  public Osoba(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Zadaj meno: ");
    meno=sc.nextLine();
    
    System.out.println("Zadaj priezvisko: ");
    priezvisko=sc.nextLine();
    
    System.out.println("Zadaj pohlavie: ");
    pohlavie=sc.nextLine();
    
    System.out.println("Zadaj datum narodenia: ");
    datumNarodenia=sc.nextInt();
    
    System.out.println("Zadaj vysku: ");
    vyska=sc.nextFloat();
    
    System.out.println("Zadaj vahu: ");
    vahu=sc.nextFloat();
  }
  
  public Osoba(String meno, String priezvisko, String pohlavie, int datumNarodenia, float vyska, float vahu){
    this.meno=meno;
    this.priezvisko=priezvisko;
    this.pohlavie=pohlavie;
    this.datumNarodenia=datumNarodenia;
    this.vyska=vyska;
    this.vahu=vahu;
  }
  
  //geter
  
  public String getMeno(){
    return meno;
  }
  
  public String getPriezvisko(){
    return priezvisko;
  }
  
  public String getPohlavie(){
    return pohlavie;
  }
  
  public int getDatumNarodenia(){
    return datumNarodenia;
  }
  
  public float getVyska(){
    return vyska;
  }
  
  public float getVahu(){
    return vahu;
  }
  
  //setter
  
  public void setMeno(String meno){
    this.meno=meno;
  }
  
  public void setPriezvisko(String priezvisko){
    this.priezvisko=priezvisko;
  }
  
  public void setPohlavie(String pohlavie){
    this.pohlavie=pohlavie;
  }
  
  public void setDatumNarodenia(int datumNarodenia){
    this.datumNarodenia=datumNarodenia;
  }
  
  public void setVyska(float vyska){
    this.vyska=vyska;
  }
  
  public void setVahu(float vahu){
    this.vahu=vahu;
  }
  
}
