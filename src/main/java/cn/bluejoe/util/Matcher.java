package cn.bluejoe.util;

/**
 * 匹配器
 * 
 * @author SuXianMing
 * @version 1.0.0 , 2011-12-31
 * @param <T>
 */
public interface Matcher<T>
{
	public boolean matches(T x);
}
