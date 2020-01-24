package homeWork;

public class HelloWorld {
    public static  void main (String[] args) {
//        byte byteVariable = 1;
//        short shortVariable = 2;
//        int intVariable = 3;
//        long longVariable = 4;
//        char charVariable = 'a';
//        float floatVariable = 1;
//        double doubleVariable = 1;
//        boolean booleeanVariable = true;
//        System.out.println("byte: " + byteVariable + '\n');
//        System.out.println("short: " + shortVariable +'\n');
//        System.out.println("int: " + intVariable + '\n');
//        System.out.println("long: " + longVariable +'\n');
//        System.out.println("char: " + charVariable + '\n');
//        System.out.println("float: " + floatVariable +'\n');
//        System.out.println("double: " + doubleVariable + '\n');
//        System.out.println("boolean: " + booleeanVariable +'\n');
        String str = "123,456.";
        System.out.println(str.length());//字符串长度
        System.out.println(str.indexOf('2'));//返回字符‘2’所在的小标
        System.out.println(str.charAt(1));//返回下标为1的字符
        System.out.println(str.startsWith(","));//测试是否以"，"开始的字符串
        System.out.println(str.endsWith("."));//测试是否以"."结束的字符串
        System.out.println(str.substring(4,7));//提取子字符串的范围[4,7)
    }
}
