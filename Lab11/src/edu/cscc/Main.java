package edu.cscc;

public class Main {

    public static void main(String[] args) {
        list1();
        list2();
    }

    // Use linked list with Strings
    public static void list1() {
        LinkedList<String> llist = new LinkedList<String>();
        llist.addFirst("one");
        llist.addLast("two");
        llist.addLast("three");
        llist.addFirst("zero");
        llist.addLast("xxxx");
        llist.addFirst("yyyyy");
        llist.deleteLast();
        llist.deleteFirst();
        System.out.println(llist);
        llist.deleteFirst();
        llist.deleteLast();
        llist.deleteFirst();
        llist.deleteLast();
        System.out.println(llist);
    }

    // Use linked list with Integers
    public static void list2() {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        llist.addFirst(1);
        llist.addLast(2);
        llist.addLast(3);
        llist.addFirst(0);
        llist.addLast(142);
        llist.addFirst(-97);
        llist.deleteLast();
        llist.deleteFirst();
        System.out.println(llist);
        llist.deleteFirst();
        llist.deleteLast();
        llist.deleteFirst();
        llist.deleteLast();
        System.out.println(llist);
    }
}

/*
 * Copyright Notice: Columbus State Community College and its employees hold the copyright for this course material. This material is
 * made available to students for their personal use only and may not be distributed for commercial purposes without the College’s
 * express written consent. Uploading this copyrighted material to "tutoring" or other non-Columbus State web sites is prohibited and
 * may result in referral to the Office of Student Conduct and disciplinary action up to and including dismissal.
 *
 * Course ID: 40A9B085A383430396E7BACF467DE6E0
 */