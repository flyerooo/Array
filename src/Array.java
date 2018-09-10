public class Array {
    private int[] data;
    private int size;

    // 构造函数， 传入数组的容量capacity构造Array
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public Array(){
        this(10);
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addLast(int e){
        if(size == data.length)
            throw new IllegalArgumentException("AddLast failed. Array is full.");
        data[size] = e;
        size ++;
    }

    public void add(int index, int e){
        if(size == data.length)
            throw new IllegalArgumentException("Add failed. Array is full.");
        if(index <0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");


    }
}
