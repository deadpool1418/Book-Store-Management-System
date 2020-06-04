/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vijay
 */
import java.sql.*;
public class connection {
    public static void main(String args[]){
        Connection connection;
        try{
         connection=DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/mydatabase007","cypher123","root@123");
         PreparedStatement preparedStatement=connection.prepareStatement("select * from student");
         ResultSet rs=preparedStatement.executeQuery();
        /* PreparedStatement ps=connection.prepareStatement("insert into student values(?,?)");
         ps.setInt(1,2);
         ps.setString(2,"Roshan");
         ps.executeUpdate();*/
         while(rs.next()){
             System.out.print(rs.getInt(1));
             System.out.print(rs.getString(2));
         }
        }catch(Exception e){
            System.out.print(e);
        }
        
        
    
}
}
