
public class Set {
	LinkedNode front;
	Set() {
		front=null;
	}
	
	//checks to see if a number already exists in our list.
	public boolean exists(int num) {
		boolean exists = false;
		LinkedNode curr = front;
		while (curr != null) {
			if (curr.x == num) {
				exists = true;
			}
			curr=curr.next;
		}
		return exists;

				
	}
	
	//First checks to see if the number already exists, and if it does not exists adds it to our list.
	public void add(int num) {
		if (exists(num) == false) {
		LinkedNode node = new LinkedNode(num);
		node.next=front;
		front=node;
		}
		
	}
	//This method checks to see if a value exists in our linked list, and if it does it deletes it from the list.
	public void delete(int num) {
		LinkedNode curr = front;
		LinkedNode front = null;
		if (exists(num)== false) {
			return;
		}
		if (curr.x == num) {
			front = curr.next;
			return;
		}
			while(curr.x !=num) {
				front = curr;
				curr = curr.next;
			}
		front.next=curr.next;
	}
	
	
	//This method prints out our linked list.
	public String toString() {		
		String str = "";
		LinkedNode curr = front;		
		while (curr!=null) {
			str += curr.x + " ";
			curr = curr.next;
		}			
		return str;
	}

}
