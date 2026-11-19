package com.graphsyndicate.domain;

import java.util.List;

// Mazo boca abajo de Bonus o Redención
public interface Deck {
    List<Card> cards();                  // composición que se muestra antes de elegir
    double probabilityOf(CardType type); // casos favorables entre casos totales
}
