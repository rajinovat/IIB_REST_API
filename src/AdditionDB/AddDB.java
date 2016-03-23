

import java.util.ArrayList;
import java.util.List;
import com.ibm.broker.plugin.MbElement;
import com.ibm.broker.plugin.MbException;
import com.ibm.broker.plugin.MbJSON;
import com.ibm.broker.plugin.MbMessage;

public abstract class AddDB {

	private static List<Add> addition = new ArrayList<>();
	
	static {
		addition.add(new Add(5, 5, 10));
		addition.add(new Add(10, 10, 25));
	}
	
	public static void find(MbElement[] output) {
		try {
			// Code changes  made now
			MbElement root = output[0];
			for (Add add : addition) {
				MbElement item = root.createElementAsLastChild(MbJSON.OBJECT, MbJSON.ARRAY_ITEM_NAME, null);
				item.createElementAsLastChild(MbElement.TYPE_NAME_VALUE, "id", add.getId());
				item.createElementAsLastChild(MbElement.TYPE_NAME_VALUE, "i", add.getI());
				item.createElementAsLastChild(MbElement.TYPE_NAME_VALUE, "j", add.getJ());
				item.createElementAsLastChild(MbElement.TYPE_NAME_VALUE, "k", add.getK());
				
		}
		} catch (MbException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static MbElement add(int i,int j, int k) throws MbException {
		Add add = new Add(i, j, k);
		addition.add(add);
		MbMessage message = new MbMessage();
		MbElement result = message.getRootElement().createElementAsLastChild(MbJSON.OBJECT, MbJSON.DATA_ELEMENT_NAME, null);
		result.createElementAsLastChild(MbElement.TYPE_NAME_VALUE, "message", "A new object with ID '" + add.getId() + "' was successfully added.");
		return result;
	}

}
