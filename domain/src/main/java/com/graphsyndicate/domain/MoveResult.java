package com.graphsyndicate.domain;

// Resultado de aplicar δ(S, v, a): peaje cobrado, bonificación R y fichas finales
public record MoveResult(Table destination, int toll, int reward, int chipsAfter, boolean correct) {
}
