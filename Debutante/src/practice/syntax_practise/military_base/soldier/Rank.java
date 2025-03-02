package practice.syntax_practise.military_base.soldier;

public enum Rank {
    CAPE(0),
    SERGEANT(1),
    SUBTENIENT(2),
    TENIENT(3),
    COLONEL(4);

    private int rank;

    Rank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public Rank rankUp(int rankUps) {
        return rank += rankUps;
    }
}