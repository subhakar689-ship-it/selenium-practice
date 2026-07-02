import java.util.ArrayList;
import java.util.List;

public class New1 {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Mobile");
        products.add("Tablet");
        products.add("Monitor");
        for (int i=0;i<=products.size()-1;i++){
            System.out.println("Product "+(i+1)+" : "+products.get(i));
        }
    }
}
