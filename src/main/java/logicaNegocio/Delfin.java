package logicaNegocio;

public class Delfin extends Animal {
    Animal delfin = new Delfin();
    @Override
    public String emitirSonido() {
        return "Chirrido";
    }

    @Override
    public String obtenerDieta() {
        return "Pescado";
    }

    
    public String Habitat() {
        return "ACUATICO";
    }
     
}
