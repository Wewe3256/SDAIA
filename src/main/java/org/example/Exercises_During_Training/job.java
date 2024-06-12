package org.example.Exercises_During_Training;

import java.sql.*;

public class job {
    public static void main(String[] args){
        String url="jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled1\\hr.db";
        String query ="select * from jobs";

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
                jobdatabaseconiction n = new jobdatabaseconiction(rs);
                System.out.println(n);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }


    }

    public static class jobdatabaseconiction {
        private  int job_id;
        private  double min_salary;
        private  double max_salary;
        private  String job_title;


        public jobdatabaseconiction(int job_id, double min_salary, double max_salary, String job_title) {
            this.job_id = job_id;
            this.min_salary = min_salary;
            this.max_salary = max_salary;
            this.job_title = job_title;
        }

        public jobdatabaseconiction(ResultSet rs) throws SQLException {
            job_id=rs.getInt(1);
            min_salary= rs.getDouble(3);
            max_salary= rs.getDouble(4);
            job_title=rs.getString(2);

        }

        public int getJob_id() {
            return job_id;
        }

        public double getMin_salary() {
            return min_salary;
        }

        public double getMax_salary() {
            return max_salary;
        }

        public String getJob_title() {
            return job_title;
        }

        public void setJob_id(int job_id) {
            this.job_id = job_id;
        }

        public void setMin_salary(double min_salary) {
            this.min_salary = min_salary;
        }

        public void setMax_salary(double max_salary) {
            this.max_salary = max_salary;
        }

        public void setJob_title(String job_title) {
            this.job_title = job_title;
        }

        @Override
        public String toString() {
            return "HW.jobdatabaseconiction{" +
                    "job_id=" + job_id +
                    ", min_salary=" + min_salary +
                    ", max_salary=" + max_salary +
                    ", job_title='" + job_title + '\'' +
                    '}';
        }
    }
}
