import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      List<String> browsers = new ArrayList<>();
      browsers.add("chrome");
        browsers.add("edge");
        browsers.add("firefox");
        browsers.add("edge1");
        browsers.add("chrome2");
        browsers.set(2,"firefox1");
        System.out.println(browsers);
        System.out.println(browsers.size());
        System.out.println(browsers.get(2));
        System.out.println(browsers.contains("firefox1"));
        for (String browse:browsers){
            System.out.println(browse);
        }
        browsers.clear();
        System.out.println(browsers.size());

        }

    }