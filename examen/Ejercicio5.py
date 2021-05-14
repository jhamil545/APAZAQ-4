def ejercicio5JNAQ():
  #datos y valores
  print("Elige uno de los 4 algoritmos")
  #datos de entrada
  operacionJNAQ=int(input("Que algoritmo desea probar:"))
  #proseso
  if operacionJNAQ==1:
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
  if operacionJNAQ==2:
    def ejercicio2JNAQ():
      #definir Variables
      print("consulte su bono segun su puntuacion")
      bonoJNAQ=0.0
      #Datos de Endrada
      salarioMinJNAQ=float(input("Ingrese su salario minimo:"))
      puntuacionJNAQ=float(input("Ingrese su puntuación que ha obtenido:"))
      #Proceso
      if puntuacionJNAQ<=100 and puntuacionJNAQ>=50:
        bonoJNAQ=(salarioMinJNAQ*10/100)
      elif puntuacionJNAQ >=101 and puntuacionJNAQ<=150:
        bonoJNAQ=(salarioMinJNAQ*40/100)
      elif puntuacionJNAQ>150:
        bonoJNAQ=(salarioMinJNAQ*70/100)  
      #Datos de salida
      print("El docente optiene un bono de:",bonoJNAQ)
    ejercicio2JNAQ()
  if operacionJNAQ==3:
    def ejercicio3JNAQ():
      #definir variables
      print("consulta cual es la vacuna que te tocara")
      resultadoJNAQ=0
      #datos de entrada
      añosX=int(input("Ingresa tu edad:"))
      #proceso
      if añosX>=70:
        resultadoJNAQ="se le aplica la vacuna tipo C"
      if añosX>16 and añosX<=69:
        sexoJ=input("ingrese su sexo:") 
        if sexoJ=="hombre":
          resultadoJNAQ="se le aplica la vacuna A"
        if sexoJ=="mujer":
          resultadoJNAQ="se le apliva la vacuna B"
      if añosX<=16:
        resultadoJNAQ="se le aplica la vacuna tipo A"
      #datos de salida
      print("A usted :",resultadoJNAQ)
    ejercicio3JNAQ()
  if operacionJNAQ==4:
    def ejercicio4(): 
      #Definir varibles
      print("calcule su operacion aritmetica")
      operacionJNAQ=0
      #Datos de entrada
      numeroJNAQ=int(input("Ingrese el primer numero:"))
      numero1JNAQ=int(input("Ingrese el segundo numero:"))
      signoJNAQ=input("ingrese el signo:")
      #proseso
      if signoJNAQ=="+":
        operacionJNAQ=(numeroJNAQ+numero1JNAQ)
      if signoJNAQ=="-":
        operacionJNAQ=(numeroJNAQ-numero1JNAQ)
      if signoJNAQ=="*":
        operacionJNAQ=(numeroJNAQ*numero1JNAQ)
      if signoJNAQ=="/": 
        operacionJNAQ=(numeroJNAQ/numero1JNAQ)
      if signoJNAQ=="^": 
        operacionJNAQ=(numeroJNAQ^numero1JNAQ)
        #datos de salida
      print("El resultado de la operacion es:",operacionJNAQ)
    ejercicio4()
ejercicio5JNAQ()