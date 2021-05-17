public class Student {

    int ID;         //学生id
    String name;    //姓名
    String birDate; //出生日期
    String gender;  //性别

    public Student(int ID, String name, String birDate, String gender) {
        this.ID = ID;
        this.name = name;
        this.birDate = birDate;
        this.gender = gender;
    }

    public Student() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirDate() {
        return birDate;
    }

    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", birDate='" + birDate + '\'' +
                ", gender=" + gender +
                '}';
    }
}
