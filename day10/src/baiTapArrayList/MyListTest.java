package baiTapArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> newList = new MyList<>();
        newList.add(0,1);
        newList.add(1,2);
        newList.add(2,3);
        newList.add(3,4);
        newList.add(3,777);
        System.out.println("thanh phan cua array list: ");
        System.out.println(newList.get(0));
        System.out.println(newList.get(1));
        System.out.println(newList.get(2));
        System.out.println(newList.get(3));
        System.out.println(newList.get(4));
        System.out.println("sau khi xoa: ");

    }
}
