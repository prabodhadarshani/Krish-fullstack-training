
public class ReverseLinkendList {

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
		
		public static void main(String[] args) {
			
			ReverseLinkendList link = new ReverseLinkendList();
			
			//Let's connect from chain
			
			ListNode head  = new ListNode(2);
			ListNode second = new ListNode(4);
			ListNode third = new ListNode(6);
			ListNode fourth = new ListNode(8);
			
			head.next = second; 
			second.next= third;
			third.next=fourth;
			
			link.display(head);
			
			ListNode reversListHeadListNode = link.reverse(head);
			 link.display(reversListHeadListNode);
			
			}

	}



