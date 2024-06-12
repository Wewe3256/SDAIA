package org.example.Exercises_During_Training;

import java.sql.*;
import java.util.ArrayList;

public class jobDAO {
    private static final String URL = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled1\\hr.db";
    private static final String SELECT_ALL_jobs = "select * from jobs";
    private static final String SELECT_ONE_job = "select * from jobs where job_id = ?";
    //????? تمثل قيمة اي attribiut وكان ممكن احط employees id =?
    private static final String INSERT_jobs = "insert into jobs values (?, ?, ?, ?)";
    private static final String UPDATE_jobs= "update jobs set job_title = ?, min_salary = ?,max_salary = ? where job_id = ?";
    private static final String DELETE_jobs = "delete from jobs where job_id = ?";

    public void insertjob(job.jobdatabaseconiction k) throws SQLException{
        // why??????//????
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(INSERT_jobs);
        //لاني ما اقدر اوصل للميثود لانها في كلاس اخر لذلك استخدمت get()
        //set تسمح لي اوصل واعدل على البيانات
        //  استخدم النوع void للميثود يلي مافيها return بمعنى لاترجع قيمه
        // النوع void  يستخدم للتعديل والحذف او الاضافة حيث لا ارجع قيم بل اضيف قيم
        // بمعنى ان تكون الدالة لاترجع لي اي قيمة ولا استخدمها لعرض شيء
        ////////////// PreparedStatement
        // عندما اتعامل مع جملsQL  تحتوي على متغيرات ?,?,?
       st.setInt(1,k.getJob_id());
        st.setDouble(2,k.getMin_salary());
        st.setDouble(3,k.getMax_salary());
        st.setString(4,k.getJob_title());

        st.executeUpdate();
    }

    public void updatejob( job.jobdatabaseconiction k) throws SQLException{
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(UPDATE_jobs);
        st.setInt(1,k.getJob_id());
        st.setDouble(2,k.getMin_salary());
        st.setDouble(3,k.getMax_salary());
        st.setString(4,k.getJob_title());
        st.executeUpdate();
    }

    public void deletjob(int jobId) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(DELETE_jobs);
        st.setInt(1, jobId);
        // 1 تعني ايش
        //موقع ال id  في القاعده 1
        //لو كان attribiut ثاني كنت حطيت موقع ثاني
        st.executeUpdate();
    }

    public job.jobdatabaseconiction selectjob(int jobId) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ONE_job);
        st.setInt(1, jobId);
        //1 تعني ايش
        ResultSet rs = st.executeQuery();
        //هاذي تسمح لي انتقل على كل نتيجة تنفيذ rs
        if(rs.next()) {
            return new job.jobdatabaseconiction(rs);
            //??????/??????/???????/????????????????/?
        }
        else {
            return null;
        }
    }

    public ArrayList<job.jobdatabaseconiction> selectAlljob() throws SQLException{
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ALL_jobs);
        ResultSet rs = st.executeQuery();
        ArrayList<job.jobdatabaseconiction> depts = new ArrayList<>();
        while (rs.next()) {
            depts.add(new job.jobdatabaseconiction(rs));

            //???//?/???????????
        }

        return depts;
    }
}
