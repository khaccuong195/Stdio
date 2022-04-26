package JavaCollections;

public class Test {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        list.clear();
        list.add("net");
        list.add("zet");
        list.add("bet");
        list.add("het");
        list.add(1,"net");
        System.out.println("danh sach list");
        for (int i = 0;i<list.getSize();i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println(list.indexOf("net"));
        System.out.println(list.contain("net"));



        System.out.println();
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(10);

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5,5);
        linkedList.printList();
        System.out.println();
        System.out.println(linkedList.indexOf(2));
        System.out.println(linkedList.contain(2));
        linkedList.remove(linkedList.getSize()-1);
        linkedList.printList();


    }
}
