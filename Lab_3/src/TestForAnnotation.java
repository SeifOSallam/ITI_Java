@Author(val = 10, name = "classAnnot")
public class TestForAnnotation {
    @Author(val = 20, name = "VarAnnot")
    public int var;

    @Author(val = 30, name = "ConstructorAnnot")
    public TestForAnnotation(){
        var = 0;
    }

    @Author(val = 40, name = "MethodAnnot")
    public int getVar() {
        return var;
    }

}
