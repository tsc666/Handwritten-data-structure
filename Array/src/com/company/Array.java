package com.company;



public class Array<E> {
    private E [] data;
    private int size;
    public Array (int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getcapacity() {
        return data.length;
    }

    public boolean inEmpty() {
        return size == 0;
    }

    public void addLast(E e){
        /*if(size == data.length)
            throw new IllegalArgumentException("Addlist failed");
        data[size] = e;
        size ++ ;*/
        add(size,e);
    }
    public void addFirst(E e){
        add(0,e);
    }
    //在第index个位置中插入一个新元素e
    public void add (int index,E e){

        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed");
        }

        if(size == data.length)
            resize(2*data.length);

        for (int i = size-1;i>=index;i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size ++;
    }

    private void resize(int newCapacity){
        E[] newData = (E[]) new Object[newCapacity];
        for(int i = 0;i<size; i ++){
            newData[i] = data[i];
        }
        data = newData;
    }
    //获取元素
    E get(int index){
        if(index<0||index>=size)
            throw new IllegalArgumentException("");
        return data[index];
    }

    //数组中是否有e
    public boolean contains(E e){
        for(int i=0;i<size;i++){
            if(data[i]==e)
                return true;
        }
        return false;
    }

    //查找数组中e所在的索引，如果不存在返回-1
    public int find(E e){
        for(int i=0;i<size;i++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    //删除指定位置元素
    public E remove(int index){
        if(index<0||index>size)
            throw new IllegalArgumentException("ll");
        E ret = data[index];
        for(int i=index;i<size;i++){
            data[i]=data[i+1];
        }
        size --;
        data[size] = null;
        if(size == data.length / 4 && data.length / 2 != 0){
            resize(data.length/2);
        }
        return ret;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size-1);
    }

    public void removeElement(E e){
        int index = find(e);
        if (index!=-1){
            remove(index);
        }
    }
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("size:%d,capacity:%d\n",size,data.length));
        res.append('[');
        for(int i = 0;i<size;i++){
            res.append(data[i]);
            if(i!=size-1){
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }

    public static void main(String args[]) {
        Array<Integer> arr = new Array<>(19);
        for(int i=0;i<10;i++){
            arr.addLast(i);
        }
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        arr.add(1,100);
        System.out.println(arr);
        arr.addFirst(90);
        System.out.println(arr);
    }
}
