package p1;

public class MyLinkedList {
  Node start;

  public void addFirst(int data) {
		// TODO Auto-generated method stub
		Node temp=new Node(data);
		temp.next=start;
		start=temp;
		System.out.println("Data Added Successfully...");
	}
  
public void addLast(int data) {
	// TODO Auto-generated method stub
	Node temp=new Node(data);
	if(start==null) {
	start=temp;
	}
	else {
		Node itr=start;
		while(itr.next!=null) {
			itr=itr.next;
		}
	    itr.next=temp;
	}
	System.out.println("Data Added Successfully...");
	
}

public void display() {
	// TODO Auto-generated method stub
	if(start==null) {
		System.out.println("NO Data in LL: ");
	}else {
		
	System.out.println("Element in LL: ");
	Node itr=start;
	while(itr.next!=null) {
		System.out.print(itr.getData()+" -> ");
		itr=itr.next;
	}
	
	System.out.println(itr.getData()+" -> Null");// last element display
	}
}



public void addPosition(int data) {
	// TODO Auto-generated method stub
	
}
}
