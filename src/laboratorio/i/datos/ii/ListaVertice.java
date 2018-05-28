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
public class ListaVertice extends Vertice {

    public Vertice ptr;
    public Vertice lLink;
    public Vertice ult;
    
    public ListaVertice() {
        super();
        this.ptr = null;
        this.ult = null;
        this.lLink = null;
    }
    
    public void add(Vertice v) {
        
        if (ptr == null) {
            ptr = v;
            ult = v;
        } else {
            if(ptr == ult){
                    ult = v;
                    ult = lLink;
            }else{
                ult = v;
                ult = lLink;
            }
        }
    }
 
}
