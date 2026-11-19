package com.graphsyndicate.domain;

import java.util.List;

// Lo único que ve la capa de presentación
public interface GameSession {
    Table currentTable();
    int chips();                            // fichas actuales
    boolean isGameOver();                   // fichas en 0
    boolean isFinished();                   // llegó a Bonus o Redención
    List<Table> validMoves();               // pasillos posibles con las fichas actuales
    Challenge challengeFor(Table t);        // reto de la mesa destino
    MoveResult move(Table t, long answer);  // aplica la función de transición
    Deck deckFor(Table t);                  // mazo de Bonus o Redención
    CardResult pickCard(int index);         // carta elegida
}
