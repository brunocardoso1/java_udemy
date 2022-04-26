public class temperatura {

    //(°F − 32) × 5/9 = °C
    public static void main(String[] args) {
        double fahrenheit = 80.0;
        double padrao = 32;
        double formula = 5.0 / 9.0;

        double resultado_celsius = (fahrenheit - padrao) * formula;

        System.out.println("A conversao de " + fahrenheit + " fahrenheit para celsius é de: " + resultado_celsius);


    }

}
