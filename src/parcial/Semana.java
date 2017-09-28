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
public class Semana {

    private Integer numSemana;
    private Dia dia[];

    public Semana(Integer numSemana, Dia[] dia) {
        this.numSemana = numSemana;
        this.dia = dia;
    }

    public Integer getNumSemana() {
        return this.numSemana;
    }

    public void setNumSemana(Integer numSemana) {
        this.numSemana = numSemana;
    }
    
    public Dia[] getDia(){
        return this.dia;
    }
    
    public void setDia (Dia[] dia){
        this.dia = dia;
    }
    
}
