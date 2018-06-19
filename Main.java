public class Main {

    public static void main(String[] args) {
        Student New = new Student();
        New.setId(1);
        New.setName("John");
        New.setAge(20);
        System.out.println(New.getName() + " is " + New.getAge() + " years old");


        Teacher Instructor = new Teacher();
        Instructor.setSchool("North High");
        Instructor.setCourseTought("Engrish");
        Instructor.setOfficeHours("Monday thru Friay");
        System.out.println(Instructor.getSchool() + " teaches " + Instructor.getCourseTought() + " during to following days: " + Instructor.getOfficeHours());
    }
}
