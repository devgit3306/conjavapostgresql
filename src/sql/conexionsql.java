
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;







public class conexionsql {
    
    Connection conn =null;
    String url="jdbc:postgresql://localhost/empresa";
    
    String usuario="developer";
    String clave="123456";
    
    
    public void conectar(){
    
        try {
            Class.forName("org.postgresql.Driver");
            conn =DriverManager.getConnection(url,usuario,clave);
            
            JOptionPane.showMessageDialog(null, "Conexion exitosa", "Conexion",JOptionPane.INFORMATION_MESSAGE);
            
            
        } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Conexion Fallida "+e, "Conexion",JOptionPane.ERROR_MESSAGE);

        }
    
    
    
    }
    
    public void cerrar(){
         try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Desconexion exitosa", "Desconexion",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Desconexion Fallida "+e, "Desconexion",JOptionPane.ERROR_MESSAGE);

        }
    }
}
