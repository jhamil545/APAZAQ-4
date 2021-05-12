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