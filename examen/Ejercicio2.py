def ejercicio2JNAQ():
  #definir Variables
<<<<<<< HEAD
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
#definir datos y variables
=======
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
>>>>>>> 2dbc556da37e216582f1ac3450feec4936056931
