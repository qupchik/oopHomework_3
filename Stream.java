import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private String name;
    private List <StudentGroup> studentGroupsList = new ArrayList<>();


    public Stream(String name) {
        this.name = name;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(studentGroupsList);
    }

    public List<StudentGroup> getStudentGroupsList() {
        return studentGroupsList;
    }

    public void addGroup(StudentGroup studentGroup) {
        studentGroupsList.add(studentGroup);
    }

    public String getName() {
        return this.name;
    }


    public int getCountGroups() {
        return this.studentGroupsList.size();
    }

    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "Stream [name=" + name + ", studentGroupsList=" + studentGroupsList + ", getCountGroups()="
                + getCountGroups() + "]";
    }

    









}
