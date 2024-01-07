//Import nastroj
import java.util.Scanner;   // java.util je balicek pra nacitanie vstupu z klavesnice a Scanner je trieda
//nastroj Lang je improtnuty

import java.lang.Math;


class Obdlznik{
  
  private float stranaA;
  private float stranaB;
  private String farba;
  //private static int noOfObjects = 0;
  
  
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
    
      //noOfObjects++;
    //PocetObjektov.pocetObjektov(); 
  
        
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
      //noOfObjects++;
      //PocetObjektov.pocetObjektov(); 
     
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
    
    //this - odkaz na aktualny objekt(classu), ale na datovu polozky
    //Najde aky konstruktor ma pouzit podla poctu parametrov
    this(stranaA, stranaA, farba);
    //this(stranaA, stranaA);
    

  } 
  
  
  
  //----KONSTRUKTOR PRE NACITANIE HODNOT OD POUZIVATELA----
  public Obdlznik(){
    
    Scanner userValue = new Scanner(System.in); //vytvorime objekt typu classi Scanner, prebera jeden parameter(datovu polozku - in), System.in je parameter konstruktora
    /*
    System.out.print("\nZadaj stranu a: ");
    this.stranaA = userValue.nextFloat(); //prikaz na nactanie inputu ktory bude float
    */
    
     /*
    System.out.print("Zadaj stranu b: ");
    this.stranaB = userValue.nextFloat();
    */
    
    //volanie metody overRozmer() cez Triedu OverRozmer()
    this.stranaA = OverRozmer.overRozmer(userValue, 'a');   //test strany od uzivatela ci nie je zaporna alebo nulova
  
   this.stranaB = OverRozmer.overRozmer(userValue, 'b');  //test strany od uzivatela ci nie je zaporna alebo nulova
    
    System.out.print("Zadaj farbu: ");
    this.farba = userValue.next(); // sc.nextLine() - nacita ako dalsi riadok, cize zapisujeme do dalsieho riadku a nebude to fungovat;
    
    
    //noOfObjects++;
    PocetObjektov.pocetObjektov();  
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
  
    System.out.printf("\nstrana a = %.2f\n", getStranaA());//this.stranaA
     //System.out.println("strana b= "+ getStranaB());
    System.out.printf("strana b = %.2f\n", getStranaB());
    System.out.printf("farba = %s\n", getFarba());
    System.out.println("Obsah je: " + S());
    System.out.println("Obvod je: "+ Obvod());
    System.out.printf("Uhlopriecka je: %.2f\n", Uhlopriecka());
    System.out.println("Pocet vytvorenych obdlznikov: "+ PocetObjektov.pocetObjektov());
    
  }
  
  
  
  
  
  
  //----------METODY NA VYPOCTY----------
  
  //Obsah
  public float S(){
     
    return 2*(this.stranaA+this.stranaB);   
  }
 
 
 //Obvod
 
 public float Obvod(){
   
  return this.stranaA+this.stranaB;
 }

 
 //Uhlopriecka
  
  public float Uhlopriecka(){
    return (float)Math.sqrt(Math.pow(this.stranaA,2) + Math.pow(this.stranaB,2)); 
    
    //Math.sqrt = prebera jeden parameter cislo ktore chcem odmocnit
    //Math.poew = prebera 2 parametre - 1. cislo ktore chcem umocnit a 2. na ake cislo chcem umocnit
  }
  
  
  
  
  
  
  
  //----------METODA NA SPOCITANIE OBJEKTOV---------
      /*
     public static int pocetObdzlnikov(){
     
       return noOfObjects;
    
    }
           */
  


//--------METODA over rozmer---------
 /*
public static float overRozmer(Scanner userValue, char pismenko){
    
  float rozmer;
         
    
  System.out.println("Zadaj stranu " + pismenko + " :");
  rozmer = userValue.nextFloat();

  while(rozmer <= 0){
    
      System.out.println("Zadaj kladnu nenulovu stranu " + pismenko + " :");
      rozmer = userValue.nextFloat();
  }
  
   return rozmer;
  
}
      */
  



}



