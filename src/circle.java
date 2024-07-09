public class circle {

    String name;
    int radiud;
    static final double P_I = 3.14;



    public double areaOfACircle() {
        double areaOfACircle = (radiud * radiud) * P_I;
        System.out.println("Моя площадь равняется " + areaOfACircle + " Сантиметров квадратных");
        return areaOfACircle;

    }

    public int diameter() {
        int diameter = radiud + radiud;
        System.out.println("Мой диаметр складывается из суммы радиусов и равняется " + diameter + " Сантиметров" );
        return diameter;
    }

    public double circleLength() {
        double circleLength = (radiud + radiud) * P_I;
        System.out.println("Моя длинна круга равняется " + circleLength + " Сантиметров");
        System.out.println("Число PI постоянная и равна 3,14 в периоде");
        return circleLength;
    }


}