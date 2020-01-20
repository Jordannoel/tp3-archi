public class Room {
    private int SIZE_X = 66;
    private int SIZE_Y = 66;
    private Square[][] squares = new Square[SIZE_X][SIZE_Y];
    private final int OBSTACLE_1_X = 12;
    private final int OBSTACLE_1_Y = 12;
    private final int OBSTACLE_2_X = 25;
    private final int OBSTACLE_2_Y = 30;
    private final int OBSTACLE_3_X = 64;
    private final int OBSTACLE_3_Y = 64;

    public Room() {
        for (int i = 0; i < SIZE_X; i++) {
            for (int j = 0; j < SIZE_Y; j++) {
                squares[i][j] = new Square(0);
            }
        }
        for (int i = 0; i < SIZE_X; i++) {
            for (int j = 0; j < SIZE_Y; j++) {
                if (i == 0 || j == 0 || i == 65 || j == 65) {
                    setStateAt(i, j, -1);
                }
            }
        }
        setStateAt(1, 1, 1);

        // obstacles
        setStateAt(OBSTACLE_1_X, OBSTACLE_1_Y, -1);
        setStateAt(OBSTACLE_2_X, OBSTACLE_2_Y, -1);
        setStateAt(OBSTACLE_3_X, OBSTACLE_3_Y, -1);
    }

    public int getStateAt(int x, int y) {
        return squares[x][y].getState();
    }

    public void setStateAt(int x, int y, int state) {
        squares[x][y].setState(state);
    }

    public int getSIZE_X() {
        return SIZE_X;
    }

    public int getSIZE_Y() {
        return SIZE_Y;
    }
}
