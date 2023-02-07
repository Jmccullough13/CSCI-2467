package edu.cscc;

public class LinkedList <T> {
    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    public void addFirst(T content) {
        Node<T> ptr = head;
        head = new Node(content,ptr);
    }

    public void addLast(T content) {
        Node last = new Node(content,null);
        if (head == null) {
            head = last;
        } else {
            Node<T> ptr = head;
            while(ptr.getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(last);
        }
    }

    public boolean deleteFirst() {
        if (head == null) {
            return false;
        } else {
            head = head.getNext();
            return true;
        }
    }

    public boolean deleteLast() {
        if (head == null) {
            return false;
        }
        else if (head.getNext() == null) {
            head = null;
            return true;
        } else {
            Node<T> ptr = head;
            while (ptr.getNext().getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(null);
            return true;
        }
    }

    public Node getHead() {
        return head;
    }

    public String toString() {
        String str;
        if (head == null) {
            str = "<empty>";
        } else {
            Node<T> ptr = head;
            str = "("+ptr.getContent().toString()+")";
            while(ptr.getNext() != null) {
                str = str + "->";
                ptr = ptr.getNext();
                str = str + "(" + ptr.getContent().toString() + ")";
            }
        }
        return str;
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