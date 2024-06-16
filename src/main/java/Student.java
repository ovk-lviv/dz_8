public class Student {
    private int id;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override

    public String toString() {
        return "Student: id-" + id + " First Name - " + firstName + " Last Name - " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Student other = (Student) obj;
        if (obj==this) {
            return true;
        }

        if (this.id != other.id) {
            return false;
        }

        if (!this.firstName.equals(other.firstName)) {
            return false;
        }
        if (!this.lastName.equals(other.lastName)) {
            return false;
        }

        return true;
    }

}
