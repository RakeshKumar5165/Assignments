package Factory;

import java.util.Scanner;

public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or
     * environment variables.
     */
    private static Application configureApplication() {
        Application app;
        Sportsfactory factory;
       System.out.println("enter brand");
        Scanner s=new Scanner(System.in);
        String x=s.next();
        
        if (x.contains("mrf")) {
            factory = new MRFFactory();
            app = new Application(factory);
        } else {
            factory = new ReebokFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}