vo//    https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
//importovanie nastroja na pracu s vstupom
import java.util.Scanner;

//https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
//importovanie balicka na pracu s matematickymi metodami z balicka(mocnina, odmocnina,...)            
import java.lang.Math;

/*
balicek Lang je automaticky imortovany; preto ho nemusime importovat, ale nie je to chyba
java.lang.System
*/


class Obdlznik{
  private float stranaA;
  private float stranaB;
  private String farba; 
  
  //konstruktor -> specialna metoda na inicializaciu datovy poloziek
  //1. krok definicia explicitneho konstruktra
  
  public Obdlznik(float stranaA, float stranaB){
    // v 1. kroku sa vykona inplicitny konstruktor
    this.stranaA = stranaA;
    this.stranaB = stranaB; 
    pocetObdlznikov++;
  }
  
  //2. krok pretazenie explicitneho konstruktra
  public Obdlznik(float stranaA, float stranaB, String farba){
    // v 1. kroku sa vykona inplicitny konstruktor
    this.stranaA = stranaA;
    this.stranaB = stranaB;
    this.farba = farba; 
    pocetObdlznikov++;
  }
       
  //3. krok pretazenie explicitneho konstruktra - pretazenie pre stvorec
  public Obdlznik(float stranaA, String farba){
  
    /*this.stranaA = stranaA;
    this.stranaB = stranaA;
    this.farba = farba; */
    
    //volanie konstruktora z konstruktora
    //this - odkaz na aktualny objekt
    this(stranaA, stranaA, farba);
    //pocetObdlznikov++;    sem nedame lebo v tomto konstruktore je volany iny, dvakrat by sa nam pricital pocet Obdlznikov
  }
  
  //konstruktor pre nacitanie hodnot od pouzivatela
  public Obdlznik(){            //bezparametrovy, parametre nacitame zo standardneho vstupu - klavesnica
    System.out.println("----ZADAJ HODNOTY PRE OBDLZNIK---");
    Scanner sc = new Scanner(System.in);
    //vytvorim eobjekt typu class Scanner, prebera jeden parameter (datovu polozku - in)
    
    /*System.out.print("\n\nZadaj stranu a: ");
    this.stranaA = sc.nextFloat();
    
    System.out.print("Zadaj stranu b: ");
    this.stranaB = sc.nextFloat();*/
    
    /*//volanie metody overRozmer
    this.stranaA = overRozmer(sc, 'a');
    this.stranaB = overRozmer(sc, 'b');  */
    
    //volanie metody overRozmer() cez tiredu OverRozmer()
    this.stranaA = OverRozmer.overRozmer(sc, 'a');
    this.stranaB = OverRozmer.overRozmer(sc, 'b');
    
    System.out.print("Zadaj farbu: ");
    this.farba = sc.next();
    pocetObdlznikov++;
  }

  
  
  /*
  -pretazeny konstruktor - ked je ich viac konstruktorov s rovnakym nazvom ale
    s roznym poctom parametrov a typom preberanych parametrov;
  -prgram zhodnoti podla poctu zadanych parametrov/hodnot, ktory kenstruktor sa hodi pouzit najviac

  /*
  -konstruktor je specialna metoda, sluzi na inicializaciu datovych poloziek;
  
  -konstruktor moze byt inplicitny alebo explicitny;
  
  -inplicitny je preddefinovany, vykonava sa vzdy, aj v ramci explicitne 
    definovanom konstruktory - ciselne datove polozky nastzvi na nulovu hodnotu a datove na null;
  
  -explicitny je definovany programatorom,nazov je zhodny s nazvom triedy;
  */
  
  /*pre kazdy konstruktor sa najprv vykona inplicitny konstruktor a az potom explicitny*/
  
  
  public float getStranaA(){
    return stranaA;
  }
  
  public float getStranaB(){
    return stranaB;
  }
  
  public String getFarba(){
    return farba;
  }      
  
  
  public void setStranaA(float stranaA){
    this.stranaA = stranaA;
  }
  
  public void setStranaB(float stranaB){
    this.stranaB = stranaB;
  }
  
  public void setFarba(String farba){
    this.farba = farba;
  }
  
  //metoda na vypocet obvodu obdlznika
  public float obvodObdznika(){
    return 2 * (stranaA + stranaB);
  } 
  
  //metoda na vypocet obsahu obdlznika
  public float obsahObdznika(){
    return stranaA * stranaB;
  } 
  
  //metoda na vypocet uhlopriecky obdlznika
  public float uhloprieckaObdznika(){
    return (float)Math.sqrt(Math.pow(stranaA, 2) + Math.pow(stranaB, 2));
   //Math.sqrt() -> druha odmocnina - prebera jeden parametrer(cislo ktore odmocnujem)
   //Math.pow() -> mocnina - prebera dva parametre(cislo kotre chcem umocnit a exponent(cislo na ktore chcem umocnit)) 
  } 
  
  /*int pocetObdlznikov = 0;
  public int pocetObdlznikov(){
    //pocet += 1;
    return pocetObdlznikov;
  } */
  
  static int pocetObdlznikov = 0;
  public static int pocetObdlznikov(){
    return pocetObdlznikov;
  }
  
  /*        pouzivame uz ako samostatnu classu
  //metoda overRozmer   (vpodstate ako funkcia v C)
  //prebera 2 parametre a ma navratovu hodnotu
  public float overRozmer(Scanner sc, char pismenko){
    float rozmer;
    do {
      System.out.print("Zadaj kladnu nenulovu hodnotu pre stranu " + pismenko + ": ");
      rozmer = sc.nextFloat();
    } while (rozmer <= 0);
    return rozmer;    
  }
  */

  //nepisane pravidlo pre pregramatorov - metodu toString preddefinujeme pre kazdu triedu
  //preddefinovanie metody toString
  /*public String toString(){
    //vo forme znakoveho ratazca vrati vsetky hodnoty vsetkych datovych poloziek
    return "hodnoty: " + stranaA + " " + stranaB + " " + farba;
  }*/
  
  public String toString(){
    //vo forme znakoveho ratazca vrati vsetky hodnoty vsetkych datovych poloziek
    return "hodnoty: " + stranaA + " " + stranaB + " " + farba + " " + super.toString();
  }
  
  
  public void info(){
    /*System.out.println("\n***OBDLZNIK***");
    System.out.println("strana a = " + this.stranaA);
    System.out.println("strana b = " + this.stranaB);
    System.out.println("farba = " + this.farba);*/
    
    System.out.println("\n***OBDLZNIK***");
    System.out.println("strana a = " + getStranaA());
    System.out.println("strana b = " + getStranaB());
    System.out.println("farba = " + getFarba());
    System.out.println("obvod = " + obvodObdznika());
    System.out.println("obsah = " + obsahObdznika());
    System.out.println("uhlopriecka = " + uhloprieckaObdznika());
    System.out.println("pocet obdlznikov = " + pocetObdlznikov());
    
    /*//volanie metody z rodicovskej tiredy Object
    System.out.println(toString());*/
    
    /*System.out.println(toString() + " " + super.toString());
    //k metodam ktore sme preddefinovali v rodicovskej tirede, pristupujeme pomocou 'super'; vrati povodnu metodu*/
    
    System.out.println(toString());
    
    
    /*
    System.out.printf("strana a = %.1f\n", this.stranaA);
    System.out.printf("strana b = %.1f\n", this.stranaB);
    System.out.printf("farba = %s\n", this.farba);
    
    vypisovat mozme aj takto - podobnejsie C-cku
    pri desatinnych cislach to vypise ","(ciarku) a nie "."(bodku) ako pri System.out.println
    */
  }
}