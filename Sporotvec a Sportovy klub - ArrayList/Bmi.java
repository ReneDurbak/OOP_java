public class Bmi{
  
  public static float vypocetBmi(float vaha, float vyska){
    return (vaha / ((float)Math.pow(vyska/100,2)));
  }
 
}
