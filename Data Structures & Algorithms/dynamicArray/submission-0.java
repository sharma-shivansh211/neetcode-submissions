class DynamicArray {
    private int[] arr;
    private int capacity;
    private int size;
    private static DynamicArray globalInstance;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity)
            resize();
        arr[size++] = n;
    }

    public int popback() {
        int a = arr[size - 1];
        size--;
        return a;
    }

    private void resize() {
        capacity *= 2;
        int[] narr = new int[capacity];
        for(int i = 0 ; i < size ; i++){
            narr[i] = arr[i];
        }
        arr = narr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
