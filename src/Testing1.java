import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class B{
	public static void main(String args[]) {
		System.out.println( "....." );
	}
}
class Testing1 {
	
	public static void main(String args[]) {
		Map ak = new HashMap();
		ak.put("aks",11);
		ak.put("aaaaa", 22);
		Set s1 = ak.entrySet();
		Iterator i = s1.iterator();
		while(i.hasNext()) {
			Map.Entry a = (Map.Entry)i.next();
			System.out.println(a.getKey().toString() + "....." + a.getValue());
			if(a.getKey().equals("aks")){
				a.setValue(45555);
			}
		}
		System.out.println(ak);
	}
}