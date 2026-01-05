package p1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MyLinkedList myll=new MyLinkedList();
    Scanner sc=new Scanner(System.in);
    
    //insertion
 /*   myll.add(10);
    myll.add(20);
    myll.add(30);
    myll.add(40);
    myll.add(50);
    
    //display
    myll.display();*/
     int choice,data,ch;
    do {
    	System.out.println("\t1.Add");
    	System.out.println("\t2.display");
    	System.out.println("\t3.EXIT");
    	System.out.println("Enter Your Choice");
    	choice=sc.nextInt();
    	
    	switch(choice) {
    	case 1:
    	{
    		System.out.println("Enter Data to add: ");
    		data=sc.nextInt();
    		do {
    			System.out.println("\t1.Add First");
    			System.out.println("\t2.Add Position");
    			System.out.println("\t3.Add Last");
    			System.out.println("Enter Your Choice: ");
    			 ch=sc.nextInt();
    			switch(ch) {
    			case 1:
    				myll.addFirst(data);
    				break;
    				
    			case 2:
    				myll.addPosition(data);
    				break;
    				
    			case 3:
    				myll.addLast(data);
    				break;
    			
    				default:
    					System.out.println("Enter Valid Choice! ");
    			}
    			System.out.println("Do You Want to Continue ?");
    			System.out.println("\t1.Yes");
    			System.out.println("\t2.Go To main menu");
    			ch=sc.nextInt();
    		}while(ch==1);
    		myll.addLast(data);
    		break;
    	}
    	case 2:
    	{
    		myll.display();
    		break;
    	}
    	case 3:
    	{
    		System.out.println("Exiting");
    		break;
    		
    	}
    	default:
    		System.out.println("Invalide Choice!");
    	}
    }while(true);
	}

}
