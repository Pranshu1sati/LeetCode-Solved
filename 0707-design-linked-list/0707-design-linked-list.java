public class ListNode {
    int val;
    ListNode next, prev;
    ListNode(int x) {
        val = x;
    }
}
class MyLinkedList {
    int size;
    ListNode head, tail;
    public MyLinkedList() {
         size = 0;
        
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int index) {
        if(index >= size || index < 0) {
            return -1;
        }
        
        ListNode curr = head;
        
        if(index + 1 < size - index) {
            
            for (int i = 0; i < index + 1; ++i) {
                curr = curr.next;
            }
        } else {
            curr = tail;
            for (int i=0; i < size - index; ++i) {
                curr = curr.prev;
            }
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        ListNode previous = head, headnxt = head.next;
        
        size += 1;
        ListNode toAdd = new ListNode(val);
        toAdd.prev = previous;
        toAdd.next = headnxt;
        previous.next = toAdd;
        headnxt.prev = toAdd;
    }
    
    public void addAtTail(int val) {
         ListNode next = tail, prev = tail.prev;
        
        size += 1;
        ListNode toAdd = new ListNode(val);
        toAdd.prev = prev;
        toAdd.next = next;
        prev.next = toAdd;
        next.prev = toAdd;
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) {
            return;
        }
        
        if (index < 0) {
            index = 0;
        }
        
        ListNode previous, successor;
        
        if(index < size - index) {
            previous = head;
            for (int i = 0; i < index; ++i) {
                previous = previous.next;
            }
            successor = previous.next;
        } else {
            successor = tail;
            for (int i=0; i< size - index; ++i) {
                successor = successor.prev;
            }
            previous = successor.prev;
        }
        
        size += 1;
        ListNode toAdd = new ListNode(val);
        
        toAdd.prev = previous;
        toAdd.next = successor;
        previous.next = toAdd;
        successor.prev = toAdd;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0) {
            return;
        }
        if (index >= size) {
            return;
        }
        
        ListNode predecessor, successor;
        if(index < size - index) {
             predecessor = head;
            for(int i = 0; i < index; ++i) {
                predecessor = predecessor.next;
            }
            successor = predecessor.next.next;
        } else {
             successor = tail;
            for(int i = 0; i < size - index - 1; ++i) {
                successor = successor.prev;
            }
            predecessor = successor.prev.prev;
        }
        size--;
        predecessor.next = successor;
        successor.prev = predecessor;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */