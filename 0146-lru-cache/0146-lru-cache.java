class DoublyNode {
	int key;
	int value;
	DoublyNode left;
	DoublyNode right;

}

class LRUCache {
    Map<Integer, DoublyNode> map = new HashMap();
    int MAX_CAPACITY = 0;
    DoublyNode start;
    DoublyNode end;
    
    public LRUCache(int capacity) {
        MAX_CAPACITY = capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
			return -1;
		else {
			DoublyNode node = map.get(key);
			
			removeNode(node);
			addToStart(node);
			return node.value;
			
		}
    }
    
    public void put(int key, int value) {
        if(!map.containsKey(key)) {
			DoublyNode node = new DoublyNode();
			node.key=key;
			node.value=value;
			
			if(map.size()>=MAX_CAPACITY) {
				map.remove(end.key);
				removeNode(end);
			}
			addToStart(node);
			map.put(key, node);
		}else {
			DoublyNode node = map.get(key);
			node.value=value;
			
			removeNode(node);
			addToStart(node);
			map.put(key,node);
		}
    }
    
    private void removeNode(DoublyNode end2) {
		
		if(end2.left!=null)
			end2.left.right = end2.right;
		else
			start=end2.right;
		
		if(end2.right!=null)
			end2.right.left=end2.left;
		else
			end=end2.left;
		
		
		
	}
    
    private void addToStart(DoublyNode node) {
		
		if(start==null)
			start=node;
		else {
			node.right=start;
			node.left=null;
			start.left=node;
			start = node;
		}
		
		if(end==null)
			end=node;
	}
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */