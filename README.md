# Sincronización Cartera en Línea - Nuevo Monedero Electrónico
Componente que recibe los mensajes del tópico **sincronizacioncl** publicados por los servicios de uso, generación y devolución de dinero electrónico; si el mensaje contiene un status 200 de respuesta se indica en la tabla **ControlSincronizacionCarmovx** que el registro proveniente de Cartera en línea fue procesado correctamente, en caso contrario se marca que el registro no fue sincronizado debido a errores.

## Funciones del componente
1. Leer mensaje del tópico sincronizacioncl 
2. Actualizar estatus de sincronización de los registros sobre las tablas ControlSincronizacionCarmovx y MovControlSincronizacionCarMovx



## Configuración
Este componente utiliza la libreria omnicanalidad mappers, para que no haya problemas de dependencia en el POM descargar el siguiente proyecto maven  [OmnicanalidadMappers](http://10.44.26.34/230134-DesarrolloSistemasII/omnicanalentidadesdtomappers.git). y realizar la instalación en el m2 local

```bash
mvn clean install 
```


## Correr proyecto
Para correr el proyecto de manera local ejecutar el siguiente comando

```bash
mvn spring-boot:run
```

## application.properties
```properties
# Conexión a la base de datos de SQL Server (Base de datos del nuevo monedero electrónico)
# Propiedades de Kafka (Servidores y Tópicos)
```

## Prerequisitos para el correcto funcionamiento del proyecto
1. Configuración de servidores Kafka 
2. Publicador de mensajes (Uso, Generación, Devolución) del tópico **sincronizacioncl**
3. Conexión a base de datos Sqlserver del Nuevo Monedero Electrónico
