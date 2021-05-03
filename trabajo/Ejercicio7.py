def estCondicional01():
  #Definir variables y otros
  print("becas")
  enunciadoP=0
  #Datos de entrada
  añosX=int(input("Ingrese su edad :"))
  promedioX=float(input("Ingrese su promedio:"))
  #Proceso
  if añosX>18:
     #enunciadoP=
   if promedioX<10:
     enunciadoP="2000"
   if promedioX<9:
     enunciadoP="1000"
   if promedioX<7.5:
     enunciadoP="500"
   if promedioX<6:
     enunciadoP="Estudia mas el proximo ciclo escolar."
  else:
     #nunciadoP="no vota aún" 
   if promedioX<10:
     enunciadoP="3000"
   if promedioX<9:
     enunciadoP="2000"
   if promedioX<8:
     enunciadoP="100"
   if promedioX<6:
     enunciadoP="Le invito a estudiar mas el proximo ciclo escolar."
  #Datos de salida
  print("La beca de usted es :", enunciadoP)
estCondicional01()