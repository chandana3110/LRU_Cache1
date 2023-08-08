import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class MockDataBase {
    HashMap<Integer, Student> data = new HashMap<>();
    public MockDataBase() {
        data.put(1, new Student("Chandana",1,96));
        data.put(2,new Student("Suresh",2,97));
        data.put(3,new Student("Jesri",3,97));
        data.put(4,new Student("Liyanshi",4,78));
        data.put(5,new Student("Suman",5,88));
        data.put(6, new Student("Poornima",6,92));
        data.put(7,new Student("Madhavi",7,92));
        data.put(8,new Student("Dolly",8,90));
        data.put(9, new Student("Satvi",9,91));
    }

    public Student fetchFromDb(int roll) throws InterruptedException {
        System.out.println("Waiting for db...");
        Thread.sleep(500);
        System.out.println("Fetched from db: " + roll);
        return data.get(roll);
    }

}
