
public class LibEtapa1 {

	public static final double unMedio = 1./2;
	public static final double c = 3e5;
	public static final int diasSemana = 7;
	public static final int segundosHora = 3600;
	public static final double avogadro = 6.022E23;
	public static final double masaTierra = 5.97e24;
	public static final double g = 9.780327;
	public static final String miNombre = "JMB";
	
	public static final int rojo = 1;
	public static final int naranja =2;
	public static final int amarillo =3;
	public static final int verde = 4;
	public static final int cian = 5;
	public static final int azul = 6;
	public static final int violeta =7;
	public static final int blanco = 8;
	public static final int negro = 9;
	
	public static final int enero= 1;
	public static final int febrero =2;
	public static final int marzo =3;
	public static final int abril =4;
	public static final int mayo =5;
	public static final int junio = 6;
	public static final int julio= 7;
	
	// METODOS EN JAVA
	//
	// PREVIO
	//	1. NORMAS DE ESTILO EN LOS IDENTIFICADORES 
	//	2. LOS TIPOS BÁSICOS
	//
	// Preguntas que me tengo que hacer cuando quiero resolver un problema:
	//	1. Cómo llamo al problema que es como voy a llamar a la función
	//		Por ejemplo: longitudCircunferencia
	//  2. Qué valor devuelve el método (el problema) boolean, int, char, double, String ?
	//		public static double longitudCircunferencia
	//
	//  3. Qué parámetros tiene la función y de que tipo SON (necesarios para resolver el problema)
	//		PISTA : Atender al enunciado
	//		double radio
	// Resuelve el problema de calcular la long. de una circunferencia
	// Se une todo y queda :
	
	
	public static double longitudCircunferencia (double radio)  
	{
		return 2 * Math.PI * radio;

	}
	
	// En este problema se trabaja el uso de LIBRERIAS standard de java
	// java.lang.Math
	// RECORDAD en Math están todas las constantes PI y las operaciones matemáticas
	// ERROR TIPICO: Match y el paréntesis.
	public static double areaCirculo( double radio)
	{		
		return Math.PI* Math.pow(radio, 2);
	}
	
	// En este problema lo que trabajamos es el uso de nuestras funciones
	// para definir otras (USAMMOS areaCirculo !!!)
	// ERRORES COMUNES:
	//	Uso un función hecha por mi (areaCirculo) pero no le pongo argumentos
	//	areaCirculo-areaCirculo(radio2);
	//  IMPORTANTE: Dentro de una función sólo están los argumentos como valores y 
	//  alguna constantes 
	//  PAPEL LAPIZ y dibujar !!
	
	public static double coronaCircular ( double radio1, double radio2)
	{
		//	return (2 * Math.PI * radio1)-(2 * Math.PI * radio2);
		return areaCirculo( radio1)-areaCirculo(radio2);
	}
	
	public static double fuerzaDeAtraccion ( double G, double masaCuerpo, double distancia)
	{
		return (G * masaCuerpo * masaTierra)/
				(distancia * distancia);
	}
	

	
	//	 TRABAJO PERSONAL =======================================================
	//
	// PROBLEMA 1. Calcular la formula del CARRETE
	//				BUSCAR EN INTERNET
	//		t = tiempo
	//      r = redito o interés
	//      c = capital
	//      i = interes
	//     https://es.wikipedia.org/wiki/Inter%C3%A9s_simple
	
	public static double interes (double c, double r, double t)
	{
		return 0.;
	}
	public static double capital (double i, double r, double t)
	{
		return 0.;
	}
	public static double redito (double i, double c, double t)
	{
		return 0.;
	}
	
	public static double tiempo (double i, double c, double r)
	{
		return 0.;
	}
	
	
	// PROBLEMA 2. Calcular la formula del INTERES COMPUESTO
	//				BUSCAR EN INTERNET
	//     https://es.wikipedia.org/wiki/Inter%C3%A9s_compuesto
	public static double capitalIC (double i, double r, double t)
	{
		return 0.;
	}
	
	
	
	// PROBLEMAS DE ANALIS DE CASOS
	
