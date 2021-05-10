def ejercicio19():
  #definir variables
  print ("consulta cual es la vacuna que te tocara")
  resultadoV=0
  #datos de entrada
  añosX=int(input("Ingresa tu edad:"))
  #proceso
  if añosX>=70:
    resultadoV="se le aplica la vacuna tipo C"
  if añosX>16 and añosX<=69:
     sexoJ=input("ingrese su sexo:") 
     if sexoJ=="hombre":
       resultadoV="se le aplica la vacuna A"
     if sexoJ=="mujer":
       resultadoV="se le apliva la vacuna B"
  if añosX<=16:
    resultadoV="se le aplica la vacuna tipo A"
  #datos de salida
  print("A usted :",resultadoV)
ejercicio19()