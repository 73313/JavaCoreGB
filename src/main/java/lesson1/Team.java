package lesson1;

public class Team {
    String teamName;
    Competitor[] competitors;


    public Team(String teamName, Competitor competitor1, Competitor competitor2, Competitor competitor3, Competitor competitor4) {
        competitors = new Competitor[]{competitor1, competitor2, competitor3, competitor4};
        this.teamName = teamName;
    }
    public Competitor[] getCompetitors () {
        return competitors;
    }


    public void getInfoTeam() {
        System.out.println("Участники команды" + " " + teamName);
        for (Competitor c : competitors) {
            c.infoCompetitor();
        }
    }

    public void infoHwoFinishedCourse() {
        for (Competitor c : competitors) {
            if (c.isOnDistance())
                c.showResult();
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setCompetitors(Competitor[] competitors) {
        this.competitors = competitors;
    }


}
