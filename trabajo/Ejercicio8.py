def estCondicional01():
  #Definir variables y otros
  print("adquiera su bono mensual")
  enunciadoP=0
  #Datos de entrada
  bonoX=int(input("Ingrese la modalidad que desea su bono 1 antiguedad o 2 sueldo N°:"))
  aosX=int(input("Ingrese su cantidad de años o sueldo:"))
  #Proceso
  if bonoX<=1 and bonoX>0:
     if aosX<5 and aosX>2:
       enunciadoP=" 20% de su sueldo"
     if aosX>=5 :
       enunciadoP=" 30% de su sueldo"  
  if bonoX<=2 and bonoX>1:
    if aosX<1000 :
       enunciadoP=" 25% de su sueldo"
    if aosX>1000 and aosX<=3500:
       enunciadoP=" 15% de su sueldo"
    if aosX>3500:
       enunciadoP=" 10% de su sueldo"
  #Datos de salida
  print("Su bono es:", enunciadoP)
estCondicional01()