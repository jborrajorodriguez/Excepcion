package excepcion;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class ConFinally {
    
    private int numerador, denominador;

    /**
     * Constructor por defecto.
     */
    public ConFinally() {
    }
    /**
     * Metodo que no devuelve nada dividirCapturaVariosCatch.
     */
    public void dividirCapturaVariosCatch() {
        try{
        numerador=Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador"));//Se pide el numerador por joption pane y se pasa de string a un int mediante integer.parseint.
        denominador=Integer.parseInt(JOptionPane.showInputDialog("Teclea el denominador"));//Se pide el denominador por joption pane y se pasa de string a un int mediante integer.parseint.
        
            int resultado=numerador/denominador;//Resultado de la division del numerador entre el denominador.
            JOptionPane.showMessageDialog(null,"Resultado = "+resultado);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,"Error");
            //e.printStackTrace();
        } catch(Exception e2){
            JOptionPane.showMessageDialog(null,"Introduce solo números");
        }
        finally{
            JOptionPane.showMessageDialog(null,"Esta sentenza executase sempre");
        }

    }

}
