//package ch12;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//
//public class GenericTest {
//    public static void main(String[] args) {
//        TwoList<String> testObj = new TwoList<String>();
//        testObj.add("A");
//        testObj.add("B");
//        testObj.add("C");
//        for (String testItem:testObj.getList()) {
//            System.out.println("testObj = " + testItem);
//
//        }
//    }
//}
//
//class TwoList<T>{
//    ArrayList<T> li1 = new ArrayList<T>();
//    ArrayList<T> li2 = new ArrayList<T>() ;
//    void add(T item){
//        li1.add(item);
//        li2.add(item);
//    }
//    ArrayList<T> getList(){
//        ArrayList<T> mergedList = new ArrayList<T>();
//        mergedList.addAll(li1);
//        mergedList.addAll(li2);
//        return mergedList;
//    }
//}