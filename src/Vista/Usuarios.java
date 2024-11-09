package Vista;



import static Vista.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author josma
 */
public class Usuarios {
            public boolean login(users usr) {
            Connection con = getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT id, usuario, contraseña FROM usuario WHERE usuario = ?";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, usr.getUsuario());
                rs = ps.executeQuery();

                if (rs.next()) {
                    if (usr.getPass().equals(rs.getString(3))) {
                            usr.setId(rs.getInt(1));
                            usr.setUsuario(rs.getString(2));
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            } catch (SQLException e) {
                System.out.println(e);
                return false;
            }
        }
}
