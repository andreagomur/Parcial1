/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

public class Parcial {

    public Sala creaSala(int id, Semana[] semana) {
        Sala sala1 = new Sala(id, semana);
        return sala1;
    }

    public Programacion creaProg(Sala[] sala) {
        Programacion prog1 = new Programacion(sala);
        return prog1;
    }

    public Semana creaSem(Integer numSemana, Dia[] dia) {
        Semana sem1 = new Semana(numSemana, dia);
        return sem1;
    }

    public Dia creaDia(String fecha, String name, Segmento[] segmento) {
        Dia dia1 = new Dia(fecha, name, segmento);
        return dia1;
    }

    public Segmento creaSegmento(String inicio, String fin) {
        Segmento seg1 = new Segmento(inicio, fin);
        return seg1;
    }

    public void darProg(Programacion programacion) {
        Sala[] salas = programacion.getSala();
        for (int i = 0; i < salas.length; i++) {
            Semana[] semanas = salas[i].getSemana();
            System.out.println("Programación de la sala  " + salas[i].getId());
            for (int j = 0; j < semanas.length; j++) {
                System.out.println("    Semana numero  " + semanas[j].getNumSemana());
                Dia[] dias = semanas[j].getDia();
                for (int k = 0; k < dias.length; k++) {
                    System.out.println("        Dia  " + dias[k].getName() +"   " + dias[k].getFecha());
                    Segmento[] segmentos = dias[k].getSegmento();
                    for (int l = 0; l < segmentos.length; l++) {
                        System.out.println("            Desde  " + segmentos[l].getInicio() + " hasta " + segmentos[l].getFin());

                    }

                }
            }
        }
    }

    public static void main(String[] args) {

        Parcial obj = new Parcial();
        Segmento segmento1 = obj.creaSegmento("12:00", "14:00");
        Segmento segmento2 = obj.creaSegmento("14:00", "16:00");
        Segmento[] segmentos = {segmento1, segmento2};
        Dia dia1 = obj.creaDia("28/09/2017", "Jueves", segmentos);
        Dia dia2 = obj.creaDia("29/09/2017", "Viernes", segmentos);
        Dia[] dias = {dia1, dia2};
        Dia dia3 = obj.creaDia("05/10/2017", "Jueves", segmentos);
        Dia dia4 = obj.creaDia("06/10/2017", "Viernes", segmentos);
        Dia[] dias1 = {dia3, dia4};
        Semana sem1 = obj.creaSem(1, dias);
        Semana sem2 = obj.creaSem(2, dias1);
        Semana[] semanas = {sem1, sem2};
        Sala sala1 = obj.creaSala(1, semanas);
        Sala sala2 = obj.creaSala(2, semanas);
        Sala[] salas = {sala1, sala2};
        Programacion prog = obj.creaProg(salas);

        obj.darProg(prog);
    }

}
