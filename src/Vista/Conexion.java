package Vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author josma
 */
public class Conexion {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/bdnegocio";
    public static final String USER = "root";
    public static final String PASS = "";
    private Connection con = null;
    
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Conexion Exitosa con la DB");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return con;
    }
    
    
    protected void cerrar() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ignored) {
                
            }
        }

       }
}
