# JFo 6.2 - Actividad 15

## Elige el bucle adecuado para cada caso

Combina for, while y do-while.

1. Con un bucle `for`, muestra `For: ` y los números del 1 al 5 separados por espacios.
2. Con un bucle `while`, lee números hasta `-1` (sin sumarlo) y muestra `Suma while: ` y la suma.
3. Con un bucle `do-while`, muestra `Menú mostrado` y lee una opción; repite mientras la opción no sea `0`.

No muestres mensajes para pedir los datos (el test introduce `3`, `4`, `-1` y `0`).

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
For: 1 2 3 4 5
Suma while: 7
Menú mostrado
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo6_2_actividad15/Actividad15.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad15Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
