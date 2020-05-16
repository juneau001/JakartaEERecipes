
package org.jakartaeerecipes.chapter05.recipe05_09;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import org.jakartaeerecipes.chapter05.CreateConnection;


/**
 * Recipe 5-12
 * 
 * Example of using a CallableStatement to execute a stored procedure.
 * 
 * @author juneau
 */
public class CallableStatementExample {
    
    public static CreateConnection createConn;

    public static void main(String[] args) {
        boolean successFlag = false;
        CreateConnection.loadProperties();
        try (Connection conn = CreateConnection.getConnection();) {
            callableStatementEx(conn);
        } catch (java.sql.SQLException ex) {
            System.out.println(ex);
        } 
        
    }
    
    public static void callableStatementEx(Connection conn){
        CallableStatement cs = null;

        try {
        cs = conn.prepareCall("{call DUMMY_PROC(?,?)}");
        cs.setString(1, "This is a test");
        cs.registerOutParameter(2, Types.VARCHAR);
        cs.executeQuery();

        System.out.println(cs.getString(2));

        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
