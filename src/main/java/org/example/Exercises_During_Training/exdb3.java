package org.example.Exercises_During_Training;

import java.sql.*;
import java.util.Scanner;

public class exdb3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String url="jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled1\\hr.db";
        String query ="insert into departments values (?,?,?)";
        String query2="delete from departments where department_id=?";
        //بدل ؟ كان مفروض احط كل القيم المخزنه في location
        //and department_name = ?


        // conication DB
        try(Connection conn = DriverManager.getConnection(url);){
            conn.setAutoCommit(false);
            while(true) {
                //؟؟
                //Statement st = conn.createStatement();
                PreparedStatement st = conn.prepareStatement(query);
                System.out.println("enter location ID:");
                int b = sc.nextInt();
                st.setInt(1, b);
                sc.nextLine();

                System.out.println("enter department_name:");
                String m = sc.nextLine();
                st.setString(2, m);

                System.out.println("enter department_id");
                int v = sc.nextInt();
                st.setInt(3, v);

                PreparedStatement st2 = conn.prepareStatement(query2);
                System.out.println("enter department_id");
                int k = sc.nextInt();
                st2.setInt(1, k);

                // to execate query
                int rs = st.executeUpdate();
                System.out.println(rs + "insert");
                int rs3 = st2.executeUpdate();
                System.out.println(rs3 + "delete");
//كانت وظيفتها تطبع لي نصوص تمر ع بيانات الجدول الحين انا بعدل لذلك مو محتاجتها
                // while (rs.next()){
                //int depID = rs.getInt(1);
                //String depName =rs.getString(2);
                //HW.db2c n = new HW.db2c(rs);
                //System.out.println(rs.getInt(1));
                //System.out.println(rs.getInt("department_id"));
                //System.out.println(n);
                // }
                sc.nextLine();

                System.out.println("do you want to save");
                String toSave =sc.nextLine();
                if(toSave.equals("yes")){
                    conn.commit();
                    //يعمل بابليش
                    break;
                    //يعني نفذ كل شيء هذه وظيفة الcommit
                }else if(toSave.equals("no")){
                    conn.rollback();
                    //يتراجع وماينفذ
                    break;
                    //rollback تلغي تنفيذ العمليات على قاعدة البيانات
                }else {
                    System.out.println("you didn't answer");
                    //breack لو حطيتها ما اقدر اضيف زياده
                    //while تسمح لي ادخل اكثر من اداره
                }
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }


    }
}

