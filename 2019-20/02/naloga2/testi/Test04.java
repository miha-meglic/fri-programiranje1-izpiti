
public class Test04 {

    public static void main(String[] args) {
        char[][] krizanka0 = {
            {'h', 'f', 'e', 'm', 'u', 'a', 'y', 'y', 'h', 'n', 'm', 'b', 'n', 'a', 'l', 'y', 'f', 'i'},
            {'n', 'v', 'h', 'n', 'r', 'l', 'a', 'k', '-', 'l', 'c', 'e', 's', 'b', 'd', 'u', 'n', 'v'},
            {'p', 'm', 'b', 'm', 'x', 's', 'z', 'r', 'x', 'b', 'u', 't', 'k', 'j', 'a', 'o', 'r', 'o'},
            {'l', 'a', 'b', 'z', 'y', 'v', 'g', 'w', 'r', 'o', 'i', 'g', 'y', 'r', 'm', 'j', 'v', 'o'},
            {'o', 'v', 's', 'l', 'i', 't', 'e', 'j', 'h', 'n', 'f', 'x', 'l', 'j', 'v', 'n', 'i', 'm'},
            {'l', 'g', 'x', 'u', 'j', 'f', 'w', 'g', 'a', 'l', 's', 'q', 's', 'l', 'r', 'z', 'm', 'q'},
            {'v', 'h', 'i', 'd', 'n', 'z', 'e', 's', 'h', 'w', '-', 'x', 'v', 't', 'w', '-', 'b', 'm'},
            {'b', 'j', '-', 'q', 'e', 'a', 'b', 'u', '-', 'q', 'p', 'q', 'p', 'q', '-', 'i', 'a', 'f'},
            {'h', 'b', 'a', 'u', 'x', 'x', 'l', 'i', 'z', 'r', 'y', 's', 'q', 'y', 'y', 'g', 'z', 'h'},
            {'d', 'c', 'm', 'k', 'w', 'y', 'h', 'e', 'v', 'v', 'v', 'j', 'n', 'p', 'p', 'g', 'c', 'r'},
            {'t', 'r', 'v', 'v', 'j', 'j', 'z', 'o', 'h', 'v', 'h', 't', 'k', 'r', 'z', 'o', 'b', 'l'},
            {'k', 'y', 'p', 's', 'n', 'k', 'b', 'z', 'm', 'o', 'z', 'z', 's', 'a', 'y', 'j', 'i', 'q'},
            {'b', 'h', 'o', 'b', 'q', 'n', 'm', 'b', 'v', 'v', 'e', 'o', 'y', 'e', 'm', 'y', 'g', 'n'},
            {'n', 'l', 'o', 'm', 'u', 'n', 'g', 'e', 'e', 'o', 'x', 'g', 'e', 'q', 'q', 'j', 'i', 'm'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka0));

        char[][] krizanka1 = {
            {'n', 'k', 'y', 'a', 'k', 'k', 'x', 'p', 'x', 'c', 'r', 'e', 'h', 'w', 'b', 'n', 'n', 'b'},
            {'o', 'e', 'c', 'r', 'g', 'e', 'u', 'n', 'l', 'i', 'e', 'w', 'i', 'a', 'a', '-', 'f', 's'},
            {'s', 's', '-', 'r', 'w', 'j', 'o', 'u', 'j', 'u', 'd', 'd', 'f', 'h', 'x', 'b', 'k', '-'},
            {'f', 'x', 'a', 'f', 'm', 'k', 's', 'l', 'o', 'd', 'l', 'i', 'u', 'm', 't', 's', 'n', '-'},
            {'l', 'w', 'd', 'b', 'k', 'r', 'n', 'y', 'g', 's', 'w', 'o', 'm', 'b', 's', 'o', 'q', 'u'},
            {'e', 'o', 'n', 'a', 'b', 'l', 'p', 'm', 'b', 'y', 's', 'b', 'u', 'j', 'f', 'q', 'r', 't'},
            {'m', 'g', 'x', 'w', 'p', 'e', 'a', 'i', 'v', 'h', 'v', 'u', 'f', 's', 'c', 'j', 'r', 'z'},
            {'o', 'h', 'z', '-', 'j', 'z', 'p', 'v', 'n', 's', 'h', 'f', 's', 'n', 'z', 'g', 'e', 'b'},
            {'j', 'a', 'c', 'i', 'e', 'v', 'g', 'o', 'h', 'k', 'e', 'u', 'q', 'i', 'o', '-', 'k', 'q'},
            {'y', 'e', 'f', 'd', 'k', 'm', 'c', '-', 'h', 'k', 't', 'b', 'd', 'v', 'i', '-', 'h', 'r'},
            {'k', 'w', 'r', 'e', 'u', 't', 'w', 'j', 'i', 'f', 'u', 'h', 'e', 'z', 'q', '-', 'k', 'm'},
            {'p', 's', 's', 'f', 'j', 'h', 'e', 'k', 'x', 'x', 'x', 'f', 'c', 'y', 'o', 'x', 'j', 't'},
            {'x', 'm', 'u', 'k', 'l', 'c', 'g', 'o', 'o', 'w', 'j', 'c', 'h', 'c', 'm', 'u', 'u', 'x'},
            {'o', 'm', 'd', 'b', 'u', 'q', 'z', 'd', 'w', 'a', 'h', 'e', 'o', 'b', 'w', 'i', 'm', 'f'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka1));

        char[][] krizanka2 = {
            {'a', 'g', 'k', 'k', 'x', 'x', 'y', 'x', 'a', 'f', 'k', 'q', '-', 'c', 'j', 'h', 'r', 'g'},
            {'k', 'u', 'p', 'p', 'v', 'h', 'l', 'm', 'h', 'j', 'k', 'd', 'u', 'j', 'y', 's', 'u', 'a'},
            {'t', 'y', 'q', 'g', 's', 'q', 'f', 'r', 'm', 's', 'p', 'z', 'b', 's', '-', 'f', 'n', 'a'},
            {'u', 'x', 'e', 'y', 't', 'c', 'c', 'q', 'k', 'i', 'f', 'n', 'j', 'k', 'l', 'm', 'h', 'k'},
            {'c', 'd', 'j', 'd', 'd', 'm', 'q', 'u', 'v', 'r', 'r', 'x', 'b', '-', 'o', 'u', 'm', 'p'},
            {'n', 'h', 'c', 'z', 'z', 'c', 'f', 't', 'f', 't', 'o', 'c', 'x', 'd', 'o', 'd', 'd', 'x'},
            {'b', 's', 'd', 'l', 'g', 'j', 't', 'u', 'g', 'k', 'q', 'x', 'n', 'v', '-', 'r', 'y', 'x'},
            {'g', 'r', 'x', 'x', 'h', 'g', 'm', 'h', 'u', 'n', 'f', 'x', 'e', 'w', 'j', 'r', 'j', '-'},
            {'i', 'z', 'c', 'e', 'm', 'd', 'e', 'f', 'w', 'z', 'y', 's', 'b', 'c', 'u', 'v', 'x', 'y'},
            {'-', 'c', 'u', 'v', 'n', 'x', '-', 'b', 'r', 'j', 'n', 'b', 'l', 'v', 'h', 'd', 's', 'z'},
            {'d', 'k', 'x', 'a', 'd', 'h', 'v', 'o', 'w', 'f', 'r', 'k', 'h', 'b', 'u', 's', 's', 'l'},
            {'y', 'd', 'b', 'd', 'b', 'm', 'u', 'g', 'n', 'g', 'n', 'k', '-', 'g', 'v', 'k', 'j', '-'},
            {'f', 'p', 'w', 'u', 'q', 'j', 'n', 'j', 'w', 'w', 'y', 'o', 's', 'n', 'q', 'l', 'o', 'b'},
            {'q', 'j', 'j', 'x', 'r', 'h', 'y', 'b', 't', 'o', 'd', 'a', 'h', 'w', 'e', 'a', 'f', 'h'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka2));

        char[][] krizanka3 = {
            {'q', 'u', 'v', 'p', 'a', 'v', 's', 't', 'g', 't', 'e', 'o', 'm', 'h', 'f', 'j', 'q', 'u'},
            {'t', 'd', 'n', 'w', 'o', 'm', 'v', 'h', 'r', 'v', 'f', 'x', 'd', 'f', 'v', 'l', 'u', 'u'},
            {'f', 'b', 'c', 'n', 'u', 't', 'o', 'h', 'c', 'b', 'w', 'v', 'f', 's', '-', 'a', 'h', 'j'},
            {'s', 'n', 'o', 'a', 'c', 'r', 'f', 'a', 'x', 'k', 'k', 'k', 'v', 'r', 'y', 'c', 'v', 'k'},
            {'v', 'm', 'o', 'o', 'g', 'a', 'i', 'l', 'v', 'e', '-', 'i', 'p', 'x', 's', 'v', 'i', 'b'},
            {'e', 'u', 'n', 't', 'v', 'u', 'w', 'q', 'h', 't', 'm', 't', 'l', 'o', 'h', 't', 'q', 'p'},
            {'w', 'c', 'j', 'v', 't', 'h', 'h', 'y', 'c', 't', 'd', 'm', 'p', 'e', 't', 'k', 'i', 'c'},
            {'y', 'z', '-', 'x', 'j', 'w', 'c', 'q', 'r', 'z', 'k', 'e', 'g', 'a', 'i', 'm', 'k', 'a'},
            {'d', 'q', 'k', 'm', 'o', 'u', '-', 'v', 'f', 'g', 'o', 'x', 'b', 'k', 'i', 'q', 'y', 'u'},
            {'a', 't', 'e', 'j', 's', 'e', 't', 'y', 'h', 'n', 'f', 'u', 't', 'j', 't', 'p', 'x', 'w'},
            {'w', 'k', 'a', 't', 'k', '-', 'x', 'k', 'x', 'p', 'u', 'w', 'r', 'm', 'h', '-', 'r', 'h'},
            {'g', 'h', 'm', 'n', 'g', 'd', 'd', 'e', 'i', 'b', 'd', 'u', 'm', 'o', 'w', 'k', 'b', 't'},
            {'i', 'w', 'c', 'f', 'r', 'g', 'b', 'q', 'h', 'i', 'w', 'r', 'l', 'm', 'u', 'y', 'h', 'x'},
            {'j', 'w', 'x', 'r', 'i', 'k', 'g', 's', 'v', 'v', 'z', 'u', 'f', 'k', 'n', 'j', 'i', 's'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka3));

        char[][] krizanka4 = {
            {'m', 'x', 'b', 'a', 'x', 'c', 'y', 'z', 'g', 'w', 'x', 'h', 'j', 'x', 'z', 'k', 'd', 'c'},
            {'q', 's', 'x', 'x', 'b', 'y', 'q', 'h', 'k', 'g', 'w', 'h', 't', 'm', 'm', 'i', 'z', 'e'},
            {'k', 'x', 'v', '-', 'c', 'j', 'x', 'k', 'o', 'x', 'o', 'x', 'y', 'n', 'g', 'a', 'z', 's'},
            {'w', 'b', 'd', 'u', 's', 'y', 'a', 'y', 'y', 'a', 'c', 'n', 'l', 'd', 'm', '-', 'h', 'm'},
            {'g', 'm', 'j', 'n', 'n', 'n', 'e', 'k', 'z', 'y', 'z', 'j', 'r', 'y', 'd', 'k', 'h', 's'},
            {'v', 'c', 'n', 'h', 'x', 'j', 'e', 'q', 'y', 's', 'i', 'v', 'e', 'z', 't', 'u', 'a', 'm'},
            {'b', 'b', 'x', 'q', 'z', 'e', 'k', 'a', 'q', 'b', 'b', 'e', 'h', 'l', 'g', 'q', 'c', 'o'},
            {'t', 'w', 'f', 'n', 'n', 'b', 'd', 'r', 'v', 'm', 'u', 'l', 'a', 'r', 'k', 'v', 'u', 'd'},
            {'a', 't', 'u', 'x', 'h', 'j', 'p', 'h', 't', 'j', 'a', 'l', 'k', 'h', 'w', 'q', 'm', 'e'},
            {'s', 'v', 'x', 'c', 'x', 's', 'r', 'x', 'n', 'l', 'm', 'o', 'e', 'u', 'v', 'l', 'm', 'e'},
            {'a', 'a', 'o', 'x', 'c', 'w', 's', 'f', 'u', 'f', 'y', 'j', 'f', 'z', 'w', 'r', 'j', 'w'},
            {'c', 'y', 'z', 'j', 'g', 'd', 'a', 'u', 'v', 'k', 'l', 'b', 's', 'e', 'l', 'w', 'u', 'l'},
            {'y', 't', 'j', 'g', 'p', 'd', 'b', 'y', 'b', 'q', 'r', 't', 'y', 'x', 'e', 'c', 'g', 't'},
            {'a', 'n', 'w', 'v', 'p', 'b', 'u', 'x', 'y', 'z', 'w', 'i', 'j', 'y', 'l', 'x', 'r', 'q'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka4));

    }
}
