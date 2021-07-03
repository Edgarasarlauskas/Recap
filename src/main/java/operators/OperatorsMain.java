package operators;

public class OperatorsMain {

    public static void main(String[] args) {


        int x = 5;
        int y = 3;
        x += y;
        x -= y;
        x *= y;
        x /= y;

        //Relational (palyginimo) opearators grazina boolean

        System.out.println(x == y);
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x <= y );
        System.out.println(x !=y );


        // logical operators (salygos)
// short cycle tikrinimas
        System.out.println(x == 8 && y ==5);
        System.out.println(x ==8 || y ==5);

        // long cycle tikrinimas
        System.out.println(x == 8 & y ==5);
        System.out.println(x ==8 | y ==5);

    }
}
