/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * クラスCalculatorに対するテストケース
 * @author klab（佐藤寛文）
 */

public class CalculatorTest {
    
    
    /**
     * 引数がどちらも正整数の場合のテスト＜br/＞
     * 対象：multiply(int, int)＜br/＞
     * 条件：引数10,20＜br/＞
     * 期待する結果：戻り値200＜br/＞
     */
    @Test
    public void testMultiply01() throws Exception{
        Calculator calc = new Calculator();
        int expected = 200;
        int actual = calc.multiply(10, 20);
        assertEquals(expected, actual);
    }
    
    /**
     * 片方が正数、片方が負数の場合のテスト＜br/＞
     * 対象：multiply(int, int)＜br/＞
     * 条件：引数-10,20＜br/＞
     * 期待する結果：戻り値-200＜br/＞
     */
    @Test
    public void testMultiply02() throws Exception{
        Calculator calc = new Calculator();
        int expected = -200;
        int actual = calc.multiply(-10, 20);
        assertEquals(expected, actual);
    }
    
    /**
     * 片方が0、片方が負数の場合のテスト＜br/＞
     * 対象：multiply(int, int)＜br/＞
     * 条件：引数0,-20＜br/＞
     * 期待する結果：戻り値0＜br/＞
     */
    @Test
    public void testMultiply03() throws Exception{
        Calculator calc = new Calculator();
        int expected = 0;
        int actual = calc.multiply(0, -20);
        assertEquals(expected, actual);
    }
    
    
    /**
     * c &gt; b &gt; aの場合＜br/＞
     * 対象：max(int, int, int)＜br/＞
     * 条件：引数10,20, 30＜br/＞
     * 期待する結果：戻り値30＜br/＞
     */
    @Test
    public void testMax01() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10, 20, 30);
        assertEquals(expected, actual);
    }
    
    /**
     * a &gt; b &gt; cの場合＜br/＞
     * 対象：max(int, int, int)＜br/＞
     * 条件：引数30,20, 10＜br/＞
     * 期待する結果：戻り値30＜br/＞
     */
     @Test
    public void testMax02() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 20, 10);
        assertEquals(expected, actual);
    }
    
    /**
     * b &gt; a &gt; c＜br/＞
     * 対象：max(int, int, int)＜br/＞
     * 条件：引数20,10, 30＜br/＞
     * 期待する結果：戻り値30＜br/＞
     */
     @Test
    public void testMax03() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20, 30, 10);
        assertEquals(expected, actual);
    }
}
