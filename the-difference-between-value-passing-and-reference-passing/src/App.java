public class App {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        change(a);
        System.out.println(a);

        int[] arr = {1, 2, 3};
        printArray(arr); //1, 2, 3
        referenceChange(arr);
        printArray(arr);//4, 5, 6

        String s = "hello";
        System.out.println(s);// hello
        stringChange(s);
        System.out.println(s);// hello
    }

    public static void change(int a) {
        // 形参的值是实参的拷贝，所以修改形参的值不会影响实参
        a = 4;
    }

    public static void referenceChange(int[] arr) {
        // 引用类型是对实参地址的拷贝，当改变这个地址里的值的时候，该地址所存储的内容就会改变
        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 6;
    }

    public static void stringChange(String s) {
        // 相当于对s new 一个新的地址，对新地址赋值，不会影响实参的值
        s = "world";
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.format("%d ", value);
        }
        System.out.println();
    }
}
