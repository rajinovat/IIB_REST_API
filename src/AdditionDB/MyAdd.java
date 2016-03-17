import com.ibm.broker.plugin.MbElement;
import com.ibm.broker.plugin.MbException;
import com.ibm.broker.plugin.MbJSON;


public abstract class MyAdd {
	public static void addNum(Long j, Long i, MbElement[] output) 
	{
		try {
			MbElement root = output[0];
			MbElement item = root.createElementAsLastChild(MbJSON.OBJECT,MbJSON.ARRAY_ITEM_NAME, null);
			item.createElementAsLastChild(MbElement.TYPE_NAME_VALUE,"implementation", "IIB REST API");
			item.createElementAsLastChild(MbElement.TYPE_NAME_VALUE, "result",j + i);
		} catch (MbException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static String sayHello()
	{
		return "hello";
	}
	

}
