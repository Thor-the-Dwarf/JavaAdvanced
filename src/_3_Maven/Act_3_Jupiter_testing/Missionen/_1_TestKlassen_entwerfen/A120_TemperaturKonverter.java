package _3_Maven.Act_3_Jupiter_testing.Missionen._1_TestKlassen_entwerfen;

public class A120_TemperaturKonverter {
    public double celsiusZuFahrenheit(double celsius) {
        return celsius * 9/5 + 32;
    }

    public double fahrenheitZuCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

