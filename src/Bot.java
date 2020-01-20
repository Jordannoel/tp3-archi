public class Bot implements IMotion {
    private int x;
    private int y;
    private DirectionType direction;
    private Room room;

    public Bot(Room room) {
        this.room = room;
        this.x = 1;
        this.y = 1;
        this.direction = DirectionType.DROITE;
    }

    public void move() throws Exception {
        if (room.getStateAt(this.x + direction.getX(), this.y + direction.getY()) == 1 ||
                room.getStateAt(this.x + direction.getX(), this.y + direction.getY()) == -1) {
            rotate();
        }
        this.x += direction.getX();
        this.y += direction.getY();
        room.setStateAt(this.x, this.y, 1);
    }

    @Override
    public void rotate() throws Exception {
        int nbRotate = 0;
        while ((room.getStateAt(this.x + direction.getX(), this.y + direction.getY()) == 1 ||
                room.getStateAt(this.x + direction.getX(), this.y + direction.getY()) == -1) && nbRotate < 4) {
            this.direction = direction.getNextDirection();
            nbRotate++;
        }
        if (nbRotate >= 4) {
            throw new Exception("On a pas encore géré cela");
        }
    }

    @Override
    public void scan(Room room) {
        for (int i = 0; i < room.getSIZE_X(); i++) {
            for (int j = 0; j < room.getSIZE_Y(); j++) {
                System.out.print("|" + getFormattedState(room.getStateAt(i, j)));
            }
            System.out.println("|");
        }
    }

    private String getFormattedState(int state) {
        String value = String.valueOf(state);
        if (state == 0 || state == 1) {
            value = " " + value;
        }
        return value;
    }
}
