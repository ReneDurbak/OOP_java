import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;


// ============= OBDLZNIK ===================

class Obdlznik implements Tvar2D{
  
  private float stranaA;
  private float stranaB;
  
  
  
  public float getStranaA(){
    
    return stranaA;
  }
  
  public float getStranaB(){
    
    return stranaB;
  }
  
  

  // ==== Konstruktory ====
  
  public Obdlznik(){
    
    Scanner userValue = new Scanner(System.in);
    
    System.out.println("Zadaj stranu A: ");
    this.stranaA = userValue.nextFloat();
    System.out.println("Zadaj stranu B: ");
    this.stranaB = userValue.nextFloat();
    
  }
  
  
  public Obdlznik(float stranaA, float stranaB){
  
     this.stranaA = stranaA;
     this.stranaB = stranaB;
    
    
  }
  
  public Obdlznik(float stranaA){
  
   this(stranaA, stranaA);
  }
  
  
  public String toString(){
    
    return "a: "+ stranaA + " b: " + stranaB + " " + super.toString();
  }

  
  // ==== metody z rozhrania Tvar2D: ====
  
  public float obvod(){
    
    return 2*(stranaA + stranaB);
    
  }
  
  public float obsah(){
    
    return (stranaA*stranaB);
    
  }
  
  //-------------------
  /*
  public void info(){
     //Moze byt aj prazdna metoda ktoru sme povinny zadefinvat lebo je zadeklarovana v interfaci, pretoze aj prazdna metoda sa berie ako definicia metody
  }
   */
  //------------------
  
  
  public void info(){
  
   /* System.out.println("strana A: " + getStranaA());
    System.out.println("strana B: " + getStranaB());   
    System.out.println("Obvod: " + obvod());
    System.out.println("Obsah: " + obsah());   */
    System.out.println("Obdlznik: " + toString());
  
  }

  
}








// ================= KRUH ========================

class Kruh implements Tvar2D{
  
  private float polomer;
  
  
  public float getPolomer(){
    
    return polomer;
    
  }
  
  
  public Kruh(){
    
    Scanner userValue = new Scanner(System.in);
    System.out.println("Zadaj polomer: ");
    this.polomer = userValue.nextFloat();
    
  }
  
  public Kruh(float polomer){
  
    this.polomer = polomer;
     
  }


  
  public String toString(){
    
    return "r: " + polomer +' '+ super.toString();
    
  }

  

  // ==== metody z rozhrania Tvar2D: ====
  public float obvod(){
    
    return (float)(2*Tvar2D.PI*polomer);
    
  }
  
  public float obsah(){
    
    return (float)(Tvar2D.PI*(Math.pow(polomer,2)));
    
  }
  
  
  
  public void info(){
  
    /*System.out.println("r: " + getPolomer());
    System.out.println("Obvod: " + obvod());
    System.out.println("Obsah: " + obsah());  */
    System.out.println("Kruh: " + toString());
  
  }
  
  
}








// ================ TROJUHOLNIK ===================


class Trojuholnik implements Tvar2D{
  
  private float stranaA;
  private float stranaB;
  private float stranaC;
  
  
  public Trojuholnik(){
    
    Scanner userValue = new Scanner(System.in);
    
    System.out.println("Zadaj stranu A: ");
    this.stranaA = userValue.nextFloat();
    
    System.out.println("Zadaj stranu B: ");
    this.stranaB = userValue.nextFloat();
    
    System.out.println("Zadaj stranu C: ");
    this.stranaC = userValue.nextFloat();
  }
  
  public float getStranaA(){
    
    return stranaA;
    
  }
  
  public float getStranaB(){
    
    return stranaB;
    
  }
  
  public float getStranaC(){
    
    return stranaC;
    
  }


  public Trojuholnik(float stranaA, float stranaB, float stranaC){
    
    this.stranaA = stranaA;
    this.stranaB = stranaB;
    this.stranaC = stranaC;
  }
  
  public Trojuholnik(float stranaA){
    
    this(stranaA, stranaA, stranaA);
  }

  
  
  
  public float obvod(){
    
    return stranaA + stranaB + stranaC;
    
  }
  
