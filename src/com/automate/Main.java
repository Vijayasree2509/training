package com.automate;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"USA");
        addInOrder(placesToVisit,"India");
        addInOrder(placesToVisit,"Australia");
        addInOrder(placesToVisit,"NewZealand");

        printList(placesToVisit);
        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);
        placesToVisit.remove(2);
        printList(placesToVisit);
    }
    static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator();
        while(i.hasNext()){
            System.out.println("visiting " + i.next());

        }
        System.out.println("=====");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator= linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison=stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                System.out.println(newCity + "is already included");
                return false;
            }else if(comparison >0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison<0){

            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    }

