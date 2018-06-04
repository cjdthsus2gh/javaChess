package managePackage;

import java.awt.*;

public class ChessBoard {


    private int i, j;
    ChessPanel boardPanel = new ChessPanel();
    ChessPanel[][] boardPiece = new ChessPanel[8][8];

    public ChessPanel makeBoard() {

            boardPanel.setSize(575, 575);
            boardPanel.setLayout(new GridLayout(8, 8));

            for(i = 0; i < 8; ++i) {
                for(j = 0; j < 8; ++j) {
                    boardPiece[i][j] = new ChessPanel();
                    boardPiece[i][j].setSize(575 / 8, 575 / 8);
                    boardPiece[i][j].setOpaque(true);
                    if((j + i) % 2 == 0)
                        boardPiece[i][j].setBackground(new Color(219, 219, 219));
                    else
                        boardPiece[i][j].setBackground(new Color(156, 156, 156));

                    boardPanel.add(boardPiece[i][j]);

                    boardPiece[i][j].setIndex(i, j);

                }
            }
        return boardPanel;
    }
}


