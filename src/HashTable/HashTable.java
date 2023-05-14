package HashTable;

import java.util.ArrayList;

public class HashTable {

	public ArrayList<Node> HashTable;
	LinkedList list;
	Integer key;
	String value;

	/*
	 * Constructor
	 */
	public HashTable() {
		HashTable = new ArrayList<Node>();
		list = new LinkedList();
	}

	public HashTable(ArrayList<Node> HashTable) {
		this.HashTable = HashTable;
	}

	/*
	 * To add value to the hash table.
	 * 
	 */
	public void addValue(int key, String value) {
		Node head = null;
		if (HashTable == null) {
			Node newNode = new Node(key, value);
			HashTable.add(newNode);
		}
		for (Node node : HashTable) {
			if (node.data == value) {
				head = node;
			}
		}
		if (head == null) {
			Node newNode = new Node(key, value);
			HashTable.add(newNode);
			head = newNode;
		}
		head = list.addNode(key, value, head);
		for (Node node : HashTable) {
			if (node.data == value) {
				node = head;
			}
		}
	}

	/*
	 * To find Frequency Of Word.
	 */
	static void FrequencyOfWord(int key, String value) {
		String arr[] = value.split(" ");
		int n = arr.length;
		int[] freq = new int[arr.length];

		for (int i = 0; i < n; i++) {
			freq[i] = 1;

			for (int j = i + 1; j < n; j++) {
				if (arr[i].equals(arr[j])) {
					freq[i]++;
					arr[j] = null;
				}
			}
		}
		for (int i = 0; i < freq.length; i++) {
			if (arr[i] != null && arr[i] != null)
				System.out.println(arr[i] + "->" + freq[i]);
		}
	}

	/*
	 * Print the list.
	 */
	public void printHashTable(ArrayList<Node> hashMap) {
		for (Node node : hashMap) {
			System.out.print(node.data + " --> ");
			list.printLinkedList(node.next);
			System.out.println();
		}
	}

}
