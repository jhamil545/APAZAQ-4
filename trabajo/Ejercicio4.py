def estCondicional01():
  #Definir variables y otros
  print("¿cuantas horas usara el estacionamiento?")
  enunciadoP=0
  #Datos de entrada
  cantidadX=int(input("Ingrese la cantidad de horas:"))
  #Proceso
  if cantidadX<=2:
   enunciadoP=5*cantidadX
  if cantidadX<=5:
   enunciadoP=(4*(cantidadX-2))+10
  if cantidadX<=10:
   enunciadoP=(3*(cantidadX-5))+22
  if cantidadX>=11:
   enunciadoP=2*cantidadX
  #Datos de salida
  print("Usted devera pagar :", enunciadoP)
estCondicional01()