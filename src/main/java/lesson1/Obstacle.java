package lesson1;

public class Obstacle {
    private String obstacleName;
     int distance;



    public Obstacle(String obstacleName, int distance) {
        this.obstacleName = obstacleName;
        this.distance = distance;


    }

    public void infoObstacle(){
        System.out.println("Дистанции сегодня"+ " :"+ " "+ obstacleName + " "+"на " + distance+"м" );
    }

    public void   doIt(Competitor competitor) {
    }
    public String getObstacleName() {
        return obstacleName;
    }

    public void setObstacleName(String obstacleName) {
        this.obstacleName = obstacleName;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
