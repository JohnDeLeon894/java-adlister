import java.io.Serializable;
import java.util.Date;

public class EmployeesBean implements Serializable {

    private long empNo;
    private String firstName;
    private String lastName;
    private char gender;
    private Date birthDate;
    private Date hireDate;


    // getters and setters


    public EmployeesBean() {

    }

    public EmployeesBean(long empNo, String firstName, String lastName, char gender, Date birthDate, Date hireDate) {
        this.empNo = empNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    //getters


    public long getEmpNo() {
        return empNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    // setters


    public void setEmpNo(long empNo) {
        this.empNo = empNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
