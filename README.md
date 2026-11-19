# Graph Syndicate

Juego 2D de estrategia ambientado en un casino clandestino. El casino es un grafo dirigido ponderado de 7 mesas: moverse cuesta fichas, cada minijuego es un reto de conteo y si las fichas llegan a 0 es game over.

Proyecto final de Matemáticas Discretas I (2025963).

## Módulos

| Módulo | Contenido | Depende de |
|---|---|---|
| `domain` | Grafo, matriz A, Valida, δ, n^k, P(n, k), C(n, k), A^k, Dijkstra, retos, mazos y GameSession | Solo Java estándar |
| `core` | Pantallas, Scene2D, animaciones y efectos | `domain` y LibGDX |
| `lwjgl3` | Ventana de escritorio y jar ejecutable | `core` |

Regla central: **el dominio nunca importa LibGDX.**

## Comandos

```bash
./gradlew test            # pruebas JUnit del dominio
./gradlew lwjgl3:run      # abrir el juego
./gradlew lwjgl3:dist     # jar ejecutable en lwjgl3/build/libs
```

Requiere Java 21 o superior.

## Ramas

`main` siempre compila y pasa las pruebas. Nadie une su propio código: cada tarea va en su rama y entra por pull request revisado por otro integrante.

| Integrante | Ramas |
|---|---|
| 1 · Arquitecto del dominio | `feature/session-core`, `feature/poker-challenge` |
| 2 · Generador y QA | `feature/map-dijkstra`, `feature/vault-challenge`, `feature/qa` |
| 3 · Líder de front | `feature/front-map`, `feature/front-challenges`, `feature/roulette-challenge` |
| 4 · Documentación y entregas | `feature/oracle-challenge`, `docs/model-and-proofs` |

## Convenciones

- Código y nombres en inglés; comentarios en español.
- Funciones cortas con un solo propósito y sin números mágicos.
- Todo lo generado por IA se lee, se entiende y se prueba antes de unirlo.

**Terminado** = compila, tiene su prueba en verde, fue revisado por otro integrante, está en `main` y quien lo hizo puede explicarlo sin ayuda.