	// PROBLEMAS DE ANALISIS DE CASOS
	//  HAY IFs o SWITCH !!
	// ERRORES COMUNES:
	//	1. Me olvido de los parentesis de las condiciones  (diaSemana == 1)
	//	2. Me olvido de else if  else if( diaSemana == 2)
	//  3. Me olvido del else final (OBLIGATORIO)
	public static String diaSemana (int diaSemana ) 
	{
		if(diaSemana == 1)
			return "Lunes";
		else if( diaSemana == 2)
			return "Martes";
		else if( diaSemana ==3)
			return "Miercoles";
		else if( diaSemana == 4)
			return "Jueves";
		else if( diaSemana ==5)
			return "Viernes";
		else if( diaSemana ==6)	
			return "Sabado";
		else 
			return "Domingo";
	}

	// ERRORES COMUNES:
	// 1. switch funciona con valores enumerable no condicones
	// 2. Me olvido de default (OBLIGATORIO)
	public static String mesesDelAnio( int m)
	{
		switch (m)
		{
		case 1: return "Enero";
		case 2: return "Febrero";
		case 3: return "Marzo";
		case 4: return "Abril";
		case 5: return "Mayo";
		case 6: return "Junio";
		case 7: return "Julio";
		case 8: return "Agosto";
		case 9: return "Septiembre";
		case 10: return "Octubre";
		case 11: return "Noviembre";
		default: return "Diciembre";
		}

	}
	
	
	// PARTICULARIDAD DE LOS "char" a veces podemos verlos como el int (codigo ASCII)
	// HAY MUCHAS SITUACIONES DE "casting" (char) (c +32);
	public static boolean esMinuscula (char c)
	{
		return 'a' <= c && c <= 'z';
	}
	public static boolean esMayuscula (char c)
	{
		return 'A' <= c && c <= 'Z';
	}
	
	public static char aMinuscula( char c)
	{ 
		if( esMinuscula(c))
			return c;
		else
			return (char) (c +32);
	}
	
	public static char aMayuscula(char c)
	{
		if (esMayuscula(c))
			return c;
		else
			return (char) (c-32);
	}

	//	 TRABAJO PERSONAL =======================================================
	//  PROBLEMA 3. DIAS DE LA SEMANA
	//
	//      Determinar si hoy es dia laborable
	
	
	
	//  PROBLEMA 3. DIAS DE LA SEMANA
	//
	//      Determinar si el color pertenece al arco iris
	

    //  PROBLEMA 4. Traducir según este criterio
	//
	//       vocal devolvemos 'u' o 'U'
	//       si es 'v' devolvemos 'b'
	//       si es 'b' devolvemos 'v'
	//       si es 's' devolvemos 'x'
	//       si es 'x' devolvemos 'X'
	
	
	
	
	
	// PROBLEMAS DE RECORRIDOS
	
	public static int sumaN (int n)
	{
		int suma = 0;
		for (int i=1; i<=n; i++)
			suma = suma + i;
		return suma;
	}
	public static int multN (int n)
	{
		int mult = 1;
		for (int i=1; i<=n; i++)
			mult = mult * i;
		return mult;
	}
	public static int sumaInt (int a, int b)
	{
		int suma = 0;
		for (int i=a; i<=b; i++)
			suma = suma + i;
		return suma;
	}
	
	public static int multN (int a, int b)
	{
		int mult = 1;
		for (int i=a; i<=b; i++)
			mult = mult * i;
		return mult;
	}
	
	public static boolean esta (int a, int b, int x)
	{
		boolean encontrado = false;
		int i = a;
		while (i<=b && !encontrado)
			if (x == i)
				encontrado = true;
			else
				i++;
		return encontrado;
	}
	
	public static boolean esDivisor (int i, int x)
	{
		return x % i == 0;
	}
	public static boolean hayDivisor (int a, int b, int x)
	{
		boolean encontrado = false;
		int i = a;
		while (i<=b && !encontrado)
			if (esDivisor(i,x))
				encontrado = true;
			else
				i++;
		return encontrado;
	}
	
	public static boolean esPrimo (int n)
	{
		if (n==2)
			return true;
		else
			return ! hayDivisor (2,n-1,n);
	}
	
	

    //  PROBLEMA 5. Sumar los numeros impares en [a..b]
	//
	
    //  PROBLEMA 5. contar cuantos primos hay en [a..b]
	//
	
}
