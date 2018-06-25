public class Person {

    String name;
    int age;
    double height;
    String gender;
    double weight;
    String race;



    public Person(){}


    public Person( String myName, String myRace, int myAge, double myHeight, double myWeight, String myGender) {
        name = myName;
        race = myRace;
        age = myAge;
        height = myHeight;
        weight = myWeight;
        gender = myGender;

        // Fill in the rest

    }

    public String toString() {
        // Print out all of the details
        return "Name: " + name + "\nRace: " + race + "\nAge: " + age + "\nGender: " + gender;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getGender() {return gender; }

    public double getWeight() {
        return weight;
    }

    public String getRace() {
        return race;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setName(String name) {
        this.name = name;
    }


}
