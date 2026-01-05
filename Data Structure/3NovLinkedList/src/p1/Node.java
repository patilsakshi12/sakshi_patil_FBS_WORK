package p1;

public class Node {
  int data;
  Node next;
  
  
  public Node() {
	// TODO Auto-generated constructor stub
}

public Node(int data) {
	
	this.data = data;

}

public int getData() {
	return data;
}

public void setData(int data) {
	this.data = data;
}

public Node getNextref() {
	return next;
}

public void setNextref(Node nextref) {
	this.next = nextref;
}
  
  
}
