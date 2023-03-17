
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Sara");
        list.add("Amelia");
        list.add("Eva");
        System.out.println("Before sorting");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sorting");
        System.out.println(list);


    }
}

