public class Student extends Person {

    int id;
    static int numberOfStudents = 0;

    Student () {
        numberOfStudents++;
    }

    // Create toString method that inherits from Person
    // Hint: first list would be something like:
    public String toString(){
        String s = super.toString();
        s += "\nID: "+ id;
        return s;
    }

    public void setRace( String r ){
        super.setRace( r );
    }



    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


}
