
import animal.puppy;
import static utils.ArrayUtils.reverse;
import static utils.ArrayUtils.stringifyArray;
import static utils.MATH.factorial;
import static utils.MATH.factorialLoop;

public class Driver {

    public static void main(String [] args){

        int arr3[]={9, 20, 3, 44, 88, 300};
        System.out.println(stringifyArray(arr3));
        System.out.println(reverse(arr3));


        double real=15.4;
        Double d = real;
        int i = d.intValue();
        System.out.println(factorial(i));
        System.out.println(factorialLoop(i));

        puppy Joey= new puppy("Joey");
        puppy Chandler=new puppy("Chandler");
        puppy Ross=new puppy("Ross");
        System.out.println(Joey.getName());
        System.out.println(Chandler.getName());
        System.out.println(Ross.getName());

    }


}
