package cn.bluejoe.xmlbeans.formater;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bluejoe2008@gmail.com
 */

public class ValueFormaterRegistry implements ValueFormaterFactory
{
	private Map<Class<?>, ValueFormater> _map = new HashMap<Class<?>, ValueFormater>();

	public ValueFormater getValueFormater(Object value)
	{
		return _map.get(value.getClass());
	}

	public void registerValueFormater(Class<?> beanClass, ValueFormater valueFormater)
	{
		_map.put(beanClass, valueFormater);
	}
}
