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
        else {
            kilovatiosGastados = 0;
        }
    }
    
    /**
     * Devuelve el nombre de dónde está la bombilla
     */
    public String queBombillaEs() {
        return parteDeLaCasa;
    }
    
    /**
     * Devuelve la aberración que se ha gastado con la bombilla encendida
     */
    public double cuantoHaGastado() {
        return kilovatiosGastados;
    }
    
    /**
     * ¿Está apagada o encendida? ¡Asegúrate!
     */
    public boolean estaEncendida() {
        return encendida;
    }
    
    /**
     * Cambia la bombilla de lugar
     */
    public void setNombre(String nuevoNombre) {
        parteDeLaCasa = nuevoNombre;
    }
    
    /**
     * Modifica el contador que con esta factura no llegas a fin de mes
     */
    public void alterarContador(double nuevaTasa) {
        kilovatiosGastados = nuevaTasa * 3;
    }
    
    /**
     * Apágala o enciéndela, pero sobre todo apágala
     */
    public void encenderOApagar() {
        if(encendida == true) {
            encendida = false;
        }
        else {
            encendida = true;
            kilovatiosGastados += 15.423;
        }
    }
    
    /**
     * Imprime todo los datos que necesitas saber
     */
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
    
    /**
     * Lo mismo que lo que imprime, pero en un String
     */
    public String estadoDelObjeto() {
        String respuesta = null;
        if(encendida == true){
            respuesta = "si";
        }
        else {
            respuesta = "no";
        }
        String estado = "Parte de la casa: " + parteDeLaCasa + " | Cuánto lleva gastado: " + kilovatiosGastados + " | Encendido: " + respuesta;
        return estado;
    }
}
