def ejercicio5JNAQ():
  # definir datos y variables
  print("escoja cual de los 4 algoritmos desea usar")
  ejercicioJNAQ=0
  #datos de entrada
  algoritmoJNAQ=int(input("¿Que algoritmo desea usar"))
  #proseso
  if algoritmoJNAQ==1:
    def ejerccicio1JNAQ():
      #Definir variable y otros
      print("Consulte su nota del curso de fundamentos de programacion segun la ponderacion")
      notafinalJNAQ=0
      #Datos de entrada
      unidad1JNAQ=int(input("Ingresa tu nota de la primera unidad: "))
      unidad2JNAQ=int(input("Ingresa tu nota de la segunda unidad: "))
      unidad3JNAQ=int(input("Ingresa tu nota de la tercera unidad: "))
      trabajofJNAQ=int(input("Ingresa tu nota de la cuarta unidad: "))
      #Proseso
      if unidad1JNAQ>=0 and unidad1JNAQ<=20:
        nota1JNAQ=unidad1JNAQ*20/100
      if unidad2JNAQ>=0 and unidad2JNAQ<=20:
        nota2JNAQ=unidad2JNAQ*15/100
      if unidad3JNAQ>=0 and unidad3JNAQ<=20:
        nota3JNAQ=unidad3JNAQ*15/100
      if trabajofJNAQ>=0 and trabajofJNAQ<=20:
        nota4JNAQ=trabajofJNAQ*50/100
      notafinalJNAQ=nota1JNAQ+nota2JNAQ+nota3JNAQ+nota4JNAQ
      #datos de salida
      print("Su nota final es:",notafinalJNAQ)
    ejerccicio1JNAQ()
  if algoritmoJNAQ==2:
    def ejercicio2JNAQ():
      #definir Variables
      bonoObJNAQ=0.0
      #Datos de Endrada
      puntuacionObJNAQ=float(input("Ingrese la puntuación que ha obtenido:"))
      salarioMinJNAQ=float(input("Ingrese el salario minimo:"))
      #Proceso
      if puntuacionObJNAQ<=100 and puntuacionObJNAQ>=50:
        bonoObJNAQ=salarioMinJNAQ*10/100
      elif puntuacionObJNAQ >=101 and puntuacionObJNAQ<=150:
        bonoObJNAQ=salarioMinJNAQ*40/100
      elif puntuacionObJNAQ>150:
        bonoObJNAQ=salarioMinJNAQ*70/100 
      #Datos de salida
      print("El docente optiene un bono de:",bonoObJNAQ)
      print("Sueldo mas bono:",salarioMinJNAQ+bonoObJNAQ)
    ejercicio2JNAQ()
  if algoritmoJNAQ==3:
    def ejercicio3JNAQ():
      #definir variables
      print("consulta cual es la vacuna que te tocara")
      resultadoJNAQ=0
      #datos de entrada
      añosJNAQ=int(input("Ingresa tu edad:"))
      #proceso
      if añosJNAQ>=70:
        resultadoJNAQ="se le aplica la vacuna tipo C"
      if añosJNAQ>16 and añosJNAQ<=69:
        sexoJNAQ=input("ingrese su sexo:") 
        if sexoJNAQ=="hombre":
          resultadoJNAQ="se le aplica la vacuna A"
        if sexoJNAQ=="mujer":
          resultadoJNAQ="se le apliva la vacuna B"
      if añosJNAQ<=16:
        resultadoJNAQ="se le aplica la vacuna tipo A"
      #datos de salida
      print("A usted :",resultadoJNAQ)
    ejercicio3JNAQ()
  if algoritmoJNAQ==4:
    def  ejercicio4JNAQ():
      #definir datos y variables
      print("Indique que operacion desee realizar")
      operacionJNAQ=0
      #Ingrese datos de entrada
      numeroJNAQ=int(input("ingrese el primer numero :"))
      numero1JNAQ=int(input("ingrese el segundo numero :"))
      signoJNAQ=input("ingrese el signo de la operacion que desea realizar :")
      #proseso
      if signoJNAQ=="+":
        operacionJNAQ=numeroJNAQ+numero1JNAQ
      if signoJNAQ=="-":
        operacionJNAQ=numeroJNAQ-numero1JNAQ
      if signoJNAQ=="*":
        operacionJNAQ=numeroJNAQ*numero1JNAQ
      if signoJNAQ=="/":
        operacionJNAQ=numeroJNAQ/numero1JNAQ
      if signoJNAQ=="^":
        operacionJNAQ=numeroJNAQ^numero1JNAQ
      # datos de salida
      print("El resultado de su operacion es :",operacionJNAQ)
    ejercicio4JNAQ()
ejercicio5JNAQ()