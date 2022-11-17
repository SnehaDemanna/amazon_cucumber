package Files;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import bsh.ParseException;

public class JFileReader 
{
	   private static JFileReader instance = new JFileReader();
	   
	   private JFileReader(){}

	   public static JFileReader getInstance(){
		      return instance;
		   }
	   
		public JSONObject fileRead() throws ParseException, FileNotFoundException, IOException, org.json.simple.parser.ParseException 	
		{
			Object obj = new JSONParser().parse(new FileReader("JSON_files\\amazon.json"));

			JSONObject jo = (JSONObject) obj;
			return jo;
		}	


}
