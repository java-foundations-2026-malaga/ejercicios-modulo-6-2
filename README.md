# JFo 6.2 - Bucles while y do-while

Esta carpeta contiene 15 actividades autocorregibles.

## Actividades

01. Corrige un while sin actualización
02. Corrige un while que nunca se ejecuta
03. Corrige una cuenta atrás infinita
04. Corrige un do-while sin punto y coma final
05. Corrige la lectura con valor centinela
06. Cuenta atrás con while
07. Cuenta de 1 a 10 con while
08. Suma números hasta -1
09. Valida un número no negativo
10. Menú simple con do-while
11. Suma de 10 números con do-while
12. Contador de intentos
13. Promedio con número desconocido de notas
14. Comparación entre while y do-while
15. Elige el bucle adecuado para cada caso

Cada subcarpeta `actividadNN` es un proyecto Maven independiente con tests JUnit 5 y workflow de GitHub Actions.

## Cómo entregar las actividades

La rama `main` está protegida: contiene los enunciados originales y no se puede modificar.
Cada alumno trabaja en **su propia rama**, con su nombre.

1. Clona el repositorio:
   `git clone https://github.com/java-foundations-2026-malaga/REPOSITORIO.git`
2. Crea tu rama con tu nombre y apellido, en minúsculas y sin tildes ni espacios (por ejemplo `juan-perez`):
   `git checkout -b juan-perez`
   (En Eclipse: botón derecho sobre el proyecto > `Team > Switch To > New Branch...`).
3. Importa en Eclipse la carpeta `actividadNN` que vayas a hacer (`File > Import... > Maven > Existing Maven Projects`), resuélvela y comprueba los tests con `Run As > JUnit Test`.
4. Haz commit y sube **tu rama**:
   `git add .` → `git commit -m "Actividad NN"` → `git push -u origin juan-perez`
   (En Eclipse: `Git Staging` > `Commit and Push...`).
5. En la pestaña **Actions** del repositorio verás el resultado de la autocorrección de cada actividad que hayas modificado: ✅ aprobada o ❌ con los errores.

Si al hacer push te aparece un error sobre `main`, es que estás en la rama equivocada: cambia a tu rama con `git checkout juan-perez`.
