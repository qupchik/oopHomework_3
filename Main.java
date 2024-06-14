import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        StreamService streamService = new StreamService();
        StudentGroup studentGroup1 = new StudentGroup("qwe");
        StudentGroup studentGroup2 = new StudentGroup("www");
        StudentGroup studentGroup3 = new StudentGroup("ewq");
        StudentGroup studentGroup4 = new StudentGroup("cdwq");
        StudentGroup studentGroup5 = new StudentGroup("asdg");
        StudentGroup studentGroup6 = new StudentGroup("acsd");
        Stream stream1 = new Stream("asd");
        stream1.addGroup(studentGroup1);
        Stream stream2 = new Stream("sss");
        stream2.addGroup(studentGroup2);
        stream2.addGroup(studentGroup3);
        Stream stream3 = new Stream("dsa");
        stream3.addGroup(studentGroup4);
        stream3.addGroup(studentGroup5);
        stream3.addGroup(studentGroup6);
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);


        streamService.sortByGroupCount(streams);

        for (Stream stream : streams) {
            System.out.println("Поток " + stream.getName() + " с количеством групп: " + stream.getCountGroups());
        }

    }
}