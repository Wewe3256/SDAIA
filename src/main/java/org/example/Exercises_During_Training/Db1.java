package org.example.Exercises_During_Training;

import java.sql.*;

public class Db1 {
    public static void main(String[] args){
        String url="jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled1\\hr.db";
        String query ="select * from departments";

        // conication DB
        try(Connection conn = DriverManager.getConnection(url);){
            // to  have statment
            Statement st = conn.createStatement();
            // to execate query
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                //int depID = rs.getInt(1);
                //String depName =rs.getString(2);
                db2c n = new db2c(rs);
                System.out.println(n);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }


    }
}
