import java.util.Scanner;
import java.lang.Math;

class Trojuholnik{
  private float stranaA;
  private float stranaB;
  private float stranaC;
  private String farba;
  
  //====================konstruktor====================
  public Trojuholnik(){
    Scanner sc = new Scanner(System.in);
    
    this.stranaA = OverRozmer.overRozmer(sc, 'a');
    this.stranaB = OverRozmer.overRozmer(sc, 'b');
    this.stranaC = OverRozmer.overRozmer(sc, 'c');
    
    System.out.print("Zadaj farbu: ");
    this.farba = sc.next();
  }

  public Trojuholnik(float stranaA, float stranaB, float stranaC, String farba){
    this.stranaA = stranaA;
    this.stranaB = stranaB; 
    this.stranaC = stranaC; 
    this.farba = farba;   
  }
  
  public Trojuholnik(float stranaA, float stranaB, float stranaC){
    this.stranaA = stranaA;
    this.stranaB = stranaB; 
    this.stranaC = stranaC;   
  }
  
  public Trojuholnik(float stranaA, String farba){
    this(stranaA, stranaA, stranaA, farba);  
  }
  
  public Trojuholnik(float stranaA, float stranaB, String farba){
    this(stranaA, stranaB, stranaB, farba);  
  }
  
  //====================geter====================
  public float getStranaA(){
    return stranaA;
  }
  
  public float getStranaB(){
    return stranaB;
  }
  
  public float getStranaC(){
    return stranaC;
  }
  
  public String getFarba(){
    return farba;
  }
  
  //====================seter====================
  public void setStranaA(float stranaA){
    this.stranaA = stranaA;
  }
  
  public void setStranaB(float stranaB){
    this.stranaB = stranaB;
  }
  
  public void setStranaC(float stranaC){
    this.stranaC = stranaC;
  }
  
  public void setFarba(String farba){
    this.farba = farba;
  }
  
  //====================dalsie_metody====================
  public float obvodTrojuholnika(){
    return (stranaA + stranaB + stranaC);
  }
  
  public float obsahTrojuholnika(){
    return (float)Math.sqrt((obvodTrojuholnika()/2)*((obvodTrojuholnika()/2)-stranaA)*((obvodTrojuholnika()/2)-stranaB)*((obvodTrojuholnika()/2)-stranaC));
  }
  
  public String toString(){
    return "hodnoty: " + stranaA + " " + stranaB + " " + stranaC + " " + farba + " " + super.toString();
  }

  
  public void info() {
    System.out.println("\n***TROJUHOLNIK***");
    System.out.println("strana a = " + getStranaA());
    System.out.println("strana b = " + getStranaB());
    System.out.println("strana c = " + getStranaC());
    System.out.println("farba = " + getFarba());
    System.out.println("obvod = " + obvodTrojuholnika());
    System.out.println("obsah = " + obsahTrojuholnika()); 
    System.out.println(toString());
  }

}