package org.example.Exercises_During_Training;

import java.sql.*;
import java.util.Scanner;

public class bdex {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String url="jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled1\\hr.db";
        String query ="select department_id from departments where location_id = ? And department_name = ? ";
        //بدل ؟ كان مفروض احط كل القيم المخزنه في location
        //and department_name = ?


        // conication DB
        try(Connection conn = DriverManager.getConnection(url);){
            //؟؟
            //Statement st = conn.createStatement();
            PreparedStatement st =conn.prepareStatement(query);
            System.out.println("enter location ID:");
            int b =sc.nextInt();
            st.setInt(1,b);
            sc.nextLine();

            System.out.println("enter department_name:");
            String m =sc.nextLine();
            st.setString(2,m);



            // to execate query
            ResultSet rs = st.executeQuery();

            while (rs.next()){
                //int depID = rs.getInt(1);
                //String depName =rs.getString(2);
                //HW.db2c n = new HW.db2c(rs);
                System.out.println(rs.getInt(1));
                //System.out.println(rs.getInt("department_id"));
                //System.out.println(n);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }


    }
}
