public class Person {
    private String name;
    private String birthDay;
    private String peopleID;

    public Person(String name, String birthDay, String peopleID) {
        this.name = name;
        this.birthDay = birthDay;
        this.peopleID = peopleID;
    }

    public String getPeopleID(){
        return peopleID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
       return  "name = '" + name + '\'' +
                ", birthDay = '" + birthDay + '\'' +
                ", peopleID = '" + peopleID + '\'' +"";
    }
}
