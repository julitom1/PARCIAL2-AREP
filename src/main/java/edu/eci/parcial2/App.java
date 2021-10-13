package edu.eci.parcial2;

import spark.Request;

import spark.Response;
import spark.Spark;

import static spark.Spark.*;

import org.json.JSONObject;

import com.google.gson.Gson;




public class App {

	private static Service service = new Service();
	
	public static void main(String [] args){
        port(getPort());
        get("/log",(req,res) -> getLog(req,res));
        get("/acos",(req,res) -> getAcos(req,res));
    }
    

    /**
     * 
     * @param req Lo que le llevo al servidor
     * @param res Lo que devolvera el servidor
     * @return el logaritmo del valor dado
     */
	public static JSONObject getLog(Request req, Response res) {
		res.type("application/json");
		Double value = Double.valueOf(req.queryParams("value"));
		JSONObject myObject = new JSONObject();
		myObject.put("operation", "log");
        myObject.put("input", value);
        myObject.put("output", service.getLog(value));
    	return myObject;
    }
	
	/**
     * 
     * @param req Lo que le llevo al servidor
     * @param res Lo que devolvera el servidor
     * @return el acos del valor dado
     */
	public static JSONObject getAcos(Request req, Response res) {
		res.type("application/json");
		Double value = Double.valueOf(req.queryParams("value"));
		JSONObject myObject = new JSONObject();
		myObject.put("operation", "acos");
        myObject.put("input", value);
        try {
        	myObject.put("output", service.getAcos(value));
        }catch(Exception e) {
        	myObject.put("output", "Operacion no valida");
        }
    	return myObject;
    }


	/**
	 * Mira si existe un puerto, si no devuelve el 5000
	 * @return   un puerto disponible
	 */
private static int getPort() {
      if (System.getenv("PORT") != null) {
          return Integer.parseInt(System.getenv("PORT"));
      }
      return 5000;
  }
  
  
}
