# PUNTO DE VENTA JAVA


~# Sistema de Punto de Venta

```Este

~~---

~~## **Características del Proyecto**

~~~* Gestión de productos y ventas.
* Interfaz de usuario moderna utilizando HTML, CSS y JavaScript.
* Backend robusto con Spring Boot.
* Persistencia de datos mediante una base de datos MySQL.
* Arquitectura escalable y modular.

~---

~~## **Requisitos Previos**

~~~1. **Java Development Kit (JDK):** Versión 17 o superior.
1. **Maven:** Para la gestión de dependencias.
1. **MySQL:** Para la base de datos.
1. **IDE:** IntelliJ IDEA, Eclipse u otro editor de tu preferencia.
1. **Git:** Para el control de versiones.

~---

~~## **Configuración del Entorno**

~~~~### **1. Clonar el Repositorio**

~~~ ~Tu amigo (o cualquier colaborador) debe clonar este repositorio para comenzar:

~ ~
```

git clone https://github.com/JEHL22/punto-venta-java.git
cd punto-venta-java

```

~~### **2. Configurar las Ramas**

~~~ ~Este proyecto utiliza dos ramas principales:

~ * `main`: Rama principal, estable y lista para producción.
* `dev`: Rama de desarrollo donde se realizan los cambios.

~#### **Flujo de Trabajo para las Ramas**

~~~* Antes de trabajar:
  ```shell notranslate position-relative overflow-auto
  git checkout dev
  git pull origin dev
```

* Después de realizar cambios:
  ```shell
  git add .
  git commit -m "Descripción del cambio"
  git push origin dev
  ```
* Fusionar `dev` en `main` (solo para responsables):
  ```shell
  git checkout main
  git pull origin main
  git merge dev
  git push origin main
  ```

~### **3. Configurar la Base de Datos**

```1.
   ```sql notranslate position-relative overflow-auto
   CREATE DATABASE punto_venta;
   ```
1. Configurar las credenciales de la base de datos en el archivo `application.properties`:
   ```ini notranslate position-relative overflow-auto
   spring.datasource.url=jdbc:mysql://localhost:3306/punto_venta
   spring.datasource.username=TU_USUARIO
   spring.datasource.password=TU_CONTRASEÑA
   ```

~### **4. Ejecutar la Aplicación**

~~~1. Compilar y ejecutar el proyecto con Maven:
   ```shell notranslate position-relative overflow-auto
   mvn spring-boot:run
   ```
1. Accede a la aplicación en tu navegador en `http://localhost:8080`.

~---

~~## **Estructura del Proyecto**

~~~* **Backend:**
  * Controladores: Gestión de las solicitudes HTTP.
  * Servicios: Lógica de negocio.
  * Repositorios: Interacción con la base de datos.
  * Entidades: Modelos de datos.
* **Frontend:**
  * HTML y CSS: Diseño de la interfaz.
  * JavaScript: Interactividad.
* **Base de Datos:**
  * Tablas para productos, ventas y usuarios.

~---

~~## **Contribuir al Proyecto**

~~~~### **1. Crear una Nueva Rama para Cambios**

~~~ ~Si deseas trabajar en una nueva funcionalidad o corrección de errores:

~ ~
```
git checkout -b tunombre-dev
```

~~### **2. Realizar un Pull Request**

~~~1. Haz cambios en tu rama y súbelos:
   ```shell notranslate position-relative overflow-auto
   git push origin tunombre-dev
   ```
1. Crea un Pull Request en GitHub para que el equipo revise los cambios.

~---

~~## **Colaboradores**

~~~* [Julio Huaman](https://github.com/JEHL22)
* **[Colaborador 1]**
* **[Colaborador 2]**

~---

~~## **Notas Importantes**

~~~1. Siempre actualiza tu rama local antes de empezar a trabajar:
   ```shell notranslate position-relative overflow-auto
   git pull origin dev
   ```
1. Comunícate con el equipo para evitar conflictos en los archivos.
1. Antes de fusionar cambios en `main`, verifica que todo funcione correctamente.

~---

~ ~Si tienes preguntas o necesitas ayuda, no dudes en contactarme.

~ ~¡Gracias por contribuir al proyecto! 🎉

~
```


```
