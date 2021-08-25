package Vistas;

import BD.Conexion;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
 
public class VencimientosRender extends DefaultTableCellRenderer {
public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
                                                   boolean isSelected, 
                                                   boolean hasFocus, 
                                                   int row, 
                                                   int column) {
 
        Date VenCarnet = (Date) table.getValueAt(row, 3);
        Date VenCi = (Date) table.getValueAt(row, 4);
        Date hoy = new Date();
        
        long difCi = diasEntreDosFechas(hoy,VenCi);
        long difCarnet = diasEntreDosFechas(hoy,VenCarnet);
        
        if((difCi <= 10 && difCi >0) || (difCarnet <= 10 && difCarnet >0)){
            //setBackground(Color.YELLOW);
            setBackground(new Color(255,255,153));
            setForeground(Color.BLACK);
        }
        else if(difCi <= 0 && difCarnet <=0){
            //setBackground(Color.RED);
            setBackground(new Color(255,153,153));
            setForeground(Color.BLACK);
        }
        
        table.setValueAt(sdf.format(VenCarnet), row, 3);
        table.setValueAt(sdf.format(VenCi), row, 4);
        
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
 
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
    
    public long diasEntreDosFechas(Date fechaDesde, Date fechaHasta){
        long startTime = fechaDesde.getTime() ;
        long endTime = fechaHasta.getTime();
        long diasDesde = (long) Math.floor(startTime / (1000*60*60*24)); // convertimos a dias, para que no afecten cambios de hora 
        long diasHasta = (long) Math.floor(endTime / (1000*60*60*24)); // convertimos a dias, para que no afecten cambios de hora
        long dias = diasHasta - diasDesde;

        return dias;
    }
}