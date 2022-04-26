package JavaCollections;

public class Test {
    public static void main(String[] args) {
       /* MyList<String> list = new MyArrayList<>();
        list.clear();
        list.add("America");
        list.add("Canada");
        list.add("Russia");
        list.add("France");
        list.add(1,"vietnam");
        for (int i = 0;i<list.getSize();i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println();*/

       MyLinkedList<Integer> linkedList = new MyLinkedList<>(11);

       linkedList.add(12);
       linkedList.add(13);
       linkedList.add(14);
       linkedList.add(15);
       linkedList.add(2,18);



    }
}
