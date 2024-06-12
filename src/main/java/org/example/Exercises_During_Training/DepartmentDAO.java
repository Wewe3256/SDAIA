package org.example.Exercises_During_Training;

import java.sql.*;
import java.util.ArrayList;

public class DepartmentDAO {

        private static final String URL = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled1\\hr.db";
        private static final String SELECT_ALL_DEPTS = "select * from departments";
        private static final String SELECT_ONE_DEPT = "select * from departments where department_id = ?";
        private static final String INSERT_DEPT = "insert into departments values (?, ?, ?)";
        private static final String UPDATE_DEPT = "update departments set department_name = ?, location_id = ? where department_id = ?";
        private static final String DELETE_DEPT = "delete from departments where department_id = ?";

        public void insertDept( db2c d) throws SQLException {
            Connection conn = DriverManager.getConnection(URL);
            PreparedStatement st = conn.prepareStatement(INSERT_DEPT);
            //لاني ما اقدر اوصل للميثود لانها في كلاس اخر لذلك استخدمت get()
            //set تسمح لي اوصل واعدل على البيانات
            st.setInt(1,d.getDepartmentId());
            st.setString(2, d.getDepartmentName());
            st.setInt(3, d.getLocation());
            st.executeUpdate();
        }

        public void updateDept(db2c d) throws SQLException {
            Connection conn = DriverManager.getConnection(URL);
            PreparedStatement st = conn.prepareStatement(UPDATE_DEPT);
            st.setInt(3, d.getDepartmentId());
            st.setString(1, d.getDepartmentName());
            st.setInt(2, d.getLocation());
            st.executeUpdate();
        }

        public void updateDept(int deptId) throws SQLException {
            Connection conn = DriverManager.getConnection(URL);
            PreparedStatement st = conn.prepareStatement(DELETE_DEPT);
            st.setInt(1, deptId);
            st.executeUpdate();
        }

        public db2c selectDept(int deptId) throws SQLException {
            Connection conn = DriverManager.getConnection(URL);
            PreparedStatement st = conn.prepareStatement(SELECT_ONE_DEPT);
            st.setInt(1, deptId);
            ResultSet rs = st.executeQuery();
            //هاذي تسمح لي انتقل على كل نتيجة تنفيذ rs
            if(rs.next()) {
                return new db2c(rs);
                //??????/??????/???????/????????????????/?
            }
            else {
                return null;
            }
        }

        public ArrayList<db2c> selectAllDepts() throws SQLException {
            Connection conn = DriverManager.getConnection(URL);
            PreparedStatement st = conn.prepareStatement(SELECT_ALL_DEPTS);
            ResultSet rs = st.executeQuery();
            ArrayList<db2c> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new db2c(rs));

                //???//?/???????????
            }

            return depts;
        }


}
