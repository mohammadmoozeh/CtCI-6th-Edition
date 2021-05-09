package Library;

import java.util.HashSet;

public class LinkedList {
    Library.LinkedList.Node head;

    class Node {
        String data;
        Library.LinkedList.Node next;

        Node(String d) {
            data = d;
            next = null;
        }
    }

    public LinkedList removeDup1(LinkedList list) {
        HashSet<String> items = new HashSet<>();
        LinkedList.Node node = list.head;
        LinkedList.Node previous = null;

        while (node != null) {
            if (items.contains(node.data)) {
                previous.next = node.next;
            } else {
                items.add(node.data);
                previous = node;
            }
            node = node.next;
        }
        return list;
    }

    public LinkedList insert(LinkedList list, String data) {
        LinkedList.Node new_node = new LinkedList.Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        } else {
            LinkedList.Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public void print(LinkedList list) {
        LinkedList.Node currNode = list.head;
        System.out.println("Linked List: ");

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
    }
}
