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