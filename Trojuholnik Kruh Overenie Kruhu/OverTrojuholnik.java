
public class OverTrojuholnik{
  
  public static boolean overTrojuholnik(float stranaA, float stranaB, float stranaC) {
    if ((stranaA+stranaB>stranaC)&&(stranaA+stranaC>stranaB)&&(stranaB+stranaC>stranaA)){
      return true;
    }
    else {
      System.out.println("nedodrzal si trojuholnikovu nerovnost, zadaj strany znova(uz platne)");
      return false;
    }
    
  }
  
}
