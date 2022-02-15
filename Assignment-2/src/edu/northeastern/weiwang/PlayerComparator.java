package edu.northeastern.weiwang;

import java.util.Comparator;

class PlayerComparator implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return -1 * Integer.compare(a.score, b.score);
        }
        return a.name.compareTo(b.name);
    }
}
