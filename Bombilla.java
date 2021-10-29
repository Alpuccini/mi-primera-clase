/**
 * Es una clase sobre las bombillas de una casa
 * @author: Nicolas Alfonso Pucci
 */

public class Bombilla {  
    //para ver en que lugar está la bombilla
    String parteDeLaCasa;
    //para controlar su gasto
    double kilovatiosGastados;
    //para encender y apagarla
    boolean encendida;
    
    /**
     * declaramos por parámetro la parte de la casa donde se encuentra y 
     * si esta encendida o no. Los kilovatios gastados serán 0 por defecto
     * a no ser... ¡que enciendas la luz!
     */
    public Bombilla(String parteCasa, boolean encender) {
        parteDeLaCasa = parteCasa;
        encendida = encender;
        if(encendida == true) {
            kilovatiosGastados = 15.423;
        }
    }
    
    public String queBombillaEs() {
        return parteDeLaCasa;
    }
    
    public double cuantoHaGastado() {
        return kilovatiosGastados;
    }
    
    public boolean estaEncendida() {
        return encendida;
    }
    
    public void setNombre(String nuevoNombre) {
        parteDeLaCasa = nuevoNombre;
    }
    
    public void alterarContador(double nuevoContador) {
        kilovatiosGastados = nuevoContador;
    }
    
    public void encenderOApagar() {
        if(encendida == true) {
            encendida = false;
        }
        else {
            encendida = true;
            kilovatiosGastados += 15.423;
        }
    }
    
    public void imprimeDetalles() {
        String respuesta = null;
        if(encendida == true){
            respuesta = "si";
        }
        else {
            respuesta = "no";
        }
        System.out.println("Parte de la casa: " + parteDeLaCasa + " | Cuánto lleva gastado: " + kilovatiosGastados + " | Encendido: " + respuesta);
    }
    
    public String estadoDelObjeto() {
        String respuesta = null;
        if(encendida == true){
            respuesta = "si";
        }
        else {
            respuesta = "no";
        }
        String estado = "Parte de la casa: " + parteDeLaCasa + " | Cuánto lleva gastado: " + kilovatiosGastados + " | Encendido: " + respuesta;
        return respuesta;
    }
}
