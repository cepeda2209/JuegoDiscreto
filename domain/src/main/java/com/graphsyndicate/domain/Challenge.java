package com.graphsyndicate.domain;

import java.util.List;

// Reto de conteo de un minijuego
public interface Challenge {
    String statement();          // enunciado que se muestra al jugador
    long correctAnswer();        // respuesta calculada por el dominio
    List<Long> distractors();    // opciones incorrectas plausibles
}
