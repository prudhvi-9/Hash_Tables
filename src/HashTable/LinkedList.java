package HashTable;

public class LinkedList {

	/*
	 * To add node to the linkedlist.
	 */
	public Node addNode(int key, String data, Node head) {

		Node newNode = new Node(key, data);

		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return head;
	}

	/*
	 * To print the linkedlist.
	 */
	public void printLinkedList(Node head) {
		if (head == null) {
			System.out.print("LinkedList is empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
		}
	}

}
