# Conversor de Monedas

Un aplicativo Java que permite convertir entre diferentes divisas utilizando tasas de cambio en tiempo real.

## 📋 Descripción

Este proyecto es un conversor de monedas desarrollado en Java que utiliza una API externa para obtener tasas de cambio actualizadas. Permite a los usuarios convertir cantidades entre diferentes divisas de manera rápida y precisa.

## ✨ Características

- Conversión entre múltiples monedas internacionales
- Tasas de cambio actualizadas en tiempo real
- Interfaz gráfica intuitiva
- Manejo de errores para API y entrada de datos

## 🔧 Requisitos previos

- Java JDK 8 o superior
- Conexión a Internet para obtener las tasas de cambio actualizadas
- Biblioteca Gson 2.10.1 (para el procesamiento de JSON)

## 📥 Instalación

1. Clone este repositorio:
   ```bash
   git clone https://github.com/kleber89/conversordemonedas.git
   ```

2. Navegue al directorio del proyecto:
   ```bash
   cd conversordemonedas
   ```

3. Asegúrese de tener todas las dependencias necesarias en su classpath (especialmente Gson 2.10.1).

4. Compile el proyecto:
   ```bash
   javac -cp ".:./lib/*" lad/com/alura/conversormoneda/*.java
   ```

## 🚀 Uso

1. Ejecute la aplicación:
   ```bash
   java -cp ".:./lib/*" lad.com.alura.conversormoneda.Main
   ```

2. En la interfaz gráfica:
   - Seleccione la moneda de origen
   - Seleccione la moneda de destino
   - Introduzca la cantidad a convertir
   - Pulse el botón "Convertir"

3. El resultado de la conversión se mostrará en la pantalla.


## 🌐 API Utilizada

Este proyecto utiliza la API de ExchangeRate-API para obtener las tasas de cambio en tiempo real. Para más información, visite [su sitio web oficial](https://www.exchangerate-api.com/).

## 🛠️ Tecnologías utilizadas

- Java
- Swing (para la interfaz gráfica)
- Gson (para el procesamiento de JSON)
- HttpClient (para las peticiones a la API)

## ⚠️ Limitaciones

- Las conversiones dependen de la disponibilidad de la API externa.
- Las tasas de cambio pueden tener un ligero retraso respecto al mercado real.

## 👨‍💻 Contribuir

Si deseas contribuir a este proyecto:

1. Haz un fork del repositorio
2. Crea una rama para tu funcionalidad (`git checkout -b feature/nueva-funcionalidad`)
3. Haz commit de tus cambios (`git commit -m 'Añadir nueva funcionalidad'`)
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request

