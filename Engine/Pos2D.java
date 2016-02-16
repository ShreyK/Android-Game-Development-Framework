public class Pos2D {
    public float x;
    public float y;

    public Pos2D() {
        x = 0;
        y = 0;
    }

    public Pos2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Pos2D(Pos2D pos) {
        this.x = pos.x;
        this.y = pos.y;
    }

    public void set(Pos2D pos) {
        this.x = pos.x;
        this.y = pos.y;
    }

    public void set(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update(float x, float y, float scale) {
        this.x += x * scale;
        this.y += y * scale;
    }

    public int getRoundX() {
        return Math.round(x);
    }

    public int getRoundY() {
        return Math.round(y);
    }

    public boolean isInScreen(Position pos) {
        return isWithin(pos.x, 0, Game.WIDTH) && isWithin(pos.y, 0, Game.HEIGHT);
    }

    public boolean isWithin(float pos, int start, int end) {
        return (pos >= start && pos <= end);
    }

    /**
     * Overriding equals method so as to make sure both x and y co ordinates are equal.
     * Currently only checks with other position objects
     *
     * @param o
     * @return boolean equals value
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Pos2D) {
            Pos2D p = (Pos2D) o;
            if (p.getX() == getX() && p.getY() == getY()) {
                return true;
            }
        }
        return false;
    }

    public void print(String name) {
        System.out.println(name + ": " + x + ", " + y);
    }
}
