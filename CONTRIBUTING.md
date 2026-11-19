# Cómo trabajamos con Git

Seguimos **GitHub Flow**: `main` siempre compila y pasa las pruebas, cada tarea vive en su propia rama y entra a `main` por un pull request revisado por otro integrante.

## 1. Ciclo de cada tarea

```bash
git switch main && git pull              # partir siempre de main actualizado
git switch feature/poker-challenge       # o crear una nueva: git switch -c feature/<tarea>
git merge main                           # traer lo último de main a tu rama
# ... programar, hacer commits pequeños ...
./gradlew test                           # antes de subir, las pruebas en verde
git push
```

Luego, en GitHub:

1. Abrir un pull request de la rama hacia `main`.
2. **Otro** integrante lo revisa y lo aprueba.
3. Unirlo con **Squash and merge**, para que la tarea quede como un solo commit en `main`.
4. Borrar la rama y crear otra para la siguiente tarea.

Nombres de rama: `feature/<tarea>` para código y `docs/<tema>` para documentos, en inglés y con guiones (por ejemplo `feature/vault-challenge`).

## 2. Mensajes de commit

Formato *Conventional Commits*: tipo en inglés, descripción en español, en presente y corta.

```
<tipo>: <qué hace el cambio>
```

| Tipo | Cuándo | Ejemplo |
|---|---|---|
| `feat` | Funcionalidad nueva | `feat: calcular C(n, k) en PokerChallenge` |
| `test` | Agregar o corregir pruebas | `test: comparar P(n, k) contra enumeración` |
| `fix` | Corregir un error | `fix: el saldo no baja de 0 al fallar un reto` |
| `refactor` | Reorganizar sin cambiar el comportamiento | `refactor: separar Valida de GameSession` |
| `docs` | Documento, demostraciones, README | `docs: borrador del Teorema 1` |
| `chore` | Gradle, configuración, assets | `chore: agregar dependencia de JUnit 5` |

## 3. Reglas del equipo

- **Commits pequeños.** Un commit es un cambio que se explica en una línea; si el mensaje necesita un "y", probablemente son dos.
- **Pull requests cortos.** Se abren y se unen en uno o dos días; las ramas que viven semanas terminan en conflictos.
- **Nunca push directo a `main`.** Nadie une su propio código.
- **Quien revisa debe poder explicar lo que aprueba.** Eso también prepara la sustentación.
- **Todo lo generado por IA se lee, se entiende y se prueba antes de unirlo.**
- **Orden de unión.** Primero el contrato y el dominio (`feature/session-core`), porque las demás ramas dependen de él; mientras tanto el front trabaja contra el stub.

## 4. Conflictos

Si `git merge main` marca conflictos:

1. Abrir los archivos en conflicto en IntelliJ (Git → Resolve Conflicts) y elegir qué conservar.
2. `git add .` y `git commit`.
3. `./gradlew test` antes de hacer `git push`.

## 5. Definición de terminado

Una tarea está terminada cuando compila, tiene su prueba en verde, fue revisada por otro integrante, está unida a `main` y quien la hizo puede explicarla sin ayuda.

## 6. Configuración de GitHub (una sola vez)

En Settings → Branches, agregar una regla para `main`:

- *Require a pull request before merging*, con 1 aprobación.
- *Require status checks to pass*, cuando exista el workflow de pruebas.
