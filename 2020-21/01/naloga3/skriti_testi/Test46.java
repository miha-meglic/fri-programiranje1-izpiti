
public class Test46 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 448);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 390);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 59);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 238);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 19);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 792);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 327);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 525);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 336);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 83);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 123);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 572);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 601);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 926);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 891);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 825);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 925);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o15, o12, o16, o11, o10});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o10, o16, o15, o11, o12});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o15, o10, o12, o16, o11});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o15, o10, o11, o12, o16});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o11});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o15, o11, o10, o12, o16});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o11, o12, o16, o15, o10});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o11, o10, o12, o16, o15});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o11});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o13});
        Tretja.Projekt p10 = new Tretja.Projekt("p10", new Tretja.Opravilo[]{o16, o12, o11, o15});
        Tretja.Projekt p11 = new Tretja.Projekt("p11", new Tretja.Opravilo[]{o10, o11, o12, o15, o16});
        Tretja.Projekt p12 = new Tretja.Projekt("p12", new Tretja.Opravilo[]{o16, o15, o11, o10, o12});
        Tretja.Projekt p13 = new Tretja.Projekt("p13", new Tretja.Opravilo[]{o10, o15, o16, o11, o12});
        Tretja.Projekt p14 = new Tretja.Projekt("p14", new Tretja.Opravilo[]{o11, o10, o16, o12, o15});
        Tretja.Projekt p15 = new Tretja.Projekt("p15", new Tretja.Opravilo[]{o12, o15, o10, o11});
        Tretja.Projekt p16 = new Tretja.Projekt("p16", new Tretja.Opravilo[]{o15, o11, o12, o16});
        Tretja.Projekt p17 = new Tretja.Projekt("p17", new Tretja.Opravilo[]{o15, o12, o10, o11, o16});
        Tretja.Projekt p18 = new Tretja.Projekt("p18", new Tretja.Opravilo[]{o16, o11, o10, o12});
        Tretja.Projekt p19 = new Tretja.Projekt("p19", new Tretja.Opravilo[]{o4, o12, o1, o16});

        System.out.println(p2.jePermutacijaOd(p17));
        System.out.println(p19.jePermutacijaOd(p13));
        System.out.println(p17.jePermutacijaOd(p1));
        System.out.println(p19.jePermutacijaOd(p11));
        System.out.println(p15.jePermutacijaOd(p8));
        System.out.println(p9.jePermutacijaOd(p8));
        System.out.println(p14.jePermutacijaOd(p18));
        System.out.println(p17.jePermutacijaOd(p1));
        System.out.println(p14.jePermutacijaOd(p0));
        System.out.println(p18.jePermutacijaOd(p13));
        System.out.println(p7.jePermutacijaOd(p0));
        System.out.println(p17.jePermutacijaOd(p18));
        System.out.println(p6.jePermutacijaOd(p2));
        System.out.println(p5.jePermutacijaOd(p8));
        System.out.println(p14.jePermutacijaOd(p13));
        System.out.println(p13.jePermutacijaOd(p17));
        System.out.println(p19.jePermutacijaOd(p17));
        System.out.println(p9.jePermutacijaOd(p4));
        System.out.println(p16.jePermutacijaOd(p3));
        System.out.println(p0.jePermutacijaOd(p13));
        System.out.println(p9.jePermutacijaOd(p10));
        System.out.println(p8.jePermutacijaOd(p11));
        System.out.println(p17.jePermutacijaOd(p7));
        System.out.println(p7.jePermutacijaOd(p8));
        System.out.println(p8.jePermutacijaOd(p9));
        System.out.println(p17.jePermutacijaOd(p18));
        System.out.println(p14.jePermutacijaOd(p0));
        System.out.println(p6.jePermutacijaOd(p11));
        System.out.println(p2.jePermutacijaOd(p14));
        System.out.println(p18.jePermutacijaOd(p6));
        System.out.println(p15.jePermutacijaOd(p4));
        System.out.println(p14.jePermutacijaOd(p7));
        System.out.println(p12.jePermutacijaOd(p0));
        System.out.println(p3.jePermutacijaOd(p17));
        System.out.println(p3.jePermutacijaOd(p0));
        System.out.println(p13.jePermutacijaOd(p1));
        System.out.println(p6.jePermutacijaOd(p3));
        System.out.println(p0.jePermutacijaOd(p7));
        System.out.println(p7.jePermutacijaOd(p15));
        System.out.println(p11.jePermutacijaOd(p12));
        System.out.println(p4.jePermutacijaOd(p1));
        System.out.println(p3.jePermutacijaOd(p5));
        System.out.println(p0.jePermutacijaOd(p4));
        System.out.println(p6.jePermutacijaOd(p7));
        System.out.println(p15.jePermutacijaOd(p9));
        System.out.println(p5.jePermutacijaOd(p16));
        System.out.println(p10.jePermutacijaOd(p7));
        System.out.println(p8.jePermutacijaOd(p19));
        System.out.println(p15.jePermutacijaOd(p9));
        System.out.println(p11.jePermutacijaOd(p19));
        System.out.println(p3.jePermutacijaOd(p9));
        System.out.println(p12.jePermutacijaOd(p8));
        System.out.println(p18.jePermutacijaOd(p9));
        System.out.println(p12.jePermutacijaOd(p16));
        System.out.println(p4.jePermutacijaOd(p10));
        System.out.println(p8.jePermutacijaOd(p11));
        System.out.println(p7.jePermutacijaOd(p8));
        System.out.println(p16.jePermutacijaOd(p19));
        System.out.println(p3.jePermutacijaOd(p10));
        System.out.println(p3.jePermutacijaOd(p6));
        System.out.println(p4.jePermutacijaOd(p18));
        System.out.println(p11.jePermutacijaOd(p0));
        System.out.println(p13.jePermutacijaOd(p18));
        System.out.println(p11.jePermutacijaOd(p5));
    }
}
