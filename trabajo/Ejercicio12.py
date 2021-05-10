def ejercicio12():
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
  exedente=(cantidadX-40)
  exedente1=(exedente-5)
  if cantidadX<=40:
   enunciadoP=36*cantidadX 
  if cantidadX>=41 and cantidadX<=45:
   enunciadoP=((36*40)+(72*(exedente-(-exedente1))))
  if cantidadX>=46 and cantidadX<=50:
   enunciadoP=((36*40)+(72*(exedente-exedente1)+(108*exedente1)))
  if cantidadX>=51:
    enunciadoP= "mucho trabajaste XD"
  #Datos de salida
  print("Sus horas de trabajos son:", cantidadX)
  print("Su sueldo de esta semana es :", enunciadoP)
ejercicio12()
