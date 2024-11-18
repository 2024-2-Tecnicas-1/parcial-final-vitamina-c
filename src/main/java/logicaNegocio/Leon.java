package logicaNegocio;

public class Leon extends Animal {
    @Override
    public String emitirSonido() {
        return "Rugido";
    }

  
    public String obtenerDieta() {
        return "Carnívoro";
    }
    public String Habitat() {
        return "Terrestre";
    }
}
