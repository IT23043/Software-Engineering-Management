import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5);
        System.out.println("Initial capacity of Vector: "+vector.capacity());
        for (int i = 1; i <= 30; i++) {
            vector.add(i);
            System.out.println("Added " + i + ", size: " + vector.size() + ", capacity: " + vector.capacity());
        }
    }
}
