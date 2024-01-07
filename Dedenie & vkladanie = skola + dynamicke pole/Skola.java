import java.util.Scanner;
import java.util.ArrayList;

public class Skola{
  private String skola;  
  
  //vkladanie tried ako datové typy dat. poloziek
  private Student student;
  private Zamestnanec zamestnanec;
  
  //dynamicke pole, prideluje pamet pocas chodu programu
  private ArrayList<Zamestnanec> zamestnanci = new ArrayList<Zamestnanec>();
  private ArrayList<Student> studenti = new ArrayList<Student>();
  
  public Skola(){
    Scanner sc = new Scanner(System.in); 
  
    System.out.println("Zadaj skolu: ");
    skola=sc.nextLine();
  }
  
  public String getSkola(){
    return skola;
  }
  
  public void setSkola(String skola){
    this.skola=skola;
  }
  
  //nacitanie
  
  public void nacitajZamestnanca(){
    /*Zamestnanec zam = new Zamestnanec();
    addZamestnanca(zam);*/ 
    
    Scanner sc = new Scanner(System.in);
    char vyber;
    
    do { 
      //zjednodusenie
      addZamestnanca(new Zamestnanec());
      System.out.println("Chces zadavat dalej? Y/y=ano N/n=nie");
      vyber=sc.nextLine().charAt(0);
    } while ((vyber=='Y')  || (vyber=='y'));
  }
  
  public void nacitajStudenta(){
    Scanner sc = new Scanner(System.in);
    char vyber;
    do { 
      //zjednodusenie
      addStudenta(new Student());
      System.out.println("Chces zadavat dalej? Y/y=ano N/n=nie");
      vyber=sc.nextLine().charAt(0);
    } while ((vyber=='Y')  || (vyber=='y'));
  }
  
  //pridavanie

  private void addStudenta(Student student){
    studenti.add(student);
  }
  
  private void addZamestnanca(Zamestnanec zamestnanec){
    zamestnanci.add(zamestnanec);
  }
  
  //zmazanie
  
  private void removeStudenta(){
  
    int pocetStudents = getPocetStudenta();
    int id;
    Scanner userValue = new Scanner(System.in);
    System.out.println("Vyber poziciu studenta ktoru chces vymazat");
    id = userValue.nextInt();
    
    if(pocetStudents > 0){
    
        if(id >= 0){
      
         studenti.remove(id);
        }else{
      
        System.out.println("Neplatne id!");
      }
    
    }else{
    
     System.out.println("Nula studentov");
     
    }


  }
  
  private void removeZamestnanca(){
    int pocetZamestnancov = getPocetZamestnanca();
    Scanner userValue = new Scanner(System.in);
    int id;
    System.out.println("Vyber poziciu studenta ktoru chces vymazat");
    id = userValue.nextInt();
    
    if(pocetZamestnancov > 0){
      
        if(id>=0){
        
         zamestnanci.remove(id);
          
        }else{
        
         System.out.println("Neplatne id!");
        }
      
      
    }else{
    
     System.out.println("Nula zamestnancov;");
     
    }
  }
  
  //pocet
  
  public int getPocetStudenta(){
    return studenti.size();
  }
  
  public int getPocetZamestnanca(){
    return zamestnanci.size();
  }
  
  //info skola=nazov +pocet studentov/zamestnancov
  public void info(){
    System.out.println("nazov skoly: "+skola);
    System.out.println("pocet studentov: "+getPocetStudenta());
    System.out.println("pocet zamestnancov: "+getPocetZamestnanca());
  }
  
  //vypsi zoznamu studenov-volaj tostring pre kazdeho
  
  public void infoStudent(){
    for(Student student:studenti){
      System.out.println(student.toString());
    }
  }
  
  public void infoZamestnanec(){
    for(Zamestnanec zamestnanec:zamestnanci){
      System.out.println(zamestnanec.toString());
    }
  }
  
  public void menu(){
    Scanner sc = new Scanner(System.in);
    int odpoved;
    
    do {
      System.out.println("--MOZNOSTI--");
      System.out.println("Pridat studenta(1)");
      System.out.println("Pridat zamestnanca(2)");
      System.out.println("Zmazat studenta(3)");
      System.out.println("Zmazat zamestnanca(4)");
      System.out.println("Ukoncit nacitanie(0)");
      odpoved = sc.nextInt();
      
      switch (odpoved) {
        case  1: 
          nacitajStudenta();
          break;
        case  2: 
          nacitajZamestnanca();
          break;
        case  3: 
          removeStudenta();
          break;
        case  4: 
          removeZamestnanca();
          break;
        case  0: 
          infoZamestnanec();
          infoStudent();
          System.out.println("Pocet studentov: " + getPocetStudenta());
          System.out.println("Pocet zamestnancov: " + getPocetZamestnanca());
          break; 
        default: System.out.println("Zla volba skus znova");
      } // end of switch
    } while (odpoved != 0); 
  }

}