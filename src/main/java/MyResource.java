import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/*
 * @Path("test") // if I add singleton pattern annotation application did not
 * create instance when click again refresh same count variable increment
 * 
 * @Singleton public class MyResource {
 * 
 * private int count; // for calculate how many times api clicks
 * 
 * @GET
 * 
 * @Produces(MediaType.TEXT_PLAIN) public String testMethod(){ count +=1; return
 * "It's works, This method was called " + count + " time(s)"; } }
 */


@Path("{pathParam}/test")
//check pathparam and queryparam values
// webapi/value/test?query=query
public class MyResource {
 
	@PathParam("pathParam") private String pathParamExample;
	@QueryParam("query") private String queryParamExample;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod(){
		return "It's works, path param used "+ pathParamExample + " and query param used "+ queryParamExample;
	}
}
