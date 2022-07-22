

public class Linkendlistpallindrome {
	
	public int size;  
	private  ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
	
	
	
	public ListNode(int data) {
		this.data =data;
		this.next =next;
	}	
	}
	
	public void display(ListNode head) {
		 ListNode curruent = head;
		   while(curruent != null ) {
			   System.out.print(curruent.data +"-->");
			   curruent = curruent.next;
			  }
		   System.out.println("null");
		   
		   

	       }
	public ListNode reverse(ListNode head) {
		if(head == null) {
			return head;
		}

		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;

		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	
	
	public void Pallindrome(ListNode head){  
        ListNode current = head;  
        boolean flag = true;  
        
        // mid position of the list  
       int mid = (size%2 == 0)? (size/2) : ((size+1)/2);  
  
        //Finds the middle node 
        for(int i=1; i<mid; i++){  
            current = current.next;  
            
            
        }  
  
       // System.out.println("code works");
        ListNode revHead = reverse(current.next);  
  
        
        while(head != null && revHead != null){  
            if(head.data != revHead.data){  
                flag = false;  
                break;  
            }  
            head = head.next;  
            revHead = revHead.next;  
        }  
  
        if(flag)  
            System.out.println("This singly linked list is a palindrome");  
        else  
            System.out.println("This singly linked list is not a palindrome");  
    }  
	
	
	
	
	public static void main(String[] args) {
		
		Linkendlistpallindrome link = new Linkendlistpallindrome();
		
		
		
		ListNode head  = new ListNode(20);
		ListNode second = new ListNode(25);
		ListNode third = new ListNode(34);
		ListNode fourth = new ListNode(25);
	    ListNode fifth = new ListNode(20);
		
		head.next = second; 
		second.next= third;
		third.next=fourth;
		fourth.next=fifth;
		
		link.display(head);
		link.Pallindrome(head); 

		 
//		
//		 ListNode reversListHeadListNode = link.reverse(head);
//		 link.display(reversListHeadListNode);
//		 
	 
		
		}
	

}
