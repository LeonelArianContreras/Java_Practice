package practice.syntax_practise.military_base.soldier;

public enum Rank {
    CAPE(0),
    SERGEANT(1),
    SUBTENIENT(2),
    TENIENT(3),
    COLONEL(4);

    private final int rank;

    Rank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public Rank rankUp(int achievedRanks) {
        int newRank = Math.min(rank + achievedRanks, Rank.values().length - 1); // So as not to exceed the maximum rank
        return Rank.values()[newRank];
    }
}