package com.company.array;

public class Array {

    private int[] data;
    private int size;//表示数组的元素 同时也指向第一个没有元素的位置

    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }
    public Array(){
        this(10);
    }
    //数组中元素的个数
    public int getSize(){
      return size;
    }
    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }
    //返回数组为null
    public boolean isEmpty(){
        return size==0;
    }
    //给数组尾部添加元素
    public void addLast(int e){
        //首先判断数组空间是否够
       /* if(size==getCapacity()){
            throw new IllegalArgumentException("addList is fail .Array is full");
        }
        data[size]=e;
        size++;*/
       add(size,e);
    }
    //在数组头部添加元素
    public void addHead(int e){
        add(0,e);
    }
    //向指定索引位置出添加元素
    public void add(int index,int e){
        //判断有没有位置放
        if(size==getCapacity()){
            throw  new IllegalArgumentException("add is fall,Array is full");
        }
        //判断索引是否合法
        if(index<0||index>size){
            throw  new IllegalArgumentException("add is fall,Array index>=0 || index<=size");
        }
        //从最后一个开发
        for(int i=size-1;i>=index;i--){
            data[i+1]=data[i];
        }
        data[index]=e;
        size++;
    }

    @Override
    public  String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d,capacity = %d\n",size,data.length));
        res.append("[");
        for (int i=0;i<size;i++){
            res.append(data[i]);
            if (i!=size-1){
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }

    public int get(int index){
        if(index<0 ||index>size){
            throw new IllegalArgumentException("Get Failed,Index is illegal");
        }
        return data[index];
    }

    void set(int index,int e){
        if(index<0 ||index>size){
            throw new IllegalArgumentException("Get Failed,Index is illegal");
        }
        data[index]=e;
    }
    //是否包含某个元素
    public boolean contains(int e){
        for (int i=0;i<size;i++){
            if(data[i]==e){
                return true;
            }
        }
        return false;
    }

    public int find(int e){
        for (int i=0;i<size;i++){
            if(data[i]==e){
                return i;
            }
        }
        return -1;
    }
    //从数组中删除index位置的元素，返回删除的元素
    public int remove(int index){
        if(index<0 ||index>size){
            throw new IllegalArgumentException("remove Failed,Index is illegal");
        }
        int ret = data[index];//待删除的元素
        for (int i=index+1;i< size;i++){
                data[i-1] = data[i];
        }
        size--;
        return ret;
    }
    public int removeFirst(){
        return remove(0);
    }
    public int removeList(){
        return remove(size-1);
    }
    //从数组中删除元素e
    //对于现在的数组来说
    //这个是只删除单个元素  如果有相同的数据 只删除一个
    public void removeElement(int e){
        int index = find(e);
        if(index!=-1){
            remove(index);
        }
    }

}
