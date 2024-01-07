import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.*;


public class Osoba{
  
  private String meno;
  private String priezvisko;
  private int vek;
  private float vaha;
  private float vyska;
  private String datumNarodenia;
  
  
  //getteri
  
  public String getMeno(){
    return meno;
  }
  
  public String getPriezvisko(){
    return priezvisko;
  }
  
  public String getDatumNarodenia(){
    return datumNarodenia;
  }
  
  public int getVek(){
    return vek;
  }
  
  public float getVaha(){
    return vaha;
  }
  
  public float getVyska(){
    return vyska;
  }


  
  
  //setteri
  
  public void setMeno(String meno){
    this.meno = meno;
  }
  
  public void setPriezvisko(String priezvisko){
    this.priezvisko = priezvisko;
  }
  
  public void setDatumNarodenia(String datumNarodenia){
    this.datumNarodenia = datumNarodenia;
  }
  
  public void setVaha(float vaha){
    this.vaha = vaha;
  }
  
  public void setVyska(float vyska){
    this.vyska = vyska;
  }



  
  public Osoba() {
  
    overMenoaPriezvisko();
    zadajVahuVysku();
    zadajDatum();

    this.vek = vypocitajVek(datumNarodenia);
}
 
 

  
  
  
  public void overMenoaPriezvisko() {
        Scanner userValue = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[A-ZÁ-Ž][a-zá-ž]*$");

        System.out.print("Zadaj meno: ");
        this.meno = userValue.next();
        while (!pattern.matcher(meno).matches()){
          System.out.print("Zadaj meno este raz: ");
          this.meno = userValue.next();  
        }

        System.out.print("Zadaj priezvisko: ");
        this.priezvisko = userValue.next();
        while (!pattern.matcher(priezvisko).matches()){
          System.out.print("Zadaj priezvisko este raz: ");
          this.priezvisko = userValue.next();
        }

    }

  public boolean overDatum(String date) {
      try {
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
          LocalDate.parse(date, formatter);
          return true;
      } catch (Exception e) {
          return false;
      }
  }
  
  public void zadajDatum(){
    Scanner userValue = new Scanner(System.in);
    
    System.out.print("Zadaj datum narodenia vo forme DD.MM.YYYY: ");
    this.datumNarodenia = userValue.next();

    while (!overDatum(datumNarodenia)) {
        System.out.print("Neplatny format datumu. Zadaj datum narodenia vo forme DD.MM.YYYY: ");
        this.datumNarodenia = userValue.next();
    }
  
          
    }
  
  public void zadajVahuVysku(){
    Scanner userValue = new Scanner(System.in);
    
    System.out.print("Zadaj vysku: ");
    this.vyska = userValue.nextFloat();
    
    while(vyska < 0){
      System.out.print("Zadaj vysku znova: ");
      this.vyska = userValue.nextFloat();
    }

    
    System.out.print("Zadaj vahu: ");
    this.vaha = userValue.nextFloat();
    
    while(vaha < 0){
      System.out.print("Zadaj vahu este raz: ");
      this.vaha = userValue.nextFloat();
    }

    
  }




  public int vypocitajVek(String datum) {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
      LocalDate birthDate = LocalDate.parse(datum, formatter);
      LocalDate currentDate = LocalDate.now();

      return currentDate.getYear() - birthDate.getYear();
  }
  
  public void info(){
    System.out.println("\n\n=========OSOBA=======");
    System.out.println("Meno: " + getMeno());
    System.out.println("Priezvisko: " + getPriezvisko());
    System.out.println("Vaha: " + getVaha() + "kg");
    System.out.println("Vyska: " + getVyska() + "cm");
    System.out.println("Vek: " + getVek());
    System.out.println(toString());
    
    }
  
  public String toString(){
    return "Meno: " + getMeno() + ",Priezvisko: " + getPriezvisko() + ",Vaha: " + getVaha()+ ",Vyska: " + getVyska() + ",Vek: " + getVek()+ " " + super.toString();
  }

 
  
  
  
}
