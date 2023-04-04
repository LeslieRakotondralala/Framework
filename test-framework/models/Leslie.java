package models;
import etu001920.framework.annotation.*;
import etu001920.framework.renderer.*;
public class Leslie {
    @Url("/leslie")
    public ModelView helloWorld() {
        return new ModelView("views/leslie.jsp");
    }
}