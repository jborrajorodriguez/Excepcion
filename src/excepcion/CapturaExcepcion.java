package excepcion;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class CapturaExcepcion {

    private int numerador, denominador;

    /**
     * Constructor por defecto.
     */
    public CapturaExcepcion() {
    }
    /**
     * Metodo que no devuleve nada dividirCaptura.
     */
    public void dividirCaptura() {
        numerador=Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador"));//Se pide el numerador por joption pane y se pasa de string a un int mediante integer.parseint.
        denominador=Integer.parseInt(JOptionPane.showInputDialog("Teclea el denominador"));//Se pide el denominador por joption pane y se pasa de string a un int mediante integer.parseint.
        try {
            int resultado=numerador/denominador;//Resultado de la division del numerador entre el denominador.
            JOptionPane.showMessageDialog(null,"Resultado = "+resultado);
        } catch (ArithmeticException e) {
            JOptionPane.showConfirmDialog(null,"Error");
            //e.printStackTrace();
        }

    }

}
