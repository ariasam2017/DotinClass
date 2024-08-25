package Generic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    public static <T> boolean ListsEqual(List<T> list1, List<T> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) throws IOException {
        System.out.println("آرایه اول را پر نمائید");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Object> list1 = new ArrayList<>();
        list1.add(reader.readLine());
        List<Object> list2 = new ArrayList<>();
        list2.add(reader.readLine());
        ListsEqual("23232","232323232");
        System.out.println(list1.size());
        System.out.println(list2.size());
    }


}
