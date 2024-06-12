package org.example.Exercises_During_Training;

import org.example.HW.dbhwemployy;

import java.sql.*;

public class mainemployy {
    public static void main(String[] args){
        String url="jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled1\\hr.db";
        String query ="select * from employees";

        // conication DB
        try(Connection conn = DriverManager.getConnection(url);){
            // to  have statment
            Statement st = conn.createStatement();
            // to execate query
            ResultSet rs = st.executeQuery(query);
            //توجد به نتيجة query
            // عملت while لانه راح يطبع مجموعة قيم في select وليسست قيمة واحده
            //int empID = rs.getInt(1);
            //System.out.println(empID);
              while (rs.next()){
               // int empID = rs.getInt(1);
                //System.out.println(empID);
                //لو ماسويت كلاس به كل الِAtrribiut كان لازم اكمل على هذا نمط
                 dbhwemployy n = new dbhwemployy(rs);
                  System.out.println(n);
             }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }


    }
}
