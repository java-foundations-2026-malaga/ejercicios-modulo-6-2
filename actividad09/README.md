# JFo 6.2 - Actividad 09

## Valida un número no negativo

Repite la lectura y muestra la raíz cuadrada.

Lee un número con `Scanner`. Mientras sea negativo, muestra `Número no válido` y vuelve a leer. Cuando sea válido, muestra `Raíz: ` seguido de `Math.sqrt(numero)`. No muestres mensajes para pedir los datos (el test introduce `-4` y `25`).

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Número no válido
Raíz: 5.0
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo6_2_actividad09/Actividad09.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad09Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
