package io.mhan.adapter.instanseadapter;

import io.mhan.adapter.classadapter.Print;
import io.mhan.adapter.classadapter.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
