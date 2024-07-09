public class Main{
    public static void main(String[] args) {
        circle circle = new circle();

        circle.name = "Gootcircl";
        System.out.println("Я очень хорошие круг меня зовут " + circle.name);
        circle.radiud = 15;

        circle.areaOfACircle();
        circle.circleLength();
        circle.diameter();
    }}
