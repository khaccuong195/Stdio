package Net;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();


        list.add("America");
        list.add("Canada");
        list.add("Russia");
        list.add("France");
        printList(list);

        list.remove("Canada");
        printList(list);
        System.out.println(list.indexOf("canada"));
    }

    public static void printList(MyList list){
        System.out.println("--------List items----------");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }
}
