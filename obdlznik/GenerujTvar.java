class Obdlznik{       
//JAVA riesi kto(datove polozky) a co(metody) ma riesit
//Trieda je programatorom zadefinovany zlozeny datovy typ, ktory zapuzdruje jednotlive datove polozky a metody
//Datove polozky popisuju vlastnostni realneho objektu a metody definuju komunikaciu s objektom alebo objektami medzi sebou
  //kľúčové slovo private je modifikátor prístupu, ktorý sa používa pre atribúty, metódy a konštruktérov, vďaka čomu sú prístupné iba v rámci deklarovanej triedy.
  
  /*
  public float stranaA;        
  public float stranaB;      
  public String farba;
  */
  
  private float stranaA;         //okrem datoveho typu davame aj typ triedy pre datove polozky
  private float stranaB;      //public znamena ze hocikto moze zmenit vlastnosti objektu  
  private String farba;      //k private namame pristup a mozeme vidiet len v ramci classi
  
  //metody - urcuju sposob komunikacie s objektom, a budu verejne dostupne
    
  //definicia getterov
  public float getStranaA(){
      return stranaA;
  }
  
  public float getStranaB(){
      return stranaB;
  }
  
  public String getFarba(){
      return farba;
  }
  
  
 //definicia setterov
 
 public void setStranaA(float stranaA){
     this.stranaA = stranaA;     //pomocou klucoveho slova this urcujeme ze chceme menit hodnotu privatnej datovej polozky stranaA v ramci classi Obdlznik
 }
 
 public void setStranaB(float stranaB){
   this.stranaB = stranaB;
 }
 
 public void setFarba(String farba){
  this.farba = farba;
 }
  
  //definicia metody info
  public void info(){
     System.out.println("****OBDLZNIK****");
    System.out.println("strana a = "+ this.stranaA);
   System.out.println("strana b = "+ this.stranaB);
   System.out.println("farba = "+ this.farba);
  }

 
}

    //definicia objektu: Trieda objekt = new Trieda() //slovicko new je pre alokaciu pamatate
                                                    //Trieda() pri inicializacii je implicitny konstruktor a  priradi pri alokacii pamate hodnoty pre jednotlive datove polozky objektu a ma rovnaky nazov ako trieda
                                                    //new operator - vyhradi pamatove miesto pre datove polozky
                                                    // pre float = 0.0 a pre string= null
    
//verejne dostupna trieda
public class GenerujTvar{
  
    public static void main(String args[]){
        
  
      Obdlznik obdA = new Obdlznik();  //definicia objektu a Obdlznik() je specialna metoda, ktora je konstrukter, ktory priradi datovym polozkam hodnoty
      Obdlznik obdB = new Obdlznik();
    
       //Tu je ten test pre priradenie hodnoty pri alokacii pamate
      //-------------------------------------------------------------------------
      //Ak datove polozky su public, tak len vtedy to bude fungovat (toto co je v zakomentovane v classe Obdlznik)
      /*System.out.println("strana a = "+ obdA.stranaA);
      System.out.println("strana b = "+ obdA.stranaB);
      System.out.println("farba = "+ obdA.farba);
    
      obdA.stranaA = 22.5F;
    
    System.out.println("strana a = "+ obdA.stranaA);
     */
    //---------------------------------------------------------------------------
    
    
    
  
    //Tu je test pre priradenie hodnoty pri alokacii pamate k privatnym polozkam prostrednictvom verejnych metod
    /*
    System.out.println("strana a = "+ obdA.getStranaA());
    System.out.println("strana b = "+ obdA.getStranaB());
    System.out.println("farba = "+ obdA.getFarba());
    -*/
    
    
    
    
  //Pouzitie getterov
   System.out.println("strana a = "+ obdA.getStranaA());
   System.out.println("strana b = "+ obdA.getStranaB());
   System.out.println("farba = "+ obdA.getFarba());
    
  
  
  
  //Pouzitie setterov
   obdA.setStranaA(5.0F);
   obdA.setStranaB(2.1F);
   obdA.setFarba("cervena");
    
   /*
   System.out.println("strana a = "+ obdA.getStranaA());
   System.out.println("strana b = "+ obdA.getStranaB());      //toto je ekvivalent funkcie info()
   System.out.println("farba = "+ obdA.getFarba());
    */
    
   obdA.info(); //aby sme nevypisovali furt dookola to iste, tak sme si zadefinovali funkciu ktora to bude robit za nas
   
   
   //praca s objektom obdB
   
   
   obdB.setStranaA(3.15F);
   obdB.setStranaB(7.2F);
   obdB.setFarba("GREEN");
   
   obdB.info();
     }
  
  
  
  
  
}
