def estCondicional01():
  #Definir variables y otros
  print("¿Cual es el costo de su articulo?")
  enunciadoP=0
  #Datos de entrada
  cantidadX=int(input("Ingrese el costo para hacerle su descuento :"))
  #Proceso
  if cantidadX>=200:
   enunciadoP=cantidadX-(cantidadX*15/100)
  if cantidadX<=199:
   enunciadoP=cantidadX-(cantidadX*12/100)
  if cantidadX<=99:
   enunciadoP=cantidadX-(cantidadX*10/100)
  #Datos de salida
  print("Usted devera pagar :", enunciadoP)
estCondicional01()