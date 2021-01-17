/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_pv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class koneksi {
    
    //public static void main(String[] args){
        
        public static Connection con = null;
        
    public static Connection getConnection(){
        
        try{
        //JOptionPane.showMessageDialog(null,"berhasil");
            con = DriverManager.getConnection("jdbc:mysql://localhost/pelatos","root","");
             //con = DriverManager.getConnection("jdbc:mysql://localhost:3306//u1002321_pelatos","u1002321_pelatos","zd};SV}j(tqn");
            //con = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306//sql12364211","sql12364211","PBmyBDlbVj");
            return con;
        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,con);
            JOptionPane.showMessageDialog(null,"gagal");
            return null;
        }
    
    }
//}
}
    

