
import java.util.Scanner;
import java.util.ArrayList;
//code accesses and prints all the elements of array list
public class PadmajaModifyArrayTest {
    public static void main(String[] args){
        ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();
        list.add(new StringBuilder("One"));
        list.add(new StringBuilder("Two"));
        list.add(new StringBuilder("Three"));
        for(StringBuilder element : list)
            element.append(element.length());
        for(StringBuilder element : list)
            System.out.println(element);


    }
}

