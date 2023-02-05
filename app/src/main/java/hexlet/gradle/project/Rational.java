package hexlet.gradle.project;

import static hexlet.gradle.project.Utils.gcd;

// BEGIN (write your solution here)
public final class Rational {
    private int numer;
    private int denom;
    Rational(int numer, int denom) {
        normalize(numer, denom);
    }
    public int getNumer() {
        return numer;
    }
    public int getDenom() {
        return denom;
    }

    public Rational add(Rational otherRat) {
        int nA = getNumer();
        int dA = getDenom();
        int nB = otherRat.getNumer();
        int dB = otherRat.getDenom();
        int newNumer = nA * dB + nB * dA;
        int newDenum = dA * dB;
        int gcd = gcd(newNumer, newDenum);
        int normNumer = newNumer / gcd;
        int normDenum = newDenum / gcd;
        return new Rational(normNumer, normDenum);
    }
    public Rational sub(Rational otherRat) {
        int nA = getNumer();
        int dA = getDenom();
        int nB = otherRat.getNumer();
        int dB = otherRat.getDenom();
        int newNumer = nA * dB - nB * dA;
        int newDenum = dA * dB;
        return new Rational(newNumer, newDenum);
    }
    public String toString() {
        int currNumer = getNumer();
        int currDenum = getDenom();
        int gcd = gcd(currNumer, currDenum);
        int normNumer = currNumer / gcd;
        int normDenom = currDenum / gcd;
        return String.format("%s/%s", normNumer, normDenom);
    }
    public void normalize(int numerToNorm, int denomToNorm) {
        int gcd = gcd(numerToNorm, denomToNorm);
        int normNumer = numerToNorm / gcd;
        int normDenom = denomToNorm / gcd;
        this.numer = normNumer;
        this.denom = normDenom;
    }
}
// END
