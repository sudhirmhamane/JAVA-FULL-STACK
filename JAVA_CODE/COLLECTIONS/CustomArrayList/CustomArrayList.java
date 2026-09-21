import java.util.*;


// custome Exception handling for no such elements present
class UserNoSuchElementException extends RuntimeException{
    UserNoSuchElementException(){
        super();
    }
}

class UserIndexOutOfBoundsIndexException extends RuntimeException{
    UserIndexOutOfBoundsIndexException(String desc){
        super(desc);
    }
}
class CustomArrayList<E> implements Cloneable{

    private E[] arr;
    private int index;
    private final int INITIAL_CAPACITY = 10;


    public CustomArrayList(){
        this.arr = (E[]) new Object[INITIAL_CAPACITY];
    }

    public CustomArrayList(int capacity){
        this.arr = (E[]) new Object[capacity];
    }

    // public CustomArrayList(CustomArrayList colln){
    //     this.arr = (E[]) Object [colln.size()];

    //     for(int i=0; i<this.arr.length; i++){
    //         this.arr[i] = (E) colln.get(i);
    //     }
    // }

    public int size(){
        return this.index;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    @Override
    public String toString(){
        if(size() == 0) return "[]";
        String op = "[";
        for(int i=0; i<size()-1; i++){
            op+= this.arr[i]+", ";
        }
        op += this.arr[size()-1]+"]";
        return op;
    }

    private int newCapacity(int oldCap){
        return (int) (oldCap * 1.5);
    }

    public void addLast(E ele){
        add(ele);
    }

    public boolean add(E ele){
        if(size() == this.arr.length){
            this.arr = createNewArray(this.arr.length);
        }
        this.arr[this.index] = ele;
        this.index++;
        return true;
    }

    public void addFirst(E ele){
        if(size() == this.arr.length){
            this.arr = createNewArray(this.arr.length);
        }

        for(int i=size()-1; i>=0; i--){
            this.arr[i+1] = this.arr[i];
        }
        this.arr[0] = ele;
        this.index++;
    }

    public void add(int index, E ele){
        checkIndex(index);
        if(this.size() == this.arr.length){
            this.arr = createNewArray(this.arr.length);
        }

        for(int i=this.size()-1; i>=index; i--){
            this.arr[i+1] = this.arr[i];
        }
        this.arr[index] = ele;
        this.index++;
    }

    public boolean addAll(CustomArrayList<E> colln){
        for(int i=0; i<size(); i++){
            E ele = colln.get(i);
            this.addLast(ele);
        }
        return true;
    }

    public boolean addAll(int index, CustomArrayList<E> colln){
        if(index == size()) addAll(colln);

        for(int i=0; i<colln.size(); i++){
            E ele = colln.get(i);
            add(index++, ele);
        }

        return true;
    }

    public boolean contains(E ele){
        if(size() == 0) return false;
        for(int i=0; i<arr.length; i++){
            if(this.arr[i] == ele){
                return true;
            }
        }
        return false;
    }

    public int capacity(){
        return this.arr.length;
    }

    public E get(int index){
        checkIndex(index);
        return this.arr[index];
    }

    public E removeFirst(){
        if(isEmpty()){
            throw new UserNoSuchElementException();
        }

        E temp = this.arr[0];
        for(int i=1; i<size(); i++){
            this.arr[i-1] = this.arr[i];
        }
        this.index--;
        return temp;
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size()-1);
    }

    public void checkIndex(int index){
        if(index < 0 || index>= size()){
            throw new UserIndexOutOfBoundsIndexException("Index "+ index + "out of bounds for length"+ size());
        }
    }

    public E[] createNewArray(int oldLen){
        E[] newArr = (E[]) new Object[newCapacity(oldLen)];
        for(int i=0; i<size(); i++){
            newArr[i] = this.arr[i];
        }

        return newArr;
    }

