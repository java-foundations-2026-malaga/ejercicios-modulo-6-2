# JFo 6.2 - Actividad 10

## Menú simple con do-while

Muestra el menú al menos una vez.

Usa un bucle `do-while` que muestre el menú (`1. Saludar`, `2. Despedir`, `0. Salir`) y lea una opción: con `1` muestra `Hola`, con `2` muestra `Adiós` y con `0` sale del bucle. Al terminar muestra `Programa terminado`. No muestres otros mensajes (el test introduce `1` y `0`).

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
1. Saludar
2. Despedir
0. Salir
Hola
1. Saludar
2. Despedir
0. Salir
Programa terminado
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo6_2_actividad10/Actividad10.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad10Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
