package org.huxiao;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Printer> printers = new ArrayList<>();

        // 小红要黑白打印
        printers.add(new BwPrinter());
        // 小刚要彩色打印
        printers.add(new ColorPrinter());
        // 小花要黑白打印
        printers.add(new BwPrinter());

        for (Printer printer : printers) {
            printer.print();
        }
    }
}
