package sistemSolar;

public class SistemSolar {

    static String nrPlanete;
    static String temperature;
    static String atmosphere;


    public SistemSolar(){

        System.out.println("Sistemul solar are multe planete");
    }
    public SistemSolar(String temperature, String atmosphere) {

        this.temperature = temperature;
        this.atmosphere = atmosphere;
    }

    public SistemSolar(SistemSolar sistemulSolar){

        temperature = sistemulSolar.temperature;
        atmosphere = sistemulSolar.atmosphere;
    }


    public  void method1(String nrPlanete){
        SistemSolar sistemSolar = new SistemSolar();
        this.nrPlanete = nrPlanete;
        nrPlanete = sistemSolar.nrPlanete;

    }

    public static void method2(){


    }

    public static void method3(){


    }

}
