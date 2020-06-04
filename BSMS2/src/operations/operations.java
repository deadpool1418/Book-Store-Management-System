package operations;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import javax.swing.*;
import java.time.format.DateTimeFormatter;
public class operations {
	public Connection connection;
    public operations() {
		try {
                    //Class.forName("com.mysql.jdbc.Driver"); 
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","cypher","Arunrv26@99");
		}catch(Exception e) {
			System.out.print(e);
		}
	}
    
    /*public boolean buyit(int qun,String name)
    {
        int qunt=0;
        boolean b=false;
     try
     {
          PreparedStatement statement=connection.prepareStatement("select *from book where bname=?");
          statement.setString(1,name);
          ResultSet rs=statement.executeQuery();
          while(rs.next())
          {
             qunt=rs.getInt("bquant");
          }
          if(qun<qunt)
          {
          int finalq=qunt-qun;
          PreparedStatement statement1=connection.prepareStatement("update book set bquant=? where bname=?");
          statement1.setInt(1,finalq);
          statement1.setString(2,name);
          statement1.executeUpdate();
          b=true;
          } 
     }
     catch(Exception e)
     {
         System.out.print(e);
     }
     return b;
    }*/
    public ArrayList<String> upbookdetails(String bname)
    {
        ArrayList<String> rea=new ArrayList<String>();
        try{
          PreparedStatement statement=connection.prepareStatement("select *from book where bname=?");
          statement.setString(1,bname);
           ResultSet rs=statement.executeQuery();
          while(rs.next())
          {
               String bty= rs.getString("btype");
               String baut= rs.getString("bauthor");
               String pr=String.valueOf(rs.getInt("bprice"));
               String qn=String.valueOf(rs.getInt("bquant"));
               String ty=rs.getString("btype");
               
               rea.add(bty);
               rea.add(baut);
               rea.add(pr);
               rea.add(qn);
               rea.add(ty);
          }
          
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       return rea;
    }
    public void updateBook(String bn,String bauthor1,int bprice1,int bquant1){
       	try {

    	          // PreparedStatement statement=connection.prepareStatement("update book set bauthor=? where bname=?");
                     PreparedStatement statement=connection.prepareStatement("update book set bauthor=?,bprice=?,bquant=? where bname=?");
                   statement.setString(1, bauthor1);
                   statement.setInt(2, bprice1);
                   statement.setInt(3, bquant1);
                   statement.setString(4, bn);
                   statement.executeUpdate();

    }catch(Exception e){
            System.out.println(e);
    }
    }
    public ArrayList<Integer> buyit(int qun,String name)
    {
        ArrayList<Integer> result=new ArrayList<Integer>();
        int qunt=0;
        int pp=0;
     try
     {
          PreparedStatement statement=connection.prepareStatement("select *from book where bname=?");
          statement.setString(1,name);
          ResultSet rs=statement.executeQuery();
          while(rs.next())
          {
             qunt=rs.getInt("bquant");
             pp=rs.getInt("bprice"); 
          }
          result.add(pp);
          if(qun<qunt)
          {
          int finalq=qunt-qun;
          PreparedStatement statement1=connection.prepareStatement("update book set bquant=? where bname=?");
          statement1.setInt(1,finalq);
          statement1.setString(2,name);
          statement1.executeUpdate();
          result.add(1);
          } 
          else
          {
          result.add(0);
          }
          
     }
     catch(Exception e)
     {
         System.out.print(e);
     }
     return result;
    }
    public ArrayList<String> searchbook(String cat1,String bname1)
    {
        ArrayList<String> result=new ArrayList<String>();
        try{
          PreparedStatement statement=connection.prepareStatement("select *from book where btype=? and bname=?");
          statement.setString(1, cat1);
          statement.setString(2, bname1);
         ResultSet rs=statement.executeQuery();
          if(rs.next())
          {
               String bn = rs.getString("bname");
               String bty= rs.getString("btype");
               String baut= rs.getString("bauthor");
               String pr=String.valueOf(rs.getInt("bprice"));
               String qn=String.valueOf(rs.getInt("bquant"));
               //System.out.println(bn + bty + baut + pr + qn);
               result.add(bn);
               result.add(bty);
               result.add(baut);
               result.add(pr);
               result.add(qn);
          }
          else{
              result.add("Book Not Found");
          }
          
        }
        catch(Exception e) {
			System.out.print(e);
		}
        return result;
    }
    public String adds(String tname,String fname,String lname,String gender,long cno,String uname,String pass) { 
        String msg="";
    	try {
            if(tname=="sinfo"){
    	           PreparedStatement statement=connection.prepareStatement("insert into sinfo (fname,lname,gender,contactno,uname,pass) values(?,?,?,?,?,?)");
                   statement.setString(1, fname);
    	           statement.setString(2, lname);
                   statement.setString(3, gender);
                   statement.setLong(4, cno);
                   statement.setString(5, uname);
                   statement.setString(6, pass);
    	           statement.executeUpdate();
            }
            else if(tname=="cinfo"){
                  PreparedStatement statement=connection.prepareStatement("insert into cinfo (fname,lname,gender,contactno,uname,pass) values(?,?,?,?,?,?)");
                   statement.setString(1, fname);
    	           statement.setString(2, lname);
                   statement.setString(3, gender);
                   statement.setLong(4, cno);
                   statement.setString(5, uname);
                   statement.setString(6, pass);
    	           statement.executeUpdate();
            }
    	
    	}catch (Exception e) {
			// TODO: handle exception
    		      msg="error";
                     // System.out.print(e);
		}
        return msg;
    }
    public boolean check(String tname,String name,String pass){
        boolean b=false;
        try{
            if(tname=="sinfo"){
            PreparedStatement statement=connection.prepareStatement("select * from sinfo where uname=? and pass=?");
            ResultSet rs;
            statement.setString(1, name);
            statement.setString(2, pass);
            rs=statement.executeQuery();
            if(rs.next())
                b=true;
            
        }
            else if(tname=="cinfo")
            {
        PreparedStatement statement=connection.prepareStatement("select * from cinfo where uname=? and pass=?");
            ResultSet rs;
            statement.setString(1, name);
            statement.setString(2, pass);
            rs=statement.executeQuery();
             if(rs.next())
                b=true;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        if(b)
            return true;
        else
            return false;
    }
    public Vector stock(){
        
        Vector<Vector> rows=new Vector<Vector>();
        try{
        PreparedStatement statement=connection.prepareStatement("select * from book");
        ResultSet rs=statement.executeQuery();
        while(rs.next()){
            Vector<String> data=new Vector<String>();
            String bname=rs.getString(1);
            String btype=rs.getString(2);
            String bauthor=rs.getString(3);
            String bprice=String.valueOf(rs.getInt(4));
            String bquant=String.valueOf(rs.getInt(5));
            data.addElement(bname);
            data.addElement(btype);
            data.addElement(bauthor);
            data.addElement(bprice);
            data.addElement(bquant);
            rows.addElement(data);
           
        }
 }catch(Exception e){
            System.out.println(e);
        }
        return rows;
}
    public String addBook(String bname,String btype,String bauthor,int bprice,int bquant){
        String msg="NoError";
       	try {

    	           PreparedStatement statement=connection.prepareStatement("insert into book (bname,btype,bauthor,bprice,bquant) values(?,?,?,?,?)");
                   statement.setString(1, bname);
    	           statement.setString(2, btype);
                   statement.setString(3, bauthor);
                   statement.setInt(4, bprice);
                   statement.setInt(5, bquant);
                   statement.executeUpdate();

    }catch(Exception e){
            System.out.println(e);
            msg="Error";
    }
        return msg;
    
}
    public void orders_add(String name,String bname,int quant,int price,String date){
        try{
          
            PreparedStatement statement=connection.prepareStatement("insert into orders (cname,bname,quantity,price,date) values(?,?,?,?,?)");
            statement.setString(1, name);
            statement.setString(2, bname);
            statement.setInt(3, quant);
            statement.setInt(4, price);
            statement.setString(5,date);
            statement.executeUpdate();
        }catch(Exception e){
            System.out.print(e);
        }
    }
     public Vector history(){
        
        Vector<Vector> rows=new Vector<Vector>();
        try{
        PreparedStatement statement=connection.prepareStatement("select * from orders");
        ResultSet rs=statement.executeQuery();
        while(rs.next()){
            Vector<String> data=new Vector<String>();
            String cname=rs.getString(1);
            String bname=rs.getString(2);
            String quant=String.valueOf(rs.getInt(3));
            String price=String.valueOf(rs.getInt(4));
            String date=rs.getString(5);
            data.addElement(cname);
            data.addElement(bname);
            data.addElement(quant);
            data.addElement(price);
            data.addElement(date);
            rows.addElement(data);
           
        }
 }catch(Exception e){
            System.out.println(e);
        }
        return rows;
}
}
