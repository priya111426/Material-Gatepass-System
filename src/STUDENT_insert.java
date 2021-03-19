import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import javax.swing.JOptionPane;

        
        class student_insert{
        
public static void main(String args[]){

    
    Scanner sc=new Scanner(System.in);
    
     String name1="selena";
int age1=25;
String gender1="F";
String course1="Singing";
int roll_no= 102;
    
String  query="insert  into stu"
        +"(name,age,gender,course,roll_no)" 
        +"values(?,?,?,?,?)";
       
       try{  

 Class.forName("com.mysql.jdbc.Driver");
Connection  con=(Connection) DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","1998");  

PreparedStatement pst=con.prepareStatement(query);

           pst.setString(1,name1);
                pst.setInt(2,age1);
             pst.setString(3,gender1);
              pst.setString(4,course1);
             pst.setInt(5,roll_no);
                                 
                   pst.executeUpdate();
                   JOptionPane.showMessageDialog(null,"Saved.");

}
catch(Exception  e){
    JOptionPane.showMessageDialog(null,  "Server error !");

}  
        
        }}