<<<<<<< HEAD
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
=======
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
>>>>>>> 2dbc556da37e216582f1ac3450feec4936056931
