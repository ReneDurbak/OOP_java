import java.util.Scanner;

public class Student extends Osoba{  //Trieda Student je rozsirenim Triedy Osoba
  
  private String skola;
  private String odbor;
  private String trieda;
  private float priemer;
  private int dochadzka;

  public Student(){
    
    Scanner userValue = new Scanner(System.in);
    //Ked definujeme konstruktor extends triedu Student zavola sa automaticky konstrutor rodica(trieda Osoba)
    // super(); - zavolam rodica pomocou super(), co nemusime lebo to za nas robi automaticky;
    
    
    
    System.out.println("-----Student parameters------");
    
    System.out.println(" Skola: ");
    skola = userValue.nextLine();
    
    System.out.println(" Odbor: ");
    odbor = userValue.nextLine();
    
    System.out.println(" Trieda: ");
    trieda = userValue.nextLine();
    
    System.out.println(" Priemer: ");
    priemer = userValue.nextFloat();
    
    System.out.println(" Dochadzka: ");
    dochadzka = userValue.nextInt();
    
  }
  
  
  public Student( String meno,String priezvisko,int datumNarodenia, String pohlavie,float vyska,float vaha,String skola,String odbor,String trieda,float priemer,int dochadzka){
    
    super(meno, priezvisko, datumNarodenia, pohlavie, vyska, vaha);
    this.skola = skola;
    this.odbor = odbor;
    this. trieda = trieda;
    this.priemer = priemer;
    this.dochadzka = dochadzka;
    
  }

  
  //=========Getteri===========
  
  public String getSkola(){
      return skola;
    
  }
  
   public String getOdbor(){
          return odbor;
    
  }
  
   public String getTrieda(){
    
        return trieda;
  }
  
   public float getPriemer(){
    
    return priemer;
    
  }
  
   public int getDochadzka(){
    
    return dochadzka;
  }
  
  
  
  //=============Setteri=============
  
  public void setSkola(String skola){
      this.skola = skola;
    
  }
  
   public void setOdbor(String odbor){
          this.odbor = odbor;
    
  }
  
   public void setTrieda( String trieda){
    
        this.trieda = trieda;
  }
  
   public void setPriemer(float priemer){
    
    this.priemer = priemer;
    
  }
  
   public void setDochadzka(int dochadzka){
    
    this.dochadzka = dochadzka;
  }
  
  
  
  public String toString(){
    
    //return super.toString() + " " + getSkola() + " " + getOdbor() + " " + getTrieda() + " " + getPriemer() + " " + getDochadzka();
    
    /*return
    "\n Meno: " + super.getMeno()+
    "\n Priezvisko: " + getPriezvisko() //nemusi byt super lebo sme podedili po rodicovi metody+
    "\n Datum Narodenia: " + getDatumNarodenia()+
    "\n Pohlavie: " + getPohlavie()+
    "\n Vyska: " + getVyska()+
    "\n Vaha: " + getVaha();*/
    
    return 
    super.toString() +
    "\n Skola: " + getSkola()+
    "\n Odbor: " + getOdbor()+
    "\n Trieda: " + getTrieda()+
    "\n Priemer: " + getPriemer()+
    "\n Dochadzka: " + getDochadzka();
    
    
  }

  
  public void info(){
    System.out.println("======ZIAK========");
    System.out.println(toString());
    
  }







  
  
}
