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