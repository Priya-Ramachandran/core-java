package Class;


import java.util.List;
import java.util.Vector;

public class ArithmeticOperations {
    public static <T extends Number> Number add(T t1, T t2) {
        return (t1.doubleValue() + t2.doubleValue());
    }

    public static <T extends Number> Number subtract(T t1, T t2) {
        return (t1.doubleValue() - t2.doubleValue());
    }

    public static <T extends Number> Number divide(T t1, T t2) {
        if (t2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return (t1.doubleValue() / t2.doubleValue());
    }
 
    public static Number add(List<? extends Number> list) {
        double d = 0;
        for (int i = 0; i < list.size(); i++) {
            d += list.get(i).doubleValue();
        }
        return new Double(d);
    }
    
    public static Number sub(List<? extends Number> list) {
        double d = 0;
        for (int i = 0; i < list.size(); i++) {
            d += list.get(i).doubleValue();
        }
        return new Double(d);
    }
 
    public static void main(String[] args) {
        // Adding 2 integers
        Integer i1 = new Integer(34), i2 = new Integer(43);
        System.out.println("Add with generic method: " + ArithmeticOperations.add(i1, i2));
 
        // Subtracting 2 floats
        Float f1 = new Float(12.56), f2 = new Float(3.6778);
        System.out.println("Subtract with generic method: " + ArithmeticOperations.subtract(f1, f2));
 
        // Dividing 2 integers
        Integer i3 = new Integer(20), i4 = new Integer(5);
        System.out.println("Divide with generic method: " + ArithmeticOperations.divide(i3, i4));
 
       
    }
}