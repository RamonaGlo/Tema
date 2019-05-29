package sistemSolar;

public class Mercur extends SistemSolar implements Soare {

    static String temperature;

    public Mercur (String temperature){
        this.setTheTemperature(temperature);
        System.out.println("Temperatura normala");
    }
    public  void luminaSolara(){

        System.out.println("Lumina solara Mercur");
    }

    public void setTheTemperature(String temperature){

        this.temperature = temperature;
    }

    public String getTheTemperature(){

        return temperature;
    }

}

