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
public class Programacion {
    
    private Sala sala[];

    public Programacion (Sala[] sala) {
        this.sala = sala;
    }

    public Sala[] getSala(){
        return this.sala;
    }
    
    public void setSala (Sala[] sala){
        this.sala = sala;
    }
}
