class MyHashSet {
    HashSet<Integer> sh = new HashSet<>();
    public MyHashSet() {
    }
    
    public void add(int key) {
        sh.add(key);
    }
    
    public void remove(int key) {
        sh.remove(key);
    }
    
    public boolean contains(int key) {
        return sh.contains(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */