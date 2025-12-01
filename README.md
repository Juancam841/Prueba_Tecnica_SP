# 🚀 Proyecto de Automatización de Pruebas con Serenity BDD

## 📋 Descripción
Proyecto de automatización de pruebas para la plataforma Sauce Demo, desarrollado con Serenity BDD, Screenplay Pattern y Gradle. Este proyecto demuestra las capacidades de automatización de pruebas de interfaz de usuario siguiendo buenas prácticas y patrones de diseño.

## 🎯 Objetivo
Automatizar los flujos críticos de la aplicación Sauce Demo, incluyendo:
- Inicio de sesión de usuarios
- Selección de productos
- Validación de elementos en el carrito de compras

## 🛠️ Tecnologías Utilizadas

- **Lenguaje**: Java 11+
- **Framework**: Serenity BDD 3.9.8
- **Patrón de diseño**: Screenplay Pattern
- **Gestor de dependencias**: Gradle
- **Navegador objetivo**: Microsoft Edge
- **Control de versiones**: Git

## 📋 Requisitos Previos

### Software Necesario
- Java JDK 11 o superior
- Gradle 7.0 o superior
- Microsoft Edge instalado
- Git (opcional para control de versiones)
- IDE (IntelliJ IDEA recomendado)

### Variables de Entorno
- `JAVA_HOME` configurado correctamente
- `GRADLE_HOME` configurado (opcional pero recomendado)
- `PATH` que incluya las rutas a Java y Gradle

## 🚀 Configuración Inicial

1. **Clonar el repositorio**:
   ```bash
   git clone [URL_DEL_REPOSITORIO]
   cd Prueba-Tecnica-SP
   ```

2. **Instalar dependencias**:
   ```bash
   gradle clean build -x test
   ```

3. **Configurar el WebDriver**:
   - Asegúrate de tener el archivo `msedgedriver.exe` en la carpeta `drivers/`
   - El path del driver está configurado en `serenity.properties`

## 🏗️ Estructura del Proyecto

```
src/
├── main/java/
│   ├── exceptions/      # Clases personalizadas para manejo de excepciones
│   ├── interactions/    # Interacciones reutilizables
│   │   ├── EnterDataLogin.java
│   │   └── EnterItemsCart.java
│   ├── model/           # Modelos de datos
│   ├── questions/       # Clases para realizar aserciones
│   │   ├── Answer.java
│   │   └── AnswerCartValidation.java
│   ├── tasks/           # Tareas que representan acciones del usuario
│   │   ├── Login.java
│   │   ├── OpenUp.java
│   │   ├── Search.java
│   │   └── SelectItemsCart.java
│   ├── userinterface/   # Page Objects y elementos de la UI
│   │   ├── Dashboard.java
│   │   ├── LoginPage.java
│   │   ├── SauceDemoPage.java
│   │   └── SearchItemsCart.java
│   └── util/            # Utilidades varias
└── test/
    ├── java/
    │   ├── runners/     # Runners de pruebas
    │   │   ├── Hook.java
    │   │   └── RunnerTag.java
    │   └── stepdefinitions/  # Definiciones de pasos
    │       ├── CartStepDefinitions.java
    │       └── LoginStepDefinitions.java
    └── resources/
        └── features/    # Archivos .feature con los escenarios
            ├── Cart.feature
            └── Login.feature
```

## 🚦 Ejecución de Pruebas

### Ejecutar todas las pruebas
```bash
gradle clean test aggregate
```

### Ejecutar pruebas por etiquetas
```bash
gradle clean test -Dcucumber.filter.tags="@E2E" aggregate
```

### Generar reportes
Los reportes de Serity se generan automáticamente en:
```
target/site/serenity/index.html
```

## 🔧 Configuración Avanzada

### Archivo serenity.properties
El archivo `serenity.properties` contiene configuraciones importantes:
- Configuración del navegador
- Timeouts
- Rutas de drivers
- Configuración de reportes

### Personalización del WebDriver
El proyecto incluye un `CustomEdgeDriver` que se puede modificar en:
`src/test/java/drivers/CustomEdgeDriver.java`

## 📊 Reportes

Serity BDD genera reportes detallados que incluyen:
- Resumen de ejecución
- Capturas de pantalla
- Pasos ejecutados
- Tiempos de ejecución
- Logs

## 🤝 Contribución

1. Haz un fork del proyecto
2. Crea tu rama (`git checkout -b feature/nueva-funcionalidad`)
3. Haz commit de tus cambios (`git commit -am 'Añade nueva funcionalidad'`)
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request

## 📝 Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.

## ✉️ Contacto

- **Nombre**: [Tu Nombre]
- **Email**: [tu@email.com]
- **LinkedIn**: [URL de tu perfil de LinkedIn]

---

<div align="center">
  <p>Desarrollado con ❤️ por [Tu Nombre]</p>
  <p>Última actualización: Noviembre 2023</p>
</div>
```bash
gradle test --tests "runners.FullRunner"
```

### Ejecutar con tags específicos
```bash
gradle test -Dcucumber.filter.tags="@smoke"
```

### Generar reportes
Los reportes de Serenity se generan automáticamente después de la ejecución en:
```
build/reports/tests/test/index.html
```

## 📁 Estructura del Proyecto

```
src/
├── main/
│   └── java/
│       ├── models/          # Modelos de datos para las pruebas
│       ├── pageobjects/     # Page Objects para interactuar con las páginas
│       ├── steps/           # Clases de pasos reutilizables
│       └── utils/           # Utilidades y clases de ayuda
└── test/
    └── java/
        ├── drivers/         # Clase para manejo personalizado del driver y sus atributos
        ├── runners/         # Clases runner para ejecutar las pruebas
        └── stepdefinitions/ # Definiciones de pasos de Cucumber
```

### Descripción de los directorios principales:

- **models/**: Contiene las clases que representan los modelos de datos utilizados en las pruebas.
- **pageobjects/**: Implementa el patrón Page Object Model (POM) con las clases que representan las páginas de la aplicación.
- **steps/**: Contiene clases con los pasos funcionales de la aplicacion.
- **utils/**: Utilidades y clases de ayuda para el proyecto.
- **drivers/**: Contiene los controladores de navegador necesarios para la ejecución de las pruebas.
- **runners/**: Clases que permiten ejecutar los tests con diferentes configuraciones.
- **stepdefinitions/**: Implementación de los pasos definidos en los archivos de características de Cucumber.
```

## 🤝 Contribución

1. Haz un fork del proyecto
2. Dañe un SI al candidato 🤝  
2. Crea tu rama de características (`git checkout -b feature/AmazingFeature`)
3. Haz commit de tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Haz push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

Desarrollado con ❤️ por Juan Camilo Villa Castano
