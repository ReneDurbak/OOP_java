//Import nastroj
import java.util.Scanner;   // java.util je balicek a Scanner je trieda
//nastroj Lang je improtnuty


class Obdlznik{
  
  
  
  private float stranaA;
  private float stranaB;
  private String farba;
  
  
  
  //------------Definicia explicitneho(nami definovany) konstruktora---------
  
  //konstruktor je specialna metoda, ktora sluzi na inicializaciu datovych poloziek
  
  //-moze byt implicitny(preddefinovany) a vykonava sa vzdy aj v ramci explicitneho kosntruktora(aby sa nepouzivali neinicializovane datove polozky), ktore ciselne polozky nastavi na nulovu hodnotu a datove na hodnotu NULL
  //-alebo explicitny(programatorom definovany) - nazov je zhodny s nazvom triedy
  //-Ked si zadefinujeme explicitny konstrukor tak sme povinny ho pouzit a implicitny nebude fungovat
  
  
  
  
  
  
  //1. krok definicia expl. konstruktora
  
  public Obdlznik(float stranaA, float stranaB){
    //v 1. kroku sa vykona implicitny konstruktor(to plati pre kazdy konstruktor)
      this.stranaA = stranaA;
      this.stranaB = stranaB;
  
        
  }
  
  //Pretazeny konstruktor - ked vytvorime viac konstruktorov, ktory prebera ine parametre a ine typy parametrov, tak ho volame pretazeny konstruktor
  //Pretazene metody - ked vytvorime viac metod s rovnakymi nazvami ktore preberaju ine paramatre a ine typy parametrov
  //-Podla poctu parametrov vie vyuzit konstruktor ktory sa hodi viac
  
  //2. krok pretazenie expl. konstrutora
  public Obdlznik(float stranaA, float stranaB, String farba){
    //v 1. kroku sa vykona implicitny konstruktor(to plati pre kazdy konstruktor)
      this.stranaA = stranaA;
      this.stranaB = stranaB;
      this.farba = farba;
     
  }
  
  //3. krok pretazenie expl. konstruktora - pre stvorec 
  public Obdlznik(float stranaA, String farba){
  //v 1. kroku sa vykona implicitny konstruktor(to plati pre kazdy konstruktor)
    
   /*
    this.stranaA = stranaA;
    this.stranaB = stranaA;
    this.farba = farba;
    */
    
    //-------Volanie konstruktora z konstrutora--------
    
    //this - odkaz na aktualny objekt(classu), alebo ukazuje datovu polozky
    //Najde aky konstruktor ma pouzit podla poctu parametrov
    this(stranaA, stranaA, farba);
    //this(stranaA, stranaA);
  
  } 
  
  
  
  //----KONSTRUKTOR PRE NACITANIE HODNOT OD POUZIVATELA----
  public Obdlznik(){
    
    Scanner sc = new Scanner(System.in); //vytvorime objekt typu classi Scanner, prebera jeden parameter(datovu polozku - in)
    System.out.print("Zadaj stranu a: ");
    this.stranaA = sc.nextFloat();
    
    System.out.print("Zadaj stranu b: ");
    this.stranaB = sc.nextFloat();
    
    System.out.print("Zadaj farbu: ");
    this.farba = sc.next(); // sc.nextLine() - nacita ako dalsi riadok, cize zapisujeme do dalsieho riadku a nebude to fungovat;
  }

  //-------------------------------------------------------------------------------------
  
  //-------------GETTERI--------------- 
  public float getStranaA(){
    return stranaA;  

  }
  
  public float getStranaB(){
    return stranaB;
  }         
  
  public String getFarba(){
    
  return farba;
  }
    
 //-------------SETTERI---------------   
public void setStranaA(float stranaA){
  this.stranaA = stranaA;
}
  
  
  public void setStranaB(float stranaB){
  this.stranaB = stranaB;
}
  
  public void setFarba(String farba){
  this.farba = farba;
}


  public void info(){
    System.out.printf("strana a = %.2f\n", getStranaA());//this.stranaA
     //System.out.println("strana b= "+ getStranaB());
    System.out.printf("strana b = %.2f\n", getStranaB());
    System.out.printf("farba = %s\n", getFarba());
  }
  

  //Metoda main pre triedu Obdlznik
  //Nebude fungovat lebo mame main metodu pre public classu GenerujTvar ktora ma vacsiu prednost
  public static void main(String arg[]){
    //static - na spustanie nepotrebuje mat vytvoreny objekt
    Obdlznik obdX = new Obdlznik(6.5F, "red");
    
    obdX.info();
  }

  
}




//----------------------------------------------------------------------------------
//---------------------------------MAIN KOD-----------------------------------------
//----------------------------------------------------------------------------------

public class GenerujTvar{
  
  public static void main(String arg[]){
    
    //Volanie explicitneho konstruktora
    
    System.out.println("----1.konstruktor----");
    Obdlznik obdA = new Obdlznik(5.0F,4.0F); //explicitny konsturktor
    obdA.info();  //test alokacie pamate 
    
    //new operator vyhradi pamatove miesto(alokacia pamate) pre kazdu datovu polozku a Obdlznik() incializuje datove polozky cize im priradi hodnoty
    //Oblznik() - implicitny(je preddefinovany) konstrukter 
    
 
 
    /*
    System.out.println("----UZ fr----");
    obdA.setStranaA(5.2F);
    obdA.setStranaB(1.4F);
    obdA.setFarba("GREEN");
    
    obdA.info();*/
    
    
    
    System.out.println("---2.konstruktor-----");
    Obdlznik obdB = new Obdlznik(6.2F,7.4F,"VIOLET");     
     obdB.info();
    
    System.out.println("----3.konstruktor----");
    Obdlznik obdC = new Obdlznik(1.2F,"YELLOW");
    
    obdC.info();
    
    System.out.println("----4.konstruktor----");
    Obdlznik obdD = new Obdlznik();
    obdD.info();
    
    

    
  }

}
