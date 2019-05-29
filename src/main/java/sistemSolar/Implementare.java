package sistemSolar;

public class Implementare {


    public static void main(String[] args) {

        Terra terra = new Terra("normala");
        System.out.println(terra.getTheAtmosphere());

        terra.nrPlanete = "Sunt 3 planete";
        System.out.println(terra.nrPlanete);

        Mercur mercur = new Mercur("50 grade Celsius");
        System.out.println(mercur.getTheTemperature());
    }
}

