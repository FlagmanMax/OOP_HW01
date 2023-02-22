import java.util.LinkedList;
import java.util.List;

public class Person
{
    private String Name;
    private String MiddleName;
    private String Surname;
    private Gender gender;
    private Integer YearOfBirth;
    private Integer YearOfDeath;
    private Person father;
    private Person mother;
    private List<Person> spouse = new LinkedList<Person>();

    public Person(String name,
                  String middleName,
                  String surname,
                  Gender gender,
                  Integer yearOfBirth,
                  Integer yearOfDeath)
    {
        Name = name;
        MiddleName = middleName;
        Surname = surname;
        this.gender = gender;
        this.YearOfBirth = yearOfBirth;
        this.YearOfDeath = yearOfDeath;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.YearOfBirth = yearOfBirth;
    }

    public void setYearOfDeath(Integer yearOfDeath) {
        this.YearOfDeath = yearOfDeath;
    }

    public String getName() {
        return Name;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public String getNameAndMiddleName()
    {
        return Name + " " + MiddleName;
    }

    public String getSurname() {
        return Surname;
    }

    public Gender getGender() {
        return gender;
    }

    public Integer getYearOfBirth() {
        return YearOfBirth;
    }

    public Integer getYearOfDeath() {
        return YearOfDeath;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", Surname='" + Surname + '\'' +
                ", gender=" + gender +
                ", YearOfBirth=" + YearOfBirth +
                ", YearOfDeath=" + YearOfDeath +
                ", father=" + father +
                ", mother=" + mother +
                ", spouse=" + spouse +
                '}';
    }

    public void printAll() {
        System.out.println("Персона:");
        this.printInfo();
        System.out.println();
    }
    public void printInfo()
    {
        System.out.println("\t" + Name + " " + MiddleName + " " + Surname);
        System.out.println("\t" + "Годы жизни    \t" + YearOfBirth + " - " + YearOfDeath);
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getFather() {
        return father;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getMother() {
        return mother;
    }

    public void addSpouse(Person spouse) {
        this.spouse.add(spouse);
    }

    public List<Person> getSpouse() {
        return this.spouse;
    }
}
