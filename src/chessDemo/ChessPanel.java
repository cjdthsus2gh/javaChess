package chessDemo;

import java.awt.image.BufferedImage;

public class ChessPanel extends ImagePanel {
	Piece piece;
	private Coordinate c = new Coordinate();
	BufferedImage image;
	
	public void setPiece(Piece piece, int team)
	{
        this.piece = piece;
		if(this.piece != null) {
		    piece.team = team;
            image = piece.imageSetting(team);

            setImage(image);
        }
		else
            setImage(null);

	}
	
	public Piece getPiece()
	{
		return piece;
	}

	public void setIndex(Coordinate c)
	{
		this.c = c;
	}

	public void setIndex(int i, int j) {
		this.c.x = i;
		this.c.y = j;
	}
	
	public Coordinate getIndex()
	{
		return c;
	}
	
	
	
}