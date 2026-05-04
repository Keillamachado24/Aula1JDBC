package appliction;

import org.example.db.DB;

import java.sql.Connection;

public class Programa {

    public static void main(String[] args){

        Connection conn = DB.getConnection();

        System.out.println("Conexão realizada com sucesso!");
        System.out.println(DB.getConnection());
        org.example.db.DB.closeConection();
    }
}
