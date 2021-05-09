def ejercicio09():
  #Definir variables y otros 
  print("Escoja entra las dos polizas que le brindamos A cobertura amplia y B daños a terceros ")
  enuciadoA=0
  enuciadoB=0
  enuciadoC=0
  enuciadoD=0
  enuciadoE=0
  #Datos de entrada
  tipoX=input("Elija la poliza A o B :")
  alcoholX=input("¿Tiene por habito beber alcohol?:")
  lentesX=input("¿Utiliza lentes?:")
  enfermedadX=input("¿Padece alguna enfermedad como deficiencia cardiaca o diabetes?:")
  añosX=int(input("¿Cuantos años tiene?:"))
  #proseso
  if tipoX=="A": 
     if alcoholX=="SI":
      enuciadoA=(1200*10/100)
     elif alcoholX=="NO":
      enuciadoA=0
     if lentesX=="SI":
      enuciadoB=(1200*5/100)
     elif lentesX=="NO":
      enuciadoB=0
     if enfermedadX=="SI":
      enuciadoC=(1200*5/100)
     elif enfermedadX=="NO":
      enuciadoC=0
     if añosX>=40:
      enuciadoD=(1200*20/100)
     elif añosX<=39 and añosX>18:
      enuciadoD=(1200*10/100)
      
     
  elif tipoX=="B":
    if alcoholX=="SI":
      enuciadoA=(950*10/100)
    elif alcoholX=="NO":
      enuciadoA=0
    if lentesX=="SI":
      enuciadoB=(950*5/100)
    elif lentesX=="NO":
      enuciadoB=0
    if enfermedadX=="SI":
      enuciadoC=(950*5/100)
    elif enfermedadX=="NO":
      enuciadoC=0
    if añosX>=40:
      enuciadoD=(950*20/100)
    elif añosX<=39 and añosX>18:
      enuciadoD=(950*10/100)
  if tipoX=="A":
    polizaJ=1200
  elif tipoX=="B":
    polizaJ=950
  respuesta=polizaJ+enuciadoA+enuciadoB+enuciadoC+enuciadoD+enuciadoE
     
  #Datos de salida
  print("El costo de su poliza es:", respuesta)
ejercicio09()