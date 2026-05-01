# Ruta CERO (MVP inicial)

Aplicacion Android para explorar una primera version de **Ruta CERO** enfocada en transporte publico de Guadalajara.

## Modulos implementados en esta iteracion

- `Inicio`: hub principal de navegacion.
- `Vista1`: **Unidades en vivo (demo)** con feed simulado de ocupacion/ETA.
- `Vista2`: **Modo Certero** para estimar ETA por distancia, velocidad y trafico.
- `Vista3`: **Alerta CERO** con hasta 3 contactos y modos normal/silencioso.
- `EtaCalculator`: logica base reutilizable para ETA.

## Estructura relevante

- `app/src/main/java/com/example/myapplication/Inicio.java`
- `app/src/main/java/com/example/myapplication/Vista1.java`
- `app/src/main/java/com/example/myapplication/Vista2.java`
- `app/src/main/java/com/example/myapplication/Vista3.java`
- `app/src/main/java/com/example/myapplication/EtaCalculator.java`
- `app/src/main/res/layout/`
- `app/src/main/res/values/strings.xml`

## Probar rapido (Windows PowerShell)

```powershell
Set-Location "A:\InteraccionHumano_Computadora\Proyecto_Interaccion"
.\gradlew.bat :app:testDebugUnitTest
.\gradlew.bat :app:assembleDebug
```

## Siguiente paso recomendado

Integrar Firebase Realtime Database para reemplazar el feed simulado de `Vista1` por unidades reales y check-ins comunitarios.

