package principale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Train {

	private String objectTrain;
	private static List<String> cValues = new ArrayList<String>();
	private static Map<Character, Object> mapTrain = new HashMap<Character, Object>();

	public Train(String otrain) {
		this.objectTrain = otrain;
	}

	public String print() {
		String output = "";
		cValues.add("|____|");
		cValues.add("|^^^^|");
		mapTrain.put('H', (String) "<HHHH");
		mapTrain.put('P', (String) "|OOOO|");
		mapTrain.put('R', (String) "|hThT|");
		mapTrain.put('C', (List<String>) cValues);
		char[] charArray = objectTrain.toCharArray();
		int i = 1;
		for (char sortie : charArray) {
			if (i++ != charArray.length) {
				output += (Object) mapTrain.get(sortie) + "::";
			} else {
				output += (Object) mapTrain.get(sortie);
			}
		}
		return output;
	}

	public boolean fill() {
		return false;
	}

}
