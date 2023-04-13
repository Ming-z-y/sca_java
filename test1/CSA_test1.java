package com.aiMing.java;

class CSA_test1 {
	public static void main(String[] args) {
		// 选择题答案
		System.out.println("1、B 2、B 3、D 4、B 5、D");
		// 函数调用
		showTriangle(4);
		
		reverseString("abcd");
		
		ispalindrome(134);
		
		shuixianHua();
		
		arrraysDemo();
		
		// 思考
		// 有返回值就将函数调用结果赋值给特定值
		// 如果函数定义中没有加 static 不能直接调用，需要用对象调用
	}
	
	public static void showTriangle(int n) {
		for(int i = 1; i <= n; i ++) {
			int t = 2 * i - 1;
			int m = n - i + 1;
			while(m-- != 0) System.out.print(' ');
			while(t-- != 0) System.out.printf("*");
			System.out.println();
		}
	}
	
	public static void reverseString(String s) {
		char[] cs = s.toCharArray();
		char[] newc = new char[cs.length];
		for(int i = cs.length - 1, j = 0; i >= 0 && j < newc.length; i --, j ++) {
			newc[j] = cs[i];
		}
		s = String.valueOf(newc);
		System.out.println(s);
	}
	
	public static void ispalindrome(int num) {
		boolean flag = true;
		String s1 = num + "";
		char[] cs = s1.toCharArray();
		for(int i = 0, j = cs.length - 1; i < j; i ++, j --) {
			if(cs[i] != cs[j]) flag = false;
		}
		if(flag) System.out.println("是的");
		else System.out.println("不是");
	}
	
	public static void shuixianHua(){
		for(int i = 100; i < 1000; i ++) {
			int ge = i % 10;
			int bai = i / 100;
			int shi = (i - ge - bai * 100) / 10;
			int judge = ge * ge * ge + bai * bai * bai + shi * shi * shi;
			if(judge == i ) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
	}

	public static void arrraysDemo() {
		// 模拟数组
		int[] arrays = {3, 8, 12, 10, 90, 67, 53, 46, 78, 34};
		int max = arrays[0];
		int min = arrays[0];
		for(int item : arrays) {
			if(item < min) min = item;
			if(item > max) max = item;
		}
		System.out.printf("最大值: %d, 最小值: %d\n", max, min);
	}
}