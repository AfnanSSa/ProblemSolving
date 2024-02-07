//Declare a variable temperatureInCelsius and convert it to Fahrenheit using integral and floating-point types.

public class ProblemSolving {
    public static void main(String[] args) {
        // Define temperatureInCelsius value
        double temperatureInCelsius = 30.5;
        
        // Converting to Fahrenheit
        // Itegral
        int intFahrenheit = (int) (temperatureInCelsius * 9/5) + 32;
        //floating-point
        float fltFahrenheit = (float) intFahrenheit;

        // Print the result
        System.out.println("Temperature in Celsius is: " + temperatureInCelsius);
        System.out.println("Fahrenheit Temperature in integral value is: " + intFahrenheit);
        System.out.println("Fahrenheit Temperature in floating-point value is: " + fltFahrenheit);
    }
}
