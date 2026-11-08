# JFo 6.2 - Actividad 12

## Contador de intentos

Acepta la clave o detente tras tres intentos.

La contraseña correcta es `1234`. Lee contraseñas con `Scanner`: si es incorrecta muestra `Contraseña incorrecta`; si es correcta muestra `Acceso concedido` y termina. Tras tres intentos fallidos el programa debe detenerse sin pedir más (puedes mostrar `Acceso bloqueado`). No muestres mensajes para pedir los datos (el test introduce `1111`, `2222` y `1234`).

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Contraseña incorrecta
Contraseña incorrecta
Acceso concedido
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo6_2_actividad12/Actividad12.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad12Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
