package fr.formation.repository;

import java.util.ArrayList;
import fr.formation.models.PieceAConviction;

public interface PiecesAConvictionsRepository {

	PieceAConviction get(int id);
	ArrayList<PieceAConviction> getAll();
	void add(PieceAConviction pieceAConviction);
	void update(PieceAConviction pieceAConviction);
	void remove(PieceAConviction pieceAConviction);
	
}
