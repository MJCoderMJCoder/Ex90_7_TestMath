package com.testmath;

public class TestMath {

	public static void main(String[] args) {
		System.out.println("E=" + Math.E);
		System.out.println("PI=" + Math.PI);
		System.out.println("abs(-6.8)=" + Math.abs(-6.8));
		System.out.println("abs(-6)=" + Math.abs(-6));
		System.out.println("max(2, 7)=" + Math.max(2, 7));
		System.out.println("min(-2, -7)=" + Math.min(-2, -7));
		System.out.println("9��ƽ������sqrt(9)=" + Math.sqrt(9));
		System.out.println("sin(30degree)=" + Math.sin(Math.toRadians(30)));
		System.out.println("atan(90degree)=" + Math.atan(Math.PI / 2));
		System.out.println("��Ȼ��e��1�η���exp(1)=" + Math.exp(1));
		System.out.println("2��5�η���pow(2, 5)=" + Math.pow(2, 5));
		System.out.println("log10(100)=" + Math.log10(100));
		System.out.println("����3.7����С���������ޣ�ceil(3.7)=" + Math.ceil(3.7));
		System.out.println("С��3.7���������������floor(3.7)=" + Math.floor(3.7));
		System.out.println("��ӽ�3.7��int������(��������)��round(3.7)=" + Math.round(3.7));
	}

}
