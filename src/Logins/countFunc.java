/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author santi
 */
public class countFunc {
    public static int countData(String tableName)
    {
        int total = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try{
        st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'total' FROM "+tableName);
        while(rs.next()){
            total = rs.getInt(1);
        }
        }catch (SQLException ex){
           // Logger.getLogger(countFun.class.getName()).log(level.SEVERE,null,ex);
        }
        
        
        
        return total;
    }
}
