package StepDefination_1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import bsh.ParseException;

public class JFileReader 
{
	private static JFileReader single_instance = null;

	private JFileReader(){}

	public static JFileReader getInstance()
	{

		if (single_instance == null)
			single_instance = new JFileReader();

		return single_instance;


	}

	public JSONObject fileRead() throws Exception 	
	{
		Object obj = new JSONParser().parse(new FileReader("src\\test\\resources\\JSON_files\\amazon.json"));

		JSONObject jo = (JSONObject) obj;
		return jo;
	}	


}

