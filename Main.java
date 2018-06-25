public class Main {


    public static void main(String[] args) {


        Student student = new Student();
        student.setId(1);
        student.setRace( "White" );
        student.setName("John");
        student.setAge(20);
        //student.set
        System.out.println(student.toString());
        System.out.println();


       Teacher teach = new Teacher();
       teach.setName("Sarah");
       teach.setRace("White");
       teach.setAge(28);
       teach.setGender("Female");
       teach.setSchool("North High Mustangs");
       System.out.println(teach.toString());
       System.out.println();



        Person newPerson = new Person();
        newPerson.setName("John Wick");
        newPerson.setAge(23);
        newPerson.setHeight(6);
        newPerson.setWeight(205);
        newPerson.setRace("white");

        System.out.println(newPerson.getName() + " is a "+ newPerson.getRace() + " " + newPerson.getAge() + " year old, " + newPerson.getHeight() + " foot tall, " + newPerson.getWeight() + " pound killing machine!");




        }


}
