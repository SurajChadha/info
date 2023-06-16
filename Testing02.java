package work;

public class Testing02 {
  
	try {
		Object obj = parse(new FileReader("test.json"));
		JSONObject jsonObject = (JSONObject) obj;
		System.out.println(jsonObject);
		
		String name = (String) jsonObject.get("name");
		System.out.println(name);
		
		long age = (Long) jsonObject.get("Age");
		System.out.println(age);
		
		//loop array
		JSONArray msg = (JSONArray) jsonObject.get("messages");
		Iterator<String> iterator = msg.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
}
