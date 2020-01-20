public enum DirectionType {
    DROITE(0, 1),
    BAS(1, 0),
    GAUCHE(0, -1),
    HAUT(-1, 0);

    private static DirectionType[] directionTypes = values();
    private int x;
    private int y;

   DirectionType(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public DirectionType getNextDirection() {
       return directionTypes[(this.ordinal() + 1) % directionTypes.length];
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
