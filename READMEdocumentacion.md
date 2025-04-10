# Conversiones
Proyecto para Tópicos Avanzados de Programación



https://youtu.be/8Xm3rwhLdUM link de youtube



Clase Convertir
Descripción General
La clase Convertir proporciona métodos estáticos para realizar conversiones entre diferentes unidades de medida.
Esta clase ofrece funcionalidades para convertir unidades de masa, tiempo, velocidad, fuerza, energía, potencia, presión y frecuencia, así como utilidades para validación de texto.

Información del Paquete



                                  @authoras Crespo Castañón Suyay Fernanda y Caballero Silva Dalia Montserrat
                                  

javapackage conversiones;


       Constantes

constanteKilogramos	10^3	Factor para convertir toneladas a kilogramos

constanteKilogramosLibras	0.453592	Factor para convertir libras a kilogramos

constanteOnzas	28.3495	Factor para convertir onzas a gramos

constanteSegundosM	60	Número de segundos en un minuto

constanteSegundosH	3600	Número de segundos en una hora

constanteSegundosD	86400	Número de segundos en un día

MPH	0.2778	Factor para convertir km/h a m/s

KMH	1.60934	Factor para convertir mph a km/h

gravedad	9.81	Factor de gravedad terrestre

N	4.44822	Factor para convertir libras-fuerza a newtons

Jul	4.184	Factor para convertir calorías a julios

eVJ	1.602×10^-19	Factor para convertir electrón-voltios a julios

Vatio	746	Factor para convertir hp a vatios

Pascalatm	101325	Factor para convertir atmósferas a pascales

Pascalbar	100000	Factor para convertir bars a pascales

MHzHz	1000000	Factor para convertir MHz a Hz

grados	180/π	Factor para convertir radianes a grados



Métodos
Método Principal
main(String[] args)
Método principal para la ejecución de la aplicación.
@param args - Argumentos de línea de comandos
@return void

    Conversiones de Masa

 ToneladasKilogramos(double num)
Convierte toneladas a kilogramos.
@param num - Cantidad en toneladas
@return double

 LibrasKilogramos(double num)
Convierte libras a kilogramos.
@param num - Cantidad en libras
@return double

 OnzasGramos(double num)
Convierte onzas a gramos.
@param num - Cantidad en onzas
@return double

    Conversiones de Tiempo

 MinutosSegundos(double tiempo)
Convierte minutos a segundos.
@param tiempo - Cantidad en minutos
@return double

 HorasSegundos(double tiempo)
Convierte horas a segundos.
@param tiempo - Cantidad en horas
@return double

 DiaSegundos(double tiempo)
Convierte días a segundos.
@param tiempo - Cantidad en días
@return double

     Conversiones de Velocidad 
     
 KmporhoraMporsegundo(double velocidad)
Convierte km/h a m/s.
@param velocidad - Velocidad en km/h
@return double

 MPHaKMH(double velocidad)
Convierte mph a km/h.
@param velocidad - Velocidad en mph
@return double

    Conversión de Aceleración
    
 Aceleracion(double g)
Convierte unidades de g a m/s².
@param g - Valor en unidades de gravedad terrestre
@return double

    Conversión de Fuerza
 LibrasFuerzaNewtons(double libras)
Convierte libras-fuerza a newtons.
@param libras - Fuerza en libras-fuerza
@return double

      Conversiones de Energía
 CalJul(double cal)
Convierte calorías a julios.
@param cal - Energía en calorías
@return double

 eVJul(double eV)
Convierte electrón-voltios a julios.
@param eV - Energía en electrón-voltios
@return double

          Conversión de Potencia
 hpVatio(double hp)
Convierte hp a vatios.
@param hp - Potencia en hp
@return double

        Conversiones de Presión
 atmPa(double atm)
Convierte atmósferas a pascales.
@param atm - Presión en atmósferas
@return double

 barPa(double bar)
Convierte bares a pascales.
@param bar - Presión en bares
@return double

    Conversión de Frecuencia
 MHzaHz(double MHz)
Convierte MHz a Hz.
@param MHz - Frecuencia en MHz
@return double

     Conversión de Ángulos
 RadGrados(double rad)
Convierte radianes a grados.
@param rad - Ángulo en radianes
@return double

     Validación de Texto
 soloContieneDígitos(String texto)
Verifica si un texto contiene solo dígitos.
@param texto - Cadena de texto a verificar
@return boolean

    .
    .
    .
    .
    .
    .

                    Descarga el archivo JAR
Ve al repositorio de GitHub donde se encuentra conversionn.jar.

Descarga el archivo JAR a tu computadora:

Puedes descargar todo el repositorio como un archivo ZIP, o solo el archivo JAR si está disponible en la sección de Releases.

Guarda el archivo en una ubicación fácil de recordar (por ejemplo, el Escritorio o una carpeta de proyectos).

    Importa el JAR en tu proyecto de NetBeans
Abre tu proyecto en NetBeans.

Haz clic derecho sobre el nombre de tu proyecto en el explorador de proyectos.

Selecciona "Propiedades".

En la ventana de propiedades, haz clic en "Bibliotecas".

Presiona el botón "Agregar JAR o Carpeta".

Navega hasta donde guardaste conversionn.jar.

Selecciona el archivo y haz clic en "Abrir".

Haz clic en "Aceptar" para cerrar la ventana de propiedades.


    Verifica
Para verificar que el archivo fue importado correctamente:

Expande la carpeta "Libraries" en tu proyecto.

Deberías ver conversionn.jar listado como parte de las bibliotecas del proyecto.

    Uso en el código
Ahora puedes usar las clases que están dentro del archivo conversionn.jar.

Para ello, importa las clases necesarias al inicio de tus archivos Java, por ejemplo:

Convertir.java
