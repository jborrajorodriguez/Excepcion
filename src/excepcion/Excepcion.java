package excepcion;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Excepcion {

    public static void main(String[] args) {
        //CapturaExcepcion cap1=new CapturaExcepcion();
        //cap1.dividirCaptura();
        //VariosCatch cap2=new VariosCatch();
        ConFinally cap3=new ConFinally();
        cap3.dividirCapturaVariosCatch();
        JOptionPane.showMessageDialog(null,"Fin del programa");

    }

}
