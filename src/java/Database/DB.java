/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ravindu
 */
public class DB {
    String url = "jdbc:mysql://localhost:3306/social";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rst = null;
    
    public SignupDetails signd = new SignupDetails();
    
    public void connectiondatabse() {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection            
            //
        }catch (Exception e) {
            System.out.println("1" + e);
        }
    }
    
    public void connectionCloseDatabase(){
        try{
            if(con != null){
                con.close();
            }
            if(pst != null){
                pst.close();
            }
        }catch(Exception e){
        
        }
    }
    
    private void createUserTables(String userid){
        String[] table = new String[5];
        table[0] = "Create Table "+userid+"picturetable (userid varchar(3),picno int(03),image varchar(15),PRIMARY KEY(userid,picno))"; 
        table[1] = "Create Table "+userid+"statustable (userid varchar(3),stid varchar(03),stdesc varchar(100),PRIMARY KEY(userid,stid))";
        table[2] = "Create Table "+userid+"messagetable (userid varchar(3),msgid varchar(03),frndid varchar(05),msgdesc varchar(100),date varchar(10),PRIMARY KEY(userid,msgid))";
        table[3] = "Create Table "+userid+"friendtable (userid varchar(3),frndid varchar(03),frndname varchar(30),PRIMARY KEY(userid,frndid))";
        table[4] = "Create Table "+userid+"usertable (userid varchar(3),fname varchar(10),lname varchar(20),dob varchar(10),email varchar(20),password varchar(10),gender varchar(6),PRIMARY KEY(userid,frndid))";
        //table[5] = "Create Table "+userid+"statustable(userid varchar(3),stsid varchar(05),stsdesc varchar(100),date varchar(10),PRIMARY KEY(userid,stsid))";
        //table[6] = "Create Table "+userid+"linktable(userid varchar(3),email varchar(20),PRIMARY KEY(userid))";
        for (String table1 : table) {
            try {
                pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(table1);
                pst.executeUpdate();
            }catch (SQLException ex) {
                //Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("2" + ex);
            }
        }
    }
    
    public void signUp(){
        System.out.println("1");
        connectiondatabse();
        System.out.println("2");
        String lastUserID = "U00";
        String querry = "SELECT * FROM userdetails";
        try {
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(querry);
            rst = pst.executeQuery();
            
            while(rst.next()){
                lastUserID = rst.getString(1);
            }
            int x = Integer.parseInt(lastUserID.substring(1));
            x++;
            if (x > 0 && x < 10) {
                signd.setUSER_ID("U0"+x);
            } else if (x > 9 && x < 100) {
                signd.setUSER_ID("U"+x);
            }
            
            //createUserTables(signd.getUSER_ID());//creating all details users tables
            /*
                This methos to use for separde users create separde tables
                five Tables are created this method.. :) :) 
            */
            
            querry = "INSERT INTO userdetails VALUES (?,?,?,?,?,?,?)";
            System.out.println("4");
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(querry);
            System.out.println("5");
            pst.setString(1, signd.getUSER_ID());
            pst.setString(2, signd.getFIRST_NAME());
            pst.setString(3, signd.getLAST_NAME());
            pst.setString(4, signd.getBIRTH_DAY());
            pst.setString(5, signd.getEMAIL());
            pst.setString(6, signd.getPASSWORD());            
            pst.setString(7, signd.getGENDER());
            System.out.println("6");
            pst.executeUpdate();
            System.out.println("7");
            
            
        } catch (SQLException ex) {
           System.out.println("3" + ex);
        }
        
    }
    
    public void login(){
        
    }
    
}
