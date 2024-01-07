
//----------------------------------------------------------------------------------
//---------------------------------MAIN KOD-----------------------------------------
//----------------------------------------------------------------------------------


//

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
    
     System.out.println("\n----4.konstruktor----");
    Obdlznik obdD = new Obdlznik();
    obdD.info();
    
    
 
    
 

    
    
  }

}
