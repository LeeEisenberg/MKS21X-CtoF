/*
This function should accept doubles as parameters and also return doubles
*/

public class CtoFTester{
  public static double celsiusToFahrenheit(double f){
    return f * (9.0 / 5.0) + 32.0;
  }

  public static double fahrenheitToCelsius(double c){
    return (c - 32.0) * (5.0 / 9.0);
  }

  public static void main(String[] args){
    System.out.println("This should be 32 " + celsiusToFahrenheit(0.0));
    System.out.println("This should be 129.8264 " + celsiusToFahrenheit(54.348));
    System.out.println("This should be 0 " + fahrenheitToCelsius(32.0));
    System.out.println("This should be -0.255 " + fahrenheitToCelsius(31.541));
  }
}
