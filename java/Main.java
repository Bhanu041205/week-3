import java.io.PrintStream;
import src.controller.mod.A;
public class Main {
    public static void main(String[] args)throws Exception {
        PrintStream ps=new PrintStream("out.py");
        ps.println("\n\t Hello world \n");
        ps.println(" object : "+A.x);
    }
}
