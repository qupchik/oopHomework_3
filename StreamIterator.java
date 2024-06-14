import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup>{
    private List<StudentGroup> studentGroupsList;
    private int counter = 0;

    public StreamIterator(List<StudentGroup> studentGroupsList) {
        this.studentGroupsList = studentGroupsList;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroupsList.size();
    }

    @Override
    public StudentGroup next() {
        if (hasNext()) {
            return studentGroupsList.get(counter++);
        }
        return null;
    }

    

    @Override
    public void remove() {
        if (hasNext()) {
            studentGroupsList.remove(counter);
        }
    }
}
