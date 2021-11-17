package lesson1;

public class Course {
    Obstacle[] obstacles;



    public Course(Obstacle obstacle1, Obstacle obstacle2, Obstacle obstacle3) {
        obstacles = new Obstacle[]{obstacle1, obstacle2, obstacle3};
    }

    public void doIt(Team team) {
        System.out.println("Приступаем к соревнованию!");
        Competitor[] competitors = team.getCompetitors();
        if (competitors.length > 0) {
            for (Competitor competitor : competitors) {
                for (Obstacle o : obstacles) {
                    o.doIt(competitor);
                    if (!competitor.isOnDistance()) break;

                }
            }
        } else {
            System.out.println("Никто не пришёл");
        }
    }

    public void getInfoCourse() {
        for (Obstacle o : obstacles) {
            o.infoObstacle();
        }
    }

    public Obstacle[] getObstacles() {
        return obstacles;
    }

    public void setObstacles(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }


    }

