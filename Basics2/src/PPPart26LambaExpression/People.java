package PPPart26LambaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class People {

	private List<String> people = new ArrayList<>();
	
	public People() {
		people.add("Eugene");
		people.add("Marc");
		people.add("Kenneth");
		people.add("Bryan");
		people.add("Ed");
	}
	
	public List<String> getPeople(){
		return Collections.unmodifiableList(people);
	}
}
