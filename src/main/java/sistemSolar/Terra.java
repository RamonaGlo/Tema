package sistemSolar;

public class Terra extends SistemSolar implements Soare {

    static String atmosphere;

    public Terra (String atmosphere){
        this.setTheAtmosphere(atmosphere);
        System.out.println("Atmosfera normala");
    }

    public  void luminaSolara(){

        System.out.println("Lumina solara Terra");
    }

    public void setTheAtmosphere(String atmosphere){

        this.atmosphere = atmosphere;
    }

    public String getTheAtmosphere(){

        return atmosphere;
    }
}
