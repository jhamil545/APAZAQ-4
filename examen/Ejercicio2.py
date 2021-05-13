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
#definir datos y variables
