package models;
import etu001920.framework.annotation.Url;
import etu001920.framework.renderer.ModelView;
public class Test {
    @Url("/test")
    public ModelView helloWorld() {
        return new ModelView("views/test.jsp");
    }
}