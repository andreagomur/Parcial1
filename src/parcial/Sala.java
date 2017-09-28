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
public class Sala {
    private Semana semana[];
    private int id;
    
    public Sala (int id, Semana[] semana){
        this.semana = semana;
        this.id = id;
    }
    
    public Semana[] getSemana(){
        return this.semana;
    }
    
    public void setSemana (Semana[] semana){
        this.semana = semana;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId (int id){
        this.id = id;
    }
    
    
}
