import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("USA");
        placesToVisit.add("India");
        placesToVisit.add("Australia");
        placesToVisit.add("NewZealand");

        printList(placesToVisit);
        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);
    }
     static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator();
        while(i.hasNext()){
            System.out.println("visiting " + i.next());

        }
        System.out.println("=====");
    }
}
