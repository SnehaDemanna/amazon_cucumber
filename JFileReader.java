package Files;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/*
public class JFileReader {
	public static JSONObject fileRead() throws IOException, ParseException {
		FileReader reader = new FileReader("JSON_files/amazon.json");
		JSONParser js = new JSONParser();
		Object obj = js.parse(reader);
		// typecasting obj to JSONObject
		JSONObject jo = (JSONObject) obj;
		return jo;
	}
}
*/

public class JFileReader 
{
	
	public static JSONObject fileRead() throws IOException, ParseException 
	
	{

Object obj = new JSONParser().parse(new FileReader("C:\\Users\\sneha_demanna\\eclipse-workspace\\cucumber_java_1\\JSON_files\\amazon.json"));
JSONObject jo = (JSONObject) obj;
return jo;

	}
}