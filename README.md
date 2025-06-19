# Documentación API - Gestión de Obras de Arquitectura
Trabajo Practico de Programacion 3 - UTN MdP
### **Integrantes:**
- Fresnadillo, Matías
- Fuentes, Agustina
- Raipane, Kevin
---
### **Narrativa del Proyecto**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Realizaremos una API que tenga como objetivo gestionar la información de las obras de arquitectura a nivel mundial, estas obras podrán ser visualizadas por los usuarios que se registren en la aplicación.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Las obras en la aplicación serán cargadas tanto por los administradores como por los usuarios con el rol de arquitectos. Este rol será otorgado por un administrador, y dicho arquitecto solo podrá cargar las obras de su propio estudio de arquitectura o de los estudios de arquitectura de los que forme parte. En cambio, los administradores podrán gestionar completamente todas las obras y por ende serán los encargados de gestionar los estudios de arquitectura necesarios para dar de alta las obras pertinentes, independientemente de si el arquitecto o los arquitectos están registrados en la aplicación. El usuario con su rol de Arquitecto podrá gestionar los estudios de arquitectura a los cuales pertenezca o dar de alta un estudio en el cual forme parte.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Las obras de arquitectura deberán poseer una ficha técnica completa, que contendrá una breve descripción de la obra, imágenes de la misma o de sus planos y los datos relevantes de la obra arquitectónica, como ser el tipo de obra (se adjunta desglose categórico propuesto), estado (construida, en construcción, proyecto, demolida), el año asociado a su estado (a veces suele ser desconocido), estudio de arquitectura y posición geográfica.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Estas obras deberán contar con la capacidad de obtener su georreferencia a nivel ciudad – país mediante las coordenadas geoespaciales almacenadas para que en un futuro sea viable la visualización de dicha obra en un mapa como por ejemplo OpenStreetMaps (OSM).<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Los usuarios al registrarse deberán hacerlo con un email y una contraseña. Se les pedirá que completen su perfil, por lo que tendrán que indicar un apodo, nombre, apellido, fecha de nacimiento y una breve descripción de ellos (máximo 50 caracteres). Estos usuarios, una vez que estén registrados, podrán solicitar que un administrador los convierta en arquitectos, para lo cual deberán proporcionar su nombre y apellido, la universidad donde obtuvieron el título y el año de egreso, con el fin de que el administrador lo apruebe y vincule su perfil a las obras ya cargadas o, en caso de no existir ninguna obra, se le dé de alta en la base de datos como un estudio de arquitectos.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Para cumplir con estas funcionalidades, el administrador deberá contar con la capacidad de listar las solicitudes pendientes de los usuarios para ser administradores y ver la información proporcionada por estos para decidir si se aprueba o rechaza la solicitud.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;El usuario registrado en su cuenta, tanto con el rol básico como el rol de arquitecto, podrá visualizar todas las obras e ingresar a su información detallada, además deberá poder guardar sus obras preferidas, las cuales quedarán asociadas a su cuenta para poder consultar el listado de favoritos y así visualizar más rápidamente dichas obras. Además, podrá filtrar las obras que estén en su radio cercano (en base a su IP desde donde se consulta), podrá filtrar por estudio de arquitectura, por estado y por año de su estado.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;La aplicación en su despliegue inicial contará con un usuario “maestro” el cual contendrá usuario y password por defecto la cual se le solicitará cambiarla en el primer inicio. Será este administrador el encargado de asignar usuarios como administradores en caso de necesitar más de un administrador. Este usuario debe ser imborrable y su privilegio de administrador irrevocable.<br>

---

### Roles y Permisos:

#### Usuarios
- Se registran con **email y contraseña**.
- Deben completar su perfil con:
    - Apodo
    - Nombre
    - Apellido
    - Fecha de nacimiento
    - Breve descripción (máximo 50 caracteres)
- Pueden:
    - Visualizar obras y su información detallada.
    - Guardar obras como favoritas.
    - Filtrar obras por:
        - Proximidad (basada en IP)
        - Estudio de arquitectura
        - Estado
        - Año

#### Arquitectos
- Son usuarios que solicitan este rol a un administrador.
- Deben proporcionar:
    - Nombre y apellido
    - Universidad donde obtuvieron el título
    - Año de egreso
- Pueden:
    - Cargar obras de su estudio o de estudios a los que pertenezcan.
    - Gestionar los estudios de arquitectura a los cuales pertenezcan.
    - Dar de alta un nuevo estudio al cual pertenecen.

#### Administradores
- Tienen control total sobre las obras.
- Pueden:
    - Cargar cualquier obra.
    - Gestionar todos los estudios de arquitectura.
    - Aprobar solicitudes de usuarios para convertirse en arquitectos.
    - Listar solicitudes pendientes y revisar la información enviada.
- Usuario "maestro":
    - Viene preconfigurado con un usuario y contraseña por defecto.
    - Debe cambiar la contraseña al primer inicio.
    - Es imborrable y su privilegio de administrador es irrevocable.

### Obras de Arquitectura

Cada obra deberá contener:

- Ficha técnica completa:
    - Breve descripción
    - Imágenes (obra y/o planos)
    - Datos relevantes:
        - Tipo de obra (se adjunta desglose categórico propuesto)
        - Estado:
            - Construida
            - En construcción
            - Proyecto
            - Demolida
        - Año asociado al estado (puede ser desconocido)
        - Estudio de arquitectura
        - Posición geográfica
- Georreferencia a nivel ciudad – país mediante coordenadas geoespaciales.
- Compatible con visualización futura en mapas como **OpenStreetMaps (OSM)**.
