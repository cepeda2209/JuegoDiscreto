package com.graphsyndicate.lwjgl3;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.graphsyndicate.core.GraphSyndicateGame;

// Abre la ventana de escritorio
public class Lwjgl3Launcher {

    private static final int WINDOW_WIDTH = 1280;
    private static final int WINDOW_HEIGHT = 720;

    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("Graph Syndicate");
        config.setWindowedMode(WINDOW_WIDTH, WINDOW_HEIGHT);
        config.useVsync(true);
        new Lwjgl3Application(new GraphSyndicateGame(), config);
    }
}
