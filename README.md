# java-practice
# Ejemplos construidos desde libro OCA Oracle certified Associate Java SE 8 IZO-808

## Notas importantes

	boolean 	true or false 			true

	byte 		8-bit integral 			value 123
	short 		16-bit integral 		value 123
	int 		32-bit integral 		value 123
	long 		64-bit integral 		value 123

	float 		32-bit floating-point 	value 123.45f
	double 		64-bit floating-point 	value 123.456
	char 		16-bit Unicode value 	'a'


## ubuntu token: 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


## (tipos primitivos)un tipo de dato primitivo mantienen sus valores en memoria don de la variable es asignada
## (Referencias a objetos) una referencia apunta a un objeto almacenado en una direccion de memoria donde el objeto es ubicado.
## 	Java no permite que que tu leas la dirección física de memoria. Tu solo puedes utilizar la referencia a tal objeto.


## prepararse para ser probado en las siguientes reglas:

Prepare to be tested on these rules. The following examples are legal:
okidentifier
$OK2Identifier
_alsoOK1d3ntifi3r
__SStillOkbutKnotsonice$

These examples are not legal:
3DPointClass // identifiers cannot begin with a number
hollywood@vine // @ is not a letter, digit, $ or _
*$coffee // * is not a letter, digit, $ or _
public
// public is a reserved word


# Java basic
JDK cuenta  con una JRE.
Virtual Machine EL intreprete que toma el codigo .class y lo traduce al lenguaje de la maquina.
JRE Enviroment ? Maquina virtual mas clases precompiladas. Se puede descargar para que cada sistema opertivo ejecute aplicaciones. 

# Se corre una clase java, no se ejecuta. 
Se invoca a la JVM se pasa como argumento el nombre de la clase mas un argumento "java".
ej: c:> java nombreClase

# main permitidos
public static void main(String[]args){}

public static void main(String ... args){}

public static void main(String[]args)throws Exception{
    //puede lanzar cualquier exception.
    throw new Exception();
}

# sobrecarga
@overloading - metodo dentro de un contexto de clase, don mismo nombre y distintos parametros.
@override    - se da en un contexto de herencia. Se sobreescribe el metodo de la clase padre. 

![Alt text](image.png)