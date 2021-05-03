def estCondicional01():
  #Definir variables y otros
  print("Consulte si Ud. ya vota")
  enunciadoP=0
  #Datos de entrada
  cantidadX=int(input("Ingrese su cantidad de años:"))
  #Proceso
  if cantidadX>=18:
   enunciadoP="si votará"
  else:
   enunciadoP="no vota aún" 
  #Datos de salida
  print("Usted :", enunciadoP)
estCondicional01()