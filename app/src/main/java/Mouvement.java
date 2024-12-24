import java.util.List;

public abstract class Mouvement {
    private List<Touche> sequenceTouche;
    private int occurrence;
    private double score;

    public Mouvement(List<Touche> t, int o) {
        this.sequenceTouche = t;
        this.occurrence = o;
    }

    public abstract void calculScore();

    public int getOccurrences() {
        return this.occurrence;
    }

    public List<Touche> getSqTouches() {
        return this.sequenceTouche;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double s){
        this.score = s;
    }

    @Override
    public String toString() {
        return "Mouvement{" +
                "sequenceTouche=" + sequenceTouche +
                ", occurrence=" + occurrence +
                ", score=" + score +
                '}';
    }
}