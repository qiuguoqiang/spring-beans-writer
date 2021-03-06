package cn.bluejoe.xmlbeans.node.value;

import org.dom4j.Element;

/**
 * @author bluejoe2008@gmail.com
 */
public class ValueNodeDelegate extends AbstractXmlNode implements ValueNode
{
	private ValueNode _delegatedValueNode;

	public ValueNode getDelegatedValueNode()
	{
		return _delegatedValueNode;
	}

	public void setDelegatedValueNode(ValueNode delegatedValueNode)
	{
		_delegatedValueNode = delegatedValueNode;
	}

	@Override
	public String toString()
	{
		if (_delegatedValueNode != null)
			return _delegatedValueNode.toString();

		return super.toString();
	}

	public void writeTo(Element parentElement)
	{
		_delegatedValueNode.writeTo(parentElement);
	}
}
