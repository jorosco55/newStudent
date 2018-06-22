public class Student {

    int age;
    String name;
    int id;
    static int numberOfStudents = 0;

    Student () {
        numberOfStudents++;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


}
