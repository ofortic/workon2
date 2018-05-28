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
public class ListaArista extends Arista{
    public Arista ptr;
    public Arista ult;
    public Arista lLink;

    public ListaArista() {
        super();
        this.ptr = null;
        this.ult = null;
        this.lLink = null;
    }
    
    public void add(Arista a) {

        if (ptr == null) {
            ptr = a;
            ult = a;
        } else {
            if(ptr == ult){
                    ult = a;
                    ult = lLink;
            }else{
                ult = a;
                ult = lLink;
            }
        }
    }
    
}
