
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public class dbconnection {
    public static Connection connect(){
        Connection con= null;
        try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3308/course","root","");
           Component rootPane=null;
           
             System.out.println("Successful");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return con;
    }
    
}
