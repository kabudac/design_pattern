package com.example.structuralmode.composite;

import java.util.Scanner;

/**
 * @Author: kabudac
 * @Date: 2022-04-19 10:12:51
 * @Description:
 */

public class Client {
    public static void main(String[] args) {
        Menu menu = new Menu("菜单", 3);
        menu.add(new MenuItem("子菜单", 2));
        menu.add(new MenuItem("子菜单", 2));
        menu.add(new MenuItem("子菜单", 2));
        menu.add(new MenuItem("子菜单", 2));
        menu.print();

        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        System.out.println(next);
        sc.close();

    }
}
