
package cls_conexion;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

//api java  abrir la pag e ingresar  Java Api  buscamos DefaultTableCellRenderer
// buscamos en resumen sumary  getTableCellRendererComponent y copiamos los parametros
public class CeldaIntercalada extends DefaultTableCellRenderer  {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, 
            boolean hasFocus, 
            int row, 
            int column){
       //llamamos a nuestro constructor padre
        super.getTableCellRendererComponent(table, value, isSelected,  hasFocus, row, column);
        if(evaluarpar(row)){
            this.setBackground(Color.cyan);
            this.setForeground(Color.black);
        }else{
            this.setBackground(Color.white);
            this.setForeground(Color.black);
        }
        return this;
    }
    public boolean evaluarpar(int numero){
        return(numero%2==0);
    }
}
