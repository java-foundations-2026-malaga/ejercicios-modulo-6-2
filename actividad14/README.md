# JFo 6.2 - Actividad 14

## Comparación entre while y do-while

Implementa ambas validaciones con el mismo resultado.

Primero, con un bucle `while`, lee números hasta obtener uno no negativo y muestra `While válido: ` y el número. Después repite la misma validación con un bucle `do-while` y muestra `Do-while válido: ` y el número. No muestres mensajes para pedir los datos (el test introduce `-2`, `4`, `-3` y `5`).

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
While válido: 4
Do-while válido: 5
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo6_2_actividad14/Actividad14.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad14Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