  public float obsah(){
    
    float s = obvod()/2;
    return (float)Math.sqrt(s*(s-stranaA)*(s-stranaB)*(s-stranaB));
  }
  
  
  public String toString(){
    
    return "a: " + stranaA + " b: "+ stranaB + " c: "+ stranaC +' '+ super.toString();
  }

  
  public void info(){
  
    /*System.out.println("a: " + getStranaA());
    System.out.println("b: " + getStranaB());
    System.out.println("c: " + getStranaC());
    System.out.println("Obvod: " + obvod());
    System.out.println("Obsah: " + obsah());*/
    System.out.println("Trojuholnik: " + toString());
  
  }
  
   }
  
  
  // ========= MNOHOUHLONIK ============
  


  
  
  
  
  
  // ============ HLAVNA TRIEDA ===========
  
  public class Generuj2Dtvar{
    
    public static void main(String args[]) {
    
      /*
      Obdlznik obd1 = new Obdlznik();
      
      obd1.info();
      
      System.out.println(obd1.obvod());
      */
       
    
    
      // ---- ArrayList bez <> -----
      //ArrayList tvar2D = new ArrayList(); //bez diamantoveho operatora (<>) - resp. bez urcenia z akeho objektu budeme vyuzivat vlastnosti
                                          // ked definujem ArrayList bez diamantoveho operatora a pridavam prvky do ArrayListu, tak ked to vyberam tak to strati rodica a kazdy prvok je typu objekt a nebudu fungovat zadefinovane metody pri tej povodnej triede - napr.info
    
      // -----------------------------
    
    
    
    
    
      // ---- Vylepsenie ArrayListu ----
    
      // - genericky dat. typ - diamantovy operator - definuje aky dat. typ bude v danom poli, tiez vyuzivame na to aby sme sa vyhli behovym chybam
    
      ArrayList<Tvar2D> tvar2D = new ArrayList<Tvar2D>();
    
      //---------------------------------
         
    
    
    
    
      // ====== generator for random shapes + adding elements(objects) to ArrayList using switch ====
    
      for(int i = 1; i <= 3; i++){
        
        int Cislotvar = (int)(Math.random()*3) + 1; //Math.random defaultne berie od intervalu od <0,1) bez 1
                                              // *3 <0,2>, +1 - <1,3>
      
        System.out.println("\n=======\nCislo tvaru: "+Cislotvar+"\n========\n");
      
      switch(Cislotvar){
        
        case 1: tvar2D.add(new Obdlznik(1F)); //Ked odstranime implements Tvar2D z triedy obdlznik vyskytne sa behova chyba (error)
                break;
        
        case 2: tvar2D.add(new Trojuholnik(2F));
                break;
              
        case 3: tvar2D.add(new Kruh(3F));
                break;
          
       // pre pole s diamantovym operatorom <> resp. pole s generickym dat. typom - pri kompilacii sa vyskytne error pretoze String neobsahuje metody ako: obsah, info, obvod ako interface Tvar2D
        /*  
       case 4: tvar2D.add(new String("ERROR"));  //behova chyba -vznikne sa pocas behu programu, najhorsie sa zistuje pretoze nevyskytuje sa pri kazdom spusteni, tazko sa hlada hlavne ked pracuju na projekte viacery
                break;
        */        
        
      }
    
      }
    //  =======================================
    
    
    
    
    
    // ====== printing elements out of ArrayList using method info() and indexing ====== 
    
    /*for(int i = 0; i < tvar2D.size(); i++){
      
      // ---- POUZIVAME PRI ARRAYLISTE S <> ----
      
      tvar2D.get(i).info(); 
      //pri .get - kazdy prvok ktory vyberem je typu Object pri ArrayListe bez generickeho dat. typu - <>
      //pri ArrazListe bez <> - prvky su typu Object a tu nemame zadefinovanu metodu .info() ako pri tej povodnej
      // toto nad tym nefungiren lebo prvok je Typu Object ale bude fungovat akonahle Dynamickemu polu urcime genericky dat. typ pomocou <> - <Tvar2D>
      
      
      
      
      // ---- POUZIVAME PRI ARRAYLISTE BEZ <> ----
      
      // pri .get - kazdy prvok ktory vyberem je typu Object pri ArrayListe bez generickeho dat. typu - <> = riesenie - pretypovat prvky z pola
      //((Tvar2D)tvar2D.get(i)).info(); 
      //prv pretypujem az potom aplikujem metodu info
           
    }*/
    
    //================================================
    
    
    
    
    
    
    // ====== printing elements out of ArrayList using simpler notation =====
    
    // dat.typ pola, prvok, nazov pola
    
    for(Tvar2D shape: tvar2D){
      shape.info();
    }
    
    // ================================================
    
    
    
    }  
  
  }

  



