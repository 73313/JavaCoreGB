package lesson1;

public class Competitor {
    private String name;
    private int age;
    private boolean onDist;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;


    public Competitor(String name, int age, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.age = age;
        this.onDist = true;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;

    }
    /*  public Competitor(String name, int age) {
          this.name = name;
          this.age= age;
          this.onDist= true;
   }*/
    public void infoCompetitor() {
        System.out.println("Спортсмен" + " " + name + "- " + "возраст" + " " + age + " " + "приветствует вас");
    }

    public void showResult() {
        System.out.println(name + " : " + (isOnDistance() ? "на дистанции" : "сошел с дистанции"));

    }
    public boolean isOnDistance() {
        return onDist;
    }
    public void run(Competitor competitor, int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " " + " успешно справился с забегом. МОЛОДЕЦ!");
        } else {
            System.out.println(name + " " + " не смог преодолеть забег. УВЫ!");
            onDist = false;
        }
    }
    public void jump(Competitor competitor, int distance) {
        if (distance <= maxJumpHeight) {
            System.out.println(name + " " + " успешно справился с прыжком. МОЛОДЕЦ!");
        } else {
            System.out.println(name + " " + " не смог выполнить прыжок. УВЫ!");
            onDist = false;
        }
    }

    public void swim(Competitor competitor, int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " " + " успешно проплыл дистанцию. МОЛОДЕЦ!");
        } else {
            System.out.println(name + " " + " не смог проплыть дистанцию. УВЫ!");
            onDist = false;
        }
    }


   /* public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(int maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public void setMaxSwimDistance(int maxSwimDistance) {
        this.maxSwimDistance = maxSwimDistance;
    }

    public void setOnDistance(boolean onDist) {
        this.onDist = onDist;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOnDist() {
        return onDist;
    }

    public void setOnDist(boolean onDist) {
        this.onDist = onDist;
    }

    public boolean run() {
        return false;
    }*/

}
