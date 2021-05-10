def ejercicio18():
  #definir variable
  print ("consulta tu bono navideño")
  resultadobonoX=0
  #datos de entrada
  tipoX=input("Que método desea usar para revisar su bono/ antiguedad o sueldo:")
  antiguedadX=int(input("¿Cual es su tiempo de antiguedad?:"))
  sueldoX=int(input("¿Cuanto es tu sueldo?:"))
  #proceso
  if tipoX=="antiguedad":
     #antiguedadX=int(input("cuanto de antiguedad tienes:"))
    if antiguedadX>=4:
      resultadobonoX=(sueldoX*25/100)
    else:
       resultadobonoX=(sueldoX*20/100)
  if tipoX=="sueldo":
     #sueldoX=int(input("cual es tu sueldo:"))
    if sueldoX<=2000:
       resultadobonoX=(sueldoX*25/100)
    else:
       resultadobonoX=(sueldoX*20/100)
  #datos de salida
  print("su bono navideño es:", resultadobonoX)
ejercicio18()