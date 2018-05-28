/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.i.datos.ii;

/**
 *
 * @author orlando
 */
public class Grafo {
    public ListaVertice listaVertices;
    public ListaArista listaAristas;

    public Grafo() {
        this.listaAristas = new ListaArista();
        this.listaVertices = new ListaVertice();
    }
    
}
