// import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

class ALDemo<E>{

    
     private E[] arr;
    private int indx;
    private final int INITIAL_CAPACITY = 10;

    public ALDemo(){
        arr = (E[])new Object[INITIAL_CAPACITY];
    }

    public int size(){
        return this.indx;
    }
    public boolean isEmpty(){
        return this.size() == 0;
    }

     @Override 
    public String toString(){
        if(isEmpty()) return "[]";
        String op ="[";
        for(int i=0; i<size()-1; i++){
            op+= this.arr[i]+", ";
        }
        op+= this.arr[size()-1]+"]";
        return op;
    }
    public static void main(String[] args){
        
        Collection<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Mango");
        list1.add("Apple");
        System.out.println(list1);
        list1.removeAll(list1);
        System.out.println(list1);
        System.out.println("===============");

        Collection<String> list2 = new HashSet<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Mango");
        list2.add("Apple");
        System.out.println(list2);
        list2.removeAll(list2);
        System.out.println(list2);

        

        Collection<Integer> list3 = new TreeSet<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60));

        Collection<Integer> listRemove = Arrays.asList(20,40,60);
        System.out.println(list3);
        list3.removeAll(listRemove);
        System.out.println(list3);

        Collection<String> list4 = new ArrayList<>();
        list4.add("A");
        list4.add("B");
        list4.add("A");
        System.out.println(list4);

        Collection<String> list5 = Arrays.asList("A", "M");
        list4.retainAll(list5);
        System.out.println(list4);
        System.out.println(list5);

        Collection<String> s1 = new HashSet<>();
        s1.add("Cat");
        s1.add("Dog");
        s1.add("Lion");

        Collection<String> s2 = Arrays.asList("Dog","Tiger");
        s1.retainAll(s2);
        System.out.println(s1);

        Collection<Integer> t1 = new TreeSet<>();
        t1.addAll(Arrays.asList(10, 20, 30, 40));

        Collection<Integer> t2 = Arrays.asList(20,40,60);
        t1.retainAll(t2);// op: [20, 40];
        System.out.println(t1);
        System.out.println(t2);

        System.out.println("======22=======");

        // try {
        //     Collection<Integer> tree = new TreeSet<>();
        //     tree.add(1);
        //     tree.contains("tst");
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        System.out.println("EEEEEEEEEEEEEEEEe");

        Collection<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Apple", "Banana", "Orange"));
        System.out.println(list.containsAll(Arrays.asList("Apple", "Banana")));

        // ==================

        System.out.println("EEEEEE#######");

        Collection<String> al = new ArrayList<>();
        al.add("Apple");
        al.add("Banana");
        al.add("Mango");

        // Object[] obj = list.toArray();
        // String op = "[";
        // for(Object o: obj){
        //     System.out.print(o+" ");

        // }

        String[] s = list.toArray(new String[0]);
        System.out.print(s.toString()+" ");

        System.out.println("_____________________");

        List<String> l1 = new ArrayList<>();
        l1.add("m");
        l1.add("o");
        l1.add(1,"B");
        System.out.println(l1);

        List<String> l2 = Arrays.asList("p", "g");
        l1.addAll(2,l2);
        System.out.println(l1);



        System.out.println("PPPPPPPPPPP0000");

        Collection<String>fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("b");
        fruits.add("c");
        fruits.add("d");
        fruits.add("e");

        System.out.println(fruits.size());


    }

   

    
}