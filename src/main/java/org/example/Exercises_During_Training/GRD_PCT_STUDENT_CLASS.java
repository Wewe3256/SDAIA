package org.example.Exercises_During_Training;

public class GRD_PCT_STUDENT_CLASS {
    public static double pct(double mark,double fullMark){
        return mark/fullMark*(100);
    }

    public static String grd(double grd_of_student){
        if(grd_of_student>85) return"exullent";
            else if(grd_of_student>75)return"v.good";
        else if(grd_of_student>65)return"good";
        else if(grd_of_student>50)return"pass";
        else return"fail";
    }

    public static String[] gr(double... grd_of_student) {
        String[] statuses = new String[grd_of_student.length];

        for (int i = 0; i < grd_of_student.length; i++) {
            if (grd_of_student[i] > 85) statuses[i] = "exullent";
            else if (grd_of_student[i] > 75) statuses[i] = "v.good";
            else if (grd_of_student[i] > 65) statuses[i] = "good";
            else if (grd_of_student[i] > 50) statuses[i] = "pass";
            else statuses[i] =  "fail";
        }

        return statuses;
    }
}