    public void trimeToSize(){
        if(this.arr.length == size()) return ;
        E[] newArr = (E[]) new Object[this.size()];

        for(int i=0; i<size(); i++){
            newArr[i] = this.arr[i];
        }
        this.arr = newArr;
    }

    public void ensureCapacity(int newCap){
        if(this.capacity() >= newCap) return;

        E[] newArr = (E[]) new Object[newCap];
        for(int i=0; i<size(); i++){
            newArr[i] = this.arr[i];
        }
        this.arr = newArr;
    }

    public int indexOf(E ele){
        if(isEmpty()) return -1;
        for(int i=0; i<size(); i++){
            if(ele.equals(this.arr[i])) return i;
        }

        return -1;
    }

    public int lastIndexOf(E ele){
        if(isEmpty()) return -1;

        for(int i=size()-1; i>=0; i--){
            if(this.arr[i].equals(ele)) return i;
        }

        return -1;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public Object[] toArray(){
        Object[] newArr = new Object[this.size()];
        for(int i=0; i<this.size(); i++){
            newArr[i] = this.arr[i];
        }
        return newArr;
    }

    public <T> T[] toArray(T[] newArr){
        T[] newArr1 = (T[]) new Object[newArr.length];
        for(int i=0; i<this.size(); i++){
            newArr[i] = (T) this.arr[i];
        }
        return newArr1;
    }

    public E set(int index, E newEle){
        checkIndex(index);
        E temp = this.arr[index];
        this.arr[index] = newEle;
        return temp;
    }

    public E remove(int index){
        checkIndex(index);
        E temp = this.arr[index];
        for(int i=index+1; i<size(); i++){
            this.arr[i-1] = this.arr[i];
        }
        this.index--;
        return temp;
    }

    public E removeLast(){
        if(isEmpty()) throw new UserNoSuchElementException();
        return remove(size()-1);
    }

    public boolean removeAll(CustomArrayList<E> colln){
        if(isEmpty()) return false;
        boolean flag = false;
        for(int i=0; i<colln.size(); i++){
            E ele = colln.get(i);
            while(true){
                int pos = this.indexOf(ele);
                if(pos != -1){
                    flag = true;
                    remove(ele);
                } else{
                    break;
                }
            }
        }
        return flag;
    }

    // public boolean retainAll(CustomArrayList<E> colln){
    //     boolean[] b = new boolean[this.size()];
    //     boolean flag = false;
    //     for(int i=0; i<colln.size(); i++){
    //         E ele = colln.get(i);
    //         for(int j=0; j<size(); j++){
    //             if(this.get(j).equals(ele)) b[j] = true;
    //         }
    //     }
    //     int len = b.length;
    //     E[] newArr = (E[]) new Object[this.arr.length];
    //     int ind = 0;
    //     for(int i=0; i<len; i++){
    //         if(b[i]){
    //             flag = true;
    //             newArr[ind++] = this.get(i);
    //         }
    //     }
    //     this.arr = newArr;

    // }

    @Override
    public boolean equals(Object obj){
        if(!(this instanceof CustomArrayList)) return false;
        return this.hashCode() == obj.hashCode();
    }

    public boolean remove(Object obj){
        E temp = (E) obj;
        int index = this.indexOf(temp);
        if(index != -1){
            remove(index);
            return true;
        }
        return false;
    }

    public void clear(){
        if(isEmpty()) return;

        for(int i=0; i<size(); i++){
            this.arr[i] = null;
        }
        this.index = 0;
    }


    // public boolean addAll(CustomArrayList<E> colln){
    //     for(int i=0; i<colln.size(); i++){
    //         E ele = colln.get(i);
    //         this.addLast(ele);
    //     }
    //     return true;
    // }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(50));
        System.out.println(list.contains(50));
        System.out.println(list.remove(4));


        List<Integer> list1 = new ArrayList<>();
        list1.add(60);
        list1.add(70);
        list1.add(80);
        list1.add(90);
        list.addAll(2,list1);
        System.out.println(list);

    }
}