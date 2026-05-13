package appliction;

import org.example.db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.example.db.DB;

public class Programa {

    public static void main(String[] args) {

        Connection conn = null;

        Statement st = null;
        ResultSet rs = null;

        try{
            conn = DB.getConnection();

            st = conn.createStatement();

            rs = st.executeQuery("select * from seller");

            while (rs.next()){
                System.out.println(rs.getInt("Id") + " - " + rs.getString("Name")  + " - " + rs.getString("Email")
                        + " - "  + rs.getDate("BirthDate") + " - "  + rs.getInt("BaseSalary")
                        + " - "  + rs.getInt("DepartmentId"));

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
            DB.closeConection();

        }

    }
}
