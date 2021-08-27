package Renderes;

import BD.Conexion;
import Clases.Jugador;
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
        
        Jugador j = (Jugador) table.getValueAt(row, 0);
 
        Date VenCarnet = j.getCarnetHabilitante();
        Date VenCi = j.getVenCi();
        Date hoy = new Date();
        
        long difCi = diasEntreDosFechas(hoy,VenCi);
        long difCarnet = diasEntreDosFechas(hoy,VenCarnet);
        
        if(difCi <= 0 || difCarnet <=0){
            //setBackground(Color.RED);
            setBackground(new Color(255,153,153));
            setForeground(Color.BLACK);
            //System.out.println("ROJO:: nombre: "+j.getNombre()+" venCi: "+difCi+", venCarnet: "+difCarnet);
        }
        else if((difCi <= 10 && difCi >0) || (difCarnet <= 10 && difCarnet >0)){//(difCi <= 10 && difCi >0) || (difCarnet <= 10 && difCarnet >0)
            //setBackground(Color.YELLOW);
            setBackground(new Color(255,255,153));
            setForeground(Color.BLACK);
            //System.out.println("AMARILLO: nombre: "+j.getNombre()+" venCi: "+difCi+", venCarnet: "+difCarnet);
        }
        else{
            setBackground(Color.white);
            setForeground(Color.BLACK);
            //System.out.println("BLANCO: nombre: "+j.getNombre()+" venCi: "+difCi+", venCarnet: "+difCarnet);
        }

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