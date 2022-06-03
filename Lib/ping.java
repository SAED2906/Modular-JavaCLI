import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ping {
	
	public static void main(String[] args) {
		
		HttpURLConnection connection = null;
	    try {
	        URL u = new URL(args[0]);
	        connection = (HttpURLConnection) u.openConnection();
	        connection.setRequestMethod("HEAD");
	        int code = connection.getResponseCode();
	        if (code == 200) {System.out.println(args[0] + " is live");}
	        
	        // You can determine on HTTP return code received. 200 is success.
	    } catch (MalformedURLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    } finally {
	        if (connection != null) {
	            connection.disconnect();
	        }
	    }
		
	}

}
