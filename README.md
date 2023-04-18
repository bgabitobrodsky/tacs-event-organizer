# tacs-1c-2023
### Trabajo Practico de Técnicas Avanzadas de Construcción de Software. ###

## Build ##
Abren un cmd o powershell en el directorio `tacs-1c-2023` y ejecutan este comando:

```
docker compose up
```
## RUTAS y Metodos ##

/login

POST, crea una session para el usuario

OPTION, porque CORS manda un option para ver si puede mandar POST


/users 

GET trae los recursos de esa URI

OPTION te dice que metodos podes usar con esa URI

POST crea un nuevo recurso para esa URI

DELETE borra los recursos de esa URI
  
/users/:id 

GET trae un recurso con esa id

OPTION te dice que metodos podes usar con esa URI

PUT modifica un recurso con ese id

DELETE elimina el recurso

/events

GET trae los eventos

OPTION te dice que metodos podes usar con esa URI

POST crea un nuevo recurso para esa URI

DELETE borra los recursos de esa URI

/events/:id

GET trae un recurso con esa id

OPTION te dice que metodos podes usar con esa URI

PUT modifica un recurso con ese id

DELETE elimina el recurso

/event/:idEvent/options

GET trae las Opciones del Evento que tiene idEvento

OPTION te dice que metodos podes usar con esa URI

POST crea una nueva Opcion para el Evento

DELETE borra las Opciones


/events/:idEvent/options/:id

GET trae una opcion de evento especifico de ese evento

OPTION te dice que metodos podes usar con esa URI

PUT modifica una opcion de evento especifico de ese evento

DELETE elimina una opcion de evento especifico de ese evento

/events/:idEvent/options/:idOption/votes

Acepta los metodos OPTIONS, GET, POST, DELETE

/events/:idEvent/options/:idOption/votes/:id

Acepta los metodos OPTIONS, GET, DELETE

/monitoring
Acepta el metodo GET - Funcionalidad: Devuelve un contador con la cantidad de eventos creados y horarios votados anotados en las últimas 2 horas.

## Links ##
* [Discord](https://discord.gg/ChK8N2h5 "Discord")
* [Trello](https://trello.com/w/tacs1c2023)

## Grupo ##
Apellido, Nombre | Legajo | Email | Cuenta GitHub
------------- | ------------- | ------------- | -------------
Margiottiello, Tomas  |  167240-0 | tmargiottiello@frba.utn.edu.ar |
Ciruzzi, Genaro | 168276-3 | gciruzzi@frba.utn.edu.ar | [JuliaMartiUTN](https://github.com/JuliaMartiUTN)
Martí, Julia | 171834-4 | jmarti@frba.utn.edu.ar | [Gen13673](https://github.com/Gen13673)
Dominguez, Facundo Nicolas | 156045-1 | facudominguez@frba.utn.edu.ar | [fndominguez](https://github.com/fndominguez)
Gabito, Bernardo | 171653-0 | bgabitobrodsky@frba.utn.edu.ar | [bgabitobrodsky](https://github.com/bgabitobrodsky)
Monti, Fernando | 143137-7 | fmonti@frba.utn.edu.ar | [agustinmonti](https://github.com/agustinmonti)
