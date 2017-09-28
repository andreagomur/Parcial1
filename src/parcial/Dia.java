/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;


/**
 *
 * @author Andrea
 */
public class Dia {

    private String fecha;
    private String name;
    private Segmento segmento [];

    public Dia (String fecha, String name, Segmento[] segmento) {
        this.fecha = fecha;
        this.name = name;
        this.segmento = segmento;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Segmento[] getSegmento (){
        return this.segmento;
    }
    
    public void setSegmento (Segmento[] segmento){
        this.segmento = segmento;
    }
}
