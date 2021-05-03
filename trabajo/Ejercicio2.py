def estCondicional01():
  #Definir variables y otros
  print("Indique cuantas horas trabajo por dia")
  enunciadoP=0
  #Datos de entrada
  dia1=int(input("Lunes:"))
  dia2=int(input("Martes:"))
  dia3=int(input("Miercoles:"))
  dia4=int(input("Jueves:"))
  dia5=int(input("Viernes:"))
  dia6=int(input("Sabado:"))
  dia7=int(input("Domingo:"))
  #Proceso
  cantidadX=dia1+dia2+dia3+dia4+dia5+dia6+dia7
  exedente=cantidadX-40
  if cantidadX>40:
   enunciadoP=(36*40)+(72*exedente)
  else:
   enunciadoP=36*cantidadX 
  #Datos de salida
  print("Sus horas de trabajos son:", cantidadX)
  print("Su sueldo de esta semana es :", enunciadoP)
estCondicional01()