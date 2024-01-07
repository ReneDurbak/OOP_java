import java.util.Scanner;

public class Student extends Osoba{
  private String odbor;
  private String trieda;
  private float priemer;
  private int dochadzka;
  
  //konstruktorz
  
  public Student(){
    Scanner sc = new Scanner(System.in);
    // automaticky zavola sa konstruktor rodica
    // super();
    
    System.out.println("Zadaj odbor: ");
    odbor=sc.nextLine();
    
    System.out.println("Zadaj triedu: ");
    trieda=sc.nextLine();
    
    System.out.println("Zadaj priemer: ");
    priemer=sc.nextFloat();
    
    System.out.println("Zadaj dochadzku: ");
    dochadzka=sc.nextInt();
  }
  
  public Student(String meno, String priezvisko, String pohlavie, int datumNarodenia, float vyska, float vahu, String odbor, String trieda, float priemer, int dochadzka){
    super(meno,priezvisko,pohlavie,datumNarodenia,vyska,vahu);
    this.odbor=odbor;
    this.trieda=trieda;
    this.priemer=priemer;
    this.dochadzka=dochadzka;
  }
  
  //getter
  
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
  
  //setter
  public void setOdbor(String odbor){
    this.odbor=odbor;
  }
  
  public void setTrieda(String trieda){
    this.trieda=trieda;
  }
  
  public void setPriemer(float priemer){
    this.priemer=priemer;
  }
  
  public void setDochadzka(int dochadzka){
    this.dochadzka=dochadzka;
  }
  
  //toString()
  
  public String toString(){  
    return 
    "\n Meno: " + super.getMeno() + 
    "\n Priezvisko: " + getPriezvisko() +
    "\n Pohlavie: " + getPohlavie() +
    "\n datum narodenia: " + getDatumNarodenia() + 
    "\n vyska: " + getVyska() + 
    "\n vaha: " + getVahu() + 
    "\n odbor: " + getOdbor() + 
    "\n trieda: " + getTrieda() + 
    "\n priemer: " + getPriemer() + 
    "\n docahdzka: " + getDochadzka() + " " + super.toString();  
  }
  
  public void info(){
    System.out.println(toString());
  }  
}