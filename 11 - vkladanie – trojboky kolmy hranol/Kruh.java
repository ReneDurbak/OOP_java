import java.util.Scanner;

class Kruh{
  /*public static final double PI;
  //final pouzivam na definiciu konstanty; konstantu zapisujem VELKYMI PISMENAMI*/
  public static final float PI = 3.14F;
  //datovy typ vyberam podla poctu desatinnych miest
  
  private float polomer;
  private String farba;
  
  
  public Kruh(float polomer, String farba){
    this.polomer = polomer;
    this.farba = farba;
  }
  
  public Kruh(){
    System.out.println("----ZADAJ HODNOTY PRE KRUH---");
    Scanner sc = new Scanner(System.in);
    this.polomer = OverRozmer.overRozmer(sc, 'r');
    System.out.print("Zadaj farbu: ");
    this.farba = sc.next();
  }
  
  public Kruh(float polomer){
    this.polomer = polomer;
  }
  

  public float getPolomer(){
    return polomer;
  }
  
  public String getFrba(){
    return farba;
  }
  
  
  public void setPolomer(){
    this.polomer = polomer;
  }
  
  public void setFrba(){
    this.farba = farba;
  }
  
  
  public float obvodKruhu(){
    return 2*PI*polomer;
  }
  
  public float obsahKruhu(){
    return PI*(float)Math.pow(polomer,2);
  }
  
  
  public String toString(){
    return "hodnoty: " + polomer + " " + farba + " " + super.toString();
  }
  
  
  public void info(){
    System.out.println("\n***KRUH***");
    System.out.println("polomer: " + getPolomer());
    System.out.println("farba: " + getFrba());
    System.out.println("obvod: " + obvodKruhu());
    System.out.println("obsah: " + obsahKruhu());
    System.out.println(toString());
  }



}
