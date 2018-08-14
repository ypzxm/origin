package com.example.demo.test;

/**
 * @author zhangyanqing
 * @desc
 * @date 2018/08/12
 */
public class MainTest {
    public static void main(String[] args){
        byte[] a = new byte[]{(byte) 0xc6, (byte) 0xd0};
        String s = new String(a);
        byte[] b = s.getBytes();
        System.out.println(a);
        System.out.println(b);
    }
}
