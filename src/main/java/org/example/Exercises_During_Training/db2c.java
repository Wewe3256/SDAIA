package org.example.Exercises_During_Training;

import java.sql.ResultSet;
import java.sql.SQLException;

public class db2c {
    private  int departmentId;
    private  String departmentName;
    private  int location;

    public db2c(int departmentId, String departmentName, int location) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.location = location;
    }

    public db2c(ResultSet rs) throws SQLException {
        departmentId = rs.getInt(1);
        //departmentId = rs.getInt("department_id");
        departmentName=rs.getString(2);
        location=rs.getInt(3);

    }


    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getLocation() {
        return location;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setLocation(int location) {
        this.location = location;
    }
//??????//
    @Override
    public String toString() {
        return "HW.db2c{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", location=" + location +
                '}';
    }
}
