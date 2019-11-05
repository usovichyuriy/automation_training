public class triangleInequality {
    public static boolean getValues(double a, double b, double c){
        if (a<=0 || b<=0 || c<=0){
            throw new IllegalArgumentException();
        }
        return (a+b) > c && (b+c) > a && (a+c) > b;
    }

}
