
public class Test01 {
    public static void main(String[] args) {

        Tretja.Ukaz[] ukazi1 = {
            new Tretja.Postavi(10),
            new Tretja.Postavi(6),
            new Tretja.Odvzemi(6),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(9),
            new Tretja.Odvzemi(5),
            new Tretja.Postavi(9),
            new Tretja.Postavi(8),
            new Tretja.Postavi(2),
        };
        System.out.println(Tretja.Ukaz.bilanca(ukazi1));

        Tretja.Ukaz[] ukazi2 = {
            new Tretja.Odvzemi(3),
            new Tretja.Odvzemi(5),
            new Tretja.Postavi(7),
        };
        System.out.println(Tretja.Ukaz.bilanca(ukazi2));

        Tretja.Ukaz[] ukazi3 = {
            new Tretja.Postavi(8),
            new Tretja.Postavi(1),
            new Tretja.Postavi(7),
            new Tretja.Postavi(9),
            new Tretja.Odvzemi(3),
            new Tretja.Odvzemi(9),
            new Tretja.Postavi(1),
            new Tretja.Postavi(10),
            new Tretja.Odvzemi(3),
            new Tretja.Postavi(3),
            new Tretja.Postavi(2),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(8),
            new Tretja.Odvzemi(4),
            new Tretja.Odvzemi(5),
            new Tretja.Postavi(5),
            new Tretja.Postavi(0),
            new Tretja.Postavi(6),
            new Tretja.Postavi(3),
            new Tretja.Odvzemi(9),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(5),
            new Tretja.Odvzemi(8),
            new Tretja.Postavi(8),
            new Tretja.Postavi(9),
            new Tretja.Odvzemi(9),
        };
        System.out.println(Tretja.Ukaz.bilanca(ukazi3));

        Tretja.Ukaz[] ukazi4 = {
            new Tretja.Postavi(2),
            new Tretja.Odvzemi(0),
            new Tretja.Postavi(0),
            new Tretja.Postavi(1),
            new Tretja.Postavi(0),
            new Tretja.Postavi(9),
            new Tretja.Postavi(0),
            new Tretja.Postavi(1),
            new Tretja.Postavi(9),
            new Tretja.Postavi(5),
            new Tretja.Postavi(9),
            new Tretja.Odvzemi(7),
            new Tretja.Postavi(5),
            new Tretja.Postavi(1),
            new Tretja.Postavi(10),
            new Tretja.Postavi(5),
            new Tretja.Postavi(10),
            new Tretja.Odvzemi(3),
            new Tretja.Postavi(6),
            new Tretja.Postavi(1),
            new Tretja.Postavi(3),
            new Tretja.Postavi(6),
            new Tretja.Postavi(8),
            new Tretja.Postavi(0),
            new Tretja.Postavi(1),
            new Tretja.Postavi(3),
            new Tretja.Postavi(0),
            new Tretja.Postavi(0),
            new Tretja.Postavi(10),
            new Tretja.Postavi(1),
            new Tretja.Postavi(9),
            new Tretja.Postavi(8),
            new Tretja.Postavi(8),
            new Tretja.Postavi(3),
            new Tretja.Postavi(10),
            new Tretja.Postavi(6),
            new Tretja.Odvzemi(3),
            new Tretja.Postavi(8),
            new Tretja.Postavi(3),
            new Tretja.Postavi(0),
            new Tretja.Odvzemi(0),
            new Tretja.Postavi(0),
        };
        System.out.println(Tretja.Ukaz.bilanca(ukazi4));

        Tretja.Ukaz[] ukazi5 = {
            new Tretja.Odvzemi(9),
            new Tretja.Odvzemi(8),
            new Tretja.Odvzemi(4),
            new Tretja.Postavi(8),
            new Tretja.Odvzemi(10),
            new Tretja.Odvzemi(7),
            new Tretja.Odvzemi(6),
            new Tretja.Odvzemi(6),
            new Tretja.Odvzemi(7),
        };
        System.out.println(Tretja.Ukaz.bilanca(ukazi5));
    }
}
