

public class Teacher extends Person{


    String school;


    public String toString(){
        String sch = super.toString();
        sch += "\nschool: "+ school;
        return sch;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }


}


