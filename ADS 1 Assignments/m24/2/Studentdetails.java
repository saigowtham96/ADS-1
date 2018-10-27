/**.
 * Class for studentdetails.
 */
class Studentdetails {
    private String studentname;
    private int roll_number;
    private double total_marks;

    StudentDetails(String studentname,int roll_number,double total_marks) {
        this.studentname = studentname;
        this.rollnumber = rollnumber;
    }

    public String getStudentName() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;

    }
    public int getRoll_number() {
        return roll_number;
    }

    public void setStudentname(String roll_number) {
        this.roll_number = roll_number;

    }

    public double getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks() {
        this.totalmarks = totalmarks;
    }



}
