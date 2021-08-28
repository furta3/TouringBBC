package Renderes;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
 
public class RenderIntercalado extends DefaultTableCellRenderer {
 
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
                                                   boolean isSelected, 
                                                   boolean hasFocus, 
                                                   int row, 
                                                   int column) {
 
        //int numero = (Integer) table.getValueAt(row, 1);
 
        /*if (numero >= 10) {
            setBackground(Color.GREEN);
            setForeground(Color.BLACK);
        } else if (numero >= 5 && numero < 10) {
            setBackground(Color.YELLOW);
            setForeground(Color.BLACK);
        } else {
            setBackground(Color.RED);
            setForeground(Color.BLACK);
        }*/
        if(row==0)
            setBackground(Color.white);
        else if(row%2!=0)
            setBackground(new  Color(224,224,224));
        else
            setBackground(Color.white);
 
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
 
}