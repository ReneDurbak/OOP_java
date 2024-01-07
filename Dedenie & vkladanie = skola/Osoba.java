import java.util.Scanner;

public class Osoba{

  private String meno;
  private String priezvisko;
  private int datumNarodenia;
  private String pohlavie;
  private float vyska;
  private float vaha;
  
  public Osoba(){
    //zavola sa aj implicitny aj v ramci explicitneho
    
    Scanner userValue = new Scanner(System.in);
    System.out.println("\n---BIO----");
    
    System.out.println("\n Meno: ");
    meno = userValue.nextLine();
    
    System.out.println(" Priezvisko: ");
    priezvisko = userValue.nextLine();
    
    System.out.println(" Datum narodenia: ");
    datumNarodenia = userValue.nextInt();
    
    System.out.println(" Pohlavie: ");
    pohlavie = userValue.next();
    
    System.out.println(" Vyska: ");
    vyska = userValue.nextFloat();
    
    System.out.println(" Vaha: ");
    vaha = userValue.nextFloat();
    
    
    
  }
  
  public Osoba( String meno,String priezvisko,int datumNarodenia, String pohlavie,float vyska,float vaha){
    
    this.meno = meno;
    this.priezvisko = priezvisko;
    this.datumNarodenia = datumNarodenia;
    this.pohlavie = pohlavie;
    this.vyska = vyska;
    this.vaha = vaha;
    
  }
  
  
  //========GETTERI========
  
  public String getMeno(){
    
    return meno;
    
  }
  
  public String getPriezvisko(){
    
    return priezvisko;
    
  }
  
  public int getDatumNarodenia(){
    
    return datumNarodenia;
    
  }
  
  public String getPohlavie(){
    
    return pohlavie;
    
  }
  
  public float getVyska(){
    
    return vyska;
    
  }
  
  public float getVaha(){
    
    return vaha;
    
  }
  
  
  
  //========SETTERI========


  public void setMeno(String meno){
    
    this.meno = meno;
    
  }
  
  public void setPriezvisko(String priezvisko){
    
    this.priezvisko = priezvisko;
    
  }
  
  public void setDatumNarodenia(int datumNarodenia){
    
    this.datumNarodenia = datumNarodenia;
    
  }
  
  public void setPohlavie(String pohlavie){
    
    this.pohlavie = pohlavie;
    
  }
  
  public void setVyska(float vyska){
    
    this.vyska = vyska;
    
  }
  
  public void setVaha(float vaha){
    
    this.vaha = vaha;
    
  }
  
  
   //Metode toString je povodne zadefinovana v triede Objekt (rodicovske triedy)
  
  public String toString(){
    
    //return getMeno() + " " + getPriezvisko() + " " + getDatumNarodenia() + " " + getPohlavie() + " " + getVaha() + " " + getVyska() + " " + super.toString(); 
  
  
  return 
    "\n Meno: " + getMeno()+
    "\n Priezvisko: " + getPriezvisko()+
    "\n Datum Narodenia: " + getDatumNarodenia()+
    "\n Pohlavie: " + getPohlavie()+
    "\n Vyska: " + getVyska()+
    "\n Vaha: " + getVaha();
  }
  
  
  public void info(){
    
    System.out.println(toString());
  }



  
  
  


   
}
