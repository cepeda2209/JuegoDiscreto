package com.graphsyndicate.core;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.ScreenUtils;

// Punto de entrada del juego: por ahora solo limpia la pantalla con el color del casino
public class GraphSyndicateGame extends ApplicationAdapter {

    private static final Color FELT_GREEN = new Color(0.05f, 0.25f, 0.15f, 1f);

    @Override
    public void render() {
        ScreenUtils.clear(FELT_GREEN);
    }
}
