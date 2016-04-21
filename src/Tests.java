/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculator.MyMath;

import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
	@Test
	public void testPlus(){
		System.out.println("Test plus");
		assertEquals(4.1, MyMath.plus(2, 2.1), 0.000001);
		assertEquals(111363, MyMath.plus(51515, 59848), 0.1);
		assertEquals(0.559405, MyMath.plus(0.5594, 0.000005), 0.000001);
		assertEquals(181, MyMath.plus(189, -8), 0.1);
	}
	
	@Test
	public void testMinus(){
		System.out.println("Test minus");
		int x=8-2;
		assertEquals(0,MyMath.minus(6, x), 0.1);
		assertEquals(5132720, MyMath.minus(5614561, 481841), 0.1);
		assertEquals(0.148399, MyMath.minus(0.1484, 0.000001), 0.000001);
		assertEquals(-5, MyMath.minus(10, 15), 0.1);
	}
	
	@Test 
	public void testKrat(){
		System.out.println("Test krat");
		assertEquals(64, MyMath.krat(8, 8), 0.1);
		assertEquals(22751631, MyMath.krat(4151, 5481), 0.1);
		assertEquals(93.215, MyMath.krat(0.515, 181), 0.001);
		assertEquals(-100, MyMath.krat(-4, 25), 0.1);
	}
	
	@Test 
	public void testDeleno(){
		System.out.println("Test deleno");
		assertEquals(1, MyMath.deleno(8, 8), 0.1);
		assertEquals(0.75734355, MyMath.deleno(4151, 5481), 0.000000001);
		assertEquals(362, MyMath.deleno(181, 0.5), 0.1);
		assertEquals(-6.25, MyMath.deleno(25, -4), 0.01);
	}
	
	@Test
	public void testNaDruhou(){
		System.out.println("Test na druhou");
		assertEquals(225, MyMath.naDruhou(15), 0.1);
		assertEquals(50625, MyMath.naDruhou(225), 0.1);
		assertEquals(34.1056,MyMath.naDruhou(5.84), 0.0001);
	}
	
	@Test
	public void testNaEntou(){
		System.out.println("Test na n-tou");
		assertEquals(3375, MyMath.naEntou(15, 3), 0.1);
		assertEquals(3125, MyMath.naEntou(5, 5), 0.1);
		assertEquals(195.112,MyMath.naEntou(5.8, 3), 0.0001);
	}

}
