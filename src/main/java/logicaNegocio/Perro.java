package logicaNegocio;

public class Perro extends Animal implements Domestico {
    @Override
    public String emitirSonido() {
        return "Ladrido";
    }

    @Override
    public String obtenerDieta() {
        return "Croquetas y carne";
    }

    @Override
    public String interactuarConHumano() {
        
        return "El perro mueve la cola y juega con el humano.";
    }
    public String Habitat() {
        return "Terrestre";
    }
}