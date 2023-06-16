package work;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class EncodeDecode {
	public static void main(String[]args) {
		//////////////encode///////////////////
		JSONObject obj=new JSONObject();
		obj.put("name","Arpit");
		obj.put("age", new Integer(10));
		obj.put("salary",new Double(2000.00));
		
		String str=obj.toJSONString();
		System.out.println("encode:" +str);	
		//----------------------decode------------------------
		Object obj1=JSONValue.parse(str);
		JSONObject jsonobject=(JSONObject)obj;
		
		String name=(String) jsonobject.get("name");
		int age=(Integer)jsonobject.get("age");
		double salary=(Double)jsonobject.get("salary");
		System.out.println("decode:" +name + " "+ salary+ " " + age);
	    JSONArray List = new JSONArray();
	    
	}

}

