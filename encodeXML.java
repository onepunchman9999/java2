//<family lastName="Mc" state="CA">
//	<person firstName="G">Message</person>
//</family>
//Assuming a mapping of family => 1, person => 2, firstName => 3, lastName =>4, state =>5
//Returns 1 4 Mc 5 CA 0 2 3 G 0 ...
//0 indicates an end

public void encode(Element root, StringBuffer sb) {
	encode(root.getNameCode(), sb);
	for (Attribute attr: root.attributes) {
		encode(attr, sb);
	}
	encode("0", sb);
	
	if (root.value != null) {
		encode(root.value, sb);
	} else {
		for(Element e: root.children) {
			encode(e, sb);
		}
	}
	encode("0", sb);
}

public void encode(String s, StringBuffer sb) {...}

public void encode(Attribute a, StringBuffer sb) { ... }