package Test;

import etu1920.framework.Url;
import etu1920.framework.Modelview;

public class Emp {
    
    @Url(url="find-All")
    public Modelview FindAll() {
        Modelview m = new Modelview();
        m.setView("Ay.jsp");
        System.out.println(" find_all ");
        return m;
    }

}
