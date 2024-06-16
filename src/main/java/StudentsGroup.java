import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsGroup {
    private Student headOFGroup;
    private List<Student> listOfStudents;
    private List<String> listOfTasks;

    public StudentsGroup(Student s) {
        this.headOFGroup = s;
        this.listOfStudents = new ArrayList<>();
        this.listOfStudents.add(s);
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public List getListOfTasks() {
        return listOfTasks;
    }

    public Student getHeadOFGroup() {
        return headOFGroup;
    }

    public void changeHeadOfGroup(Student head) {
        Student h = this.listOfStudents.get(0);
        if (h.getId() == 1) {
            listOfStudents.set(0, head);

        }
    }

    /**
     * check if id is unique. Id is changed during adding if it is not unique
     **/
    public void addStudent(Student s) {
        List<Integer> indices = new ArrayList<>();
        for (Student f : listOfStudents) {
            indices.add(f.getId());
        }
        s.setId(Collections.max(indices) + 1);

        this.listOfStudents.add(s);

    }

    public void removeStudent(String fname, String lname) {
        while (this.listOfStudents.iterator().hasNext()) {
            Student s = this.listOfStudents.iterator().next();
            if (s.getFirstName().equals(fname) && s.getLastName().equals(lname)) {
                this.listOfStudents.remove(s);
            } else {
                System.out.println("No such student in the list");
                break;
            }
        }

    }

    public void addTask(String task) {
        this.listOfTasks.add(task);
    }

    public boolean markTaskAsCompleted(Student s, String task) {
        boolean completed = false;
        for (Student s1 : getListOfStudents()) {
            if (s1.equals(s)) {
                completed = true;
            }
        }
        System.out.println("The task " + task + " was completed by " + s.getFirstName() + " " + s.getLastName());
        return completed;
    }

}