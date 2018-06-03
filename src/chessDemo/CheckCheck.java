package chessDemo;

public class CheckCheck {
    private static CheckCheck instance = new CheckCheck();

    private CheckCheck() {
        System.out.println("You've Loaded CheckChecker");
    }

    public static CheckCheck getInstance() {
        return instance;
    }

    public void checkCheck(ChessPanel boardPiece[][]) {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(boardPiece[i][j].piece != null) {
                    Coordinate c = new Coordinate(i, j);

                    if(boardPiece[i][j].piece.checkPath(boardPiece, c) == true) {
                        System.out.println("Check!! made by [" + c.x + "][" + c.y + "]");
                    }
                }
            }
        }

    }




}