package com.testmath;

public class TestMath {

	public static void main(String[] args) {
		System.out.println("E=" + Math.E);
		System.out.println("PI=" + Math.PI);
		System.out.println("abs(-6.8)=" + Math.abs(-6.8));
		System.out.println("abs(-6)=" + Math.abs(-6));
		System.out.println("max(2, 7)=" + Math.max(2, 7));
		System.out.println("min(-2, -7)=" + Math.min(-2, -7));
		System.out.println("9的平方根：sqrt(9)=" + Math.sqrt(9));
		System.out.println("sin(30degree)=" + Math.sin(Math.toRadians(30)));
		System.out.println("atan(90degree)=" + Math.atan(Math.PI / 2));
		System.out.println("自然数e的1次方：exp(1)=" + Math.exp(1));
		System.out.println("2的5次方：pow(2, 5)=" + Math.pow(2, 5));
		System.out.println("log10(100)=" + Math.log10(100));
		System.out.println("大于3.7的最小整数及上限：ceil(3.7)=" + Math.ceil(3.7));
		System.out.println("小于3.7的最大整数及下限floor(3.7)=" + Math.floor(3.7));
		System.out.println("最接近3.7的int型整数(四舍五入)：round(3.7)=" + Math.round(3.7));
	}

}
