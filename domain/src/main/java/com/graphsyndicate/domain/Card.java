package com.graphsyndicate.domain;

// Carta de un mazo: lo que suma y lo que resta (una mixta tiene ambos)
public record Card(CardType type, int gain, int loss) {

    public int netEffect() {
        return gain - loss;
    }
}
