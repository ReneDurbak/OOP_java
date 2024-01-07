import java.util.ArrayList;
import java.util.Scanner;


public class SportovyKlub{
  
  private String nazovSportovehoKlubu;
  private int pocetSportovcov;
  private Sportovec sportovec;
  
  ArrayList <Sportovec> sportovci = new ArrayList<Sportovec>();
  
  
    
  public int getPocetSportovcov(){  
    return sportovci.size();
  }
  
  public String getNazovSportovehoKlubu(){
     return nazovSportovehoKlubu;    
    }
  public void setNazovSportovehoKlubu(String nazovSportovehoKlubu){
     this.nazovSportovehoKlubu = nazovSportovehoKlubu;
    }
  
  public SportovyKlub(){
    
    Scanner userValue = new Scanner(System.in);
    System.out.print("Zadaj nazov sportoveho klubu: ");
    nazovSportovehoKlubu = userValue.nextLine();
    
    menu();
  }
  
  
  public void nacitajSportovca(){
  
    Scanner userValue = new Scanner(System.in);
    char odpoved;
    do{

      pridajSportovca(new Sportovec());
      System.out.print("Chces zadavat dalej? N/n=nie, hociajky iny znak ak ano: ");
      odpoved = userValue.nextLine().charAt(0);
    

    
    } while ((odpoved != 'n') && (odpoved != 'N'));
  
    
    }
  
  private void pridajSportovca(Sportovec sportovec){
    sportovci.add(sportovec);
  }
  
  private void vymazSportovca(){
  
    Scanner userValue = new Scanner(System.in);
    int id;
    int pocetSportovcov = getPocetSportovcov();
    System.out.println("Vyber ID sportovca ktoreho chces vymazat - prvy - 1, druhy - 2: ");
    id = userValue.nextInt();
    
    
    if(pocetSportovcov > 0){
      
      if(id >= 0){
        if(id-1>getPocetSportovcov()){
           System.out.println("Takyto sportovec nie je!");
          }else{  
           sportovci.remove(id-1);
          }
        
      }else{
      
       System.out.println("Neplatne id!");
      }
        
    }else{
    
     System.out.println("Je nula sportovcov, nemozes nikoho vymazat.");
    }
        
  }
  
  public void najdiSportovca() {
    Scanner userValue = new Scanner(System.in);
    System.out.print("Zadaj krstne meno sportovca, ktoreho chces najst: ");
    String menoOdUzivatela = userValue.next();
    
    boolean found = false;
    
    
    if(getPocetSportovcov() != 0){
    for (Sportovec sportovec : sportovci) {
        if (sportovec.getMeno().equalsIgnoreCase(menoOdUzivatela)) {
            System.out.print("\nNajdeny sportovec: " + sportovec.toString());
            found = true;
        }
      }
    }
    
    if (!found) {
        System.out.println("Nenasiel sa ziadny sportovec s menom: " + menoOdUzivatela);
    }
  }
  
  
  public void menu(){
    int odpoved;
    Scanner userValue = new Scanner(System.in);
    
    do{
      System.out.println("\n=====" + nazovSportovehoKlubu +"======");
      System.out.println("\nVyber akciu: \n1- pridaj sportovca \n2-vymaz sportovca \n3-zoznam sportovcov \n4-pocet sportovcov \n5-hladaj sportovca \n0 - ukonc proces");
      odpoved = userValue.nextInt();
    
      switch(odpoved){
        case 1: 
          nacitajSportovca();
          break;
        case 2:
          vymazSportovca();
          break;
        case 3:
          info();
          break;
        case 4:
          System.out.println("pocet sportovcov: " +  getPocetSportovcov());
          break;
        case 5:
          najdiSportovca();
          break;
        case 0:
          break;
        default:
          System.out.println("Zla volba!");
      }
    
    
    }while(odpoved != 0);

  }
  
  public void info(){
    for(Sportovec sportovec:sportovci){
      System.out.println(sportovec.toString());
    }
  }



}
