import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("webapi")
public class MyApp extends Application {

    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>();
    }
}
