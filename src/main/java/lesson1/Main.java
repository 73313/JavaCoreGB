package lesson1;

public class Main {
    public static void main(String[] args) {

        int distance =600;
        Competitor[] competitors = {
                new Competitor("Семён", 25, 650, 700, 50),
                new Competitor("Пётр", 21, 800, 250, 714),
                new Competitor("Олег", 60, 300, 720, 660),
                new Competitor("Илья", 30, 720, 630, 600)
        };


        Course c = new Course(
                new Obstacle("бег", 600),
                new Obstacle("прыжки", 600),
                new Obstacle("плавание", 600)
        );


        Team team = new Team("Winners",
                new Competitor("Семён", 25, 700, 500, 700),
                new Competitor("Пётр", 21, 800, 800, 780),
                new Competitor("Олег", 60, 520, 750, 660),
                new Competitor("Илья", 30, 160, 200, 550)
        );


        c.getInfoCourse();
        System.out.println();

        team.getInfoTeam();

        System.out.println();
        c.doIt(team);// Просим команду пройти полосу
        System.out.println();
        team.infoHwoFinishedCourse();
        System.out.println();

        for (Competitor competitor:competitors){
            competitor.run(competitor,distance );
            competitor.swim(competitor,distance);
            competitor.jump(competitor,distance);
            System.out.println();}



        System.out.println();
        System.out.println("Всем хорошего дня!");


    }
}
