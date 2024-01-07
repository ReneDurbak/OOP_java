import java.util.Scanner;
import java.lang.Math;

class TrojbokyKolmyHranol{
  
  private float bocnaHrana;
  private Obdlznik bocnaStena;
  private Trojuholnik dolnaPodstava;
  private float dolnaHrana;
  private Trojuholnik hornaPodstava;
  
  
  
   public TrojbokyKolmyHranol(float stranaA,float stranaB,float stranaC, float vyska ){
     
      dolnaPodstava = new Trojuholnik(stranaA, stranaB, stranaC);
      hornaPodstava = new Trojuholnik(stranaA, stranaB, stranaC);
      dolnaHrana = stranaB;
      bocnaHrana = vyska;
      bocnaStena = new Obdlznik(stranaC, bocnaHrana);
      
   }
  
  public TrojbokyKolmyHranol(){
  
   Scanner userValue = new Scanner(System.in);
    
   do{
   dolnaPodstava = new Trojuholnik(OverRozmer.overRozmer(userValue, 'A'), OverRozmer.overRozmer(userValue, 'B'), OverRozmer.overRozmer(userValue, 'C'));
   hornaPodstava = new Trojuholnik(dolnaPodstava.getStranaA(), dolnaPodstava.getStranaB(), dolnaPodstava.getStranaC());
   dolnaHrana = dolnaPodstava.getStranaB();
   bocnaHrana = OverRozmer.overRozmer(userValue, 'V');
   bocnaStena = new Obdlznik(dolnaPodstava.getStranaC(), bocnaHrana);
   }while((OverTrojuholnik.overTrojuholnik(dolnaPodstava.getStranaA(), dolnaPodstava.getStranaB(), dolnaPodstava.getStranaC())==false ));
   
   
    
  }
  
  

  
  public float plastTrojbokyKolmyHranol(float stranaA,float stranaB,float stranaC, float vyska){
    
    return (stranaA+stranaB+stranaC)*vyska;
    
  }
  
  public float obsahPodstavyTrojbokyKolmyHranol(float stranaA,float stranaB,float stranaC){
    float s = (stranaA+stranaB+stranaC)/2;
    return (float)Math.sqrt((s*(s-stranaA)*(s-stranaB)*(s-stranaC)));
    
  }
  
  public float obsahTrojbokehoKolmehoHranola(float Sp, float Spl){
    return 2*Sp+Spl;
  }
  
  public float objemTrojbokehoKolmehoHranola(float Sp, float vyska){
    
    return Sp*vyska;
  }


  public String toString(){
    
    return  dolnaPodstava.getStranaA()+" "+dolnaPodstava.getStranaB()+" "+dolnaPodstava.getStranaC()+" "+ super.toString();
  }

  
  public void info(){
    System.out.printf("-------TROJBOKY KOLMY HRANOL-----------\n\n");
    
    System.out.println("Sp= " + obsahPodstavyTrojbokyKolmyHranol(dolnaPodstava.getStranaA(),dolnaPodstava.getStranaB(),dolnaPodstava.getStranaC()));
    System.out.println("Spl= " + plastTrojbokyKolmyHranol(dolnaPodstava.getStranaA(),dolnaPodstava.getStranaB(),dolnaPodstava.getStranaC(), bocnaHrana));
    System.out.println("S= " + obsahTrojbokehoKolmehoHranola(obsahPodstavyTrojbokyKolmyHranol(dolnaPodstava.getStranaA(),dolnaPodstava.getStranaB(),dolnaPodstava.getStranaC()),plastTrojbokyKolmyHranol(dolnaPodstava.getStranaA(),dolnaPodstava.getStranaB(),dolnaPodstava.getStranaC(), bocnaHrana)));  
    System.out.println("V="+objemTrojbokehoKolmehoHranola(obsahPodstavyTrojbokyKolmyHranol(dolnaPodstava.getStranaA(),dolnaPodstava.getStranaB(),dolnaPodstava.getStranaC()),bocnaHrana));
    System.out.println(toString());
  }




}
