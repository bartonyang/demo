package org.example;

import javax.swing.*;
//
public class SimpleWindow {
    public static void main(String[] args) {
        // 创建一个 JFrame 实例
        JFrame frame = new JFrame("Windows 窗口123");

        // 设置窗口的大小
        frame.setSize(400, 300);

        // 设置关闭窗口时程序退出
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 设置窗口可见
        frame.setVisible(true);
    }
}
