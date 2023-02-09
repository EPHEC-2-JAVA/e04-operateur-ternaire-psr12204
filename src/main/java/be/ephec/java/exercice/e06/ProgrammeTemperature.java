package be.ephec.java.exercice.e06;

public class ProgrammeTemperature
{
    public static void main(String[] args)
    {
        Temperature t1 = new Temperature(10, TemperatureUnit.CELSIUS);
        Temperature t2 = new Temperature(23, TemperatureUnit.FARENHEIT);

        System.out.println(t1.getValue(TemperatureUnit.CELSIUS) +"C° " + t1.getValue(TemperatureUnit.FARENHEIT)+ "F");
        System.out.println(t2.getValue(TemperatureUnit.CELSIUS) +"C° " + t2.getValue(TemperatureUnit.FARENHEIT) + "F");
    }
}
