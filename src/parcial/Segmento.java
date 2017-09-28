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
public class Segmento {

    private String inicio;
    private String fin;

    public Segmento(String inicio, String fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getInicio() {
        return this.inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return this.fin;
    }

    public void setFin(String inicio) {
        this.fin = inicio;
    }
}
