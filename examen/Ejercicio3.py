def ejercicio3JNAQ():
  #definir variables
  print("consulta cual es la vacuna que te tocara")
  resultadoJNAQ=0
  #datos de entrada
  añosX=int(input("Ingresa tu edad:"))
  #proceso
  if añosX>=70:
    resultadoJNAQ="se le aplica la vacuna tipo C"
  if añosX>16 and añosX<=69:
     sexoJ=input("ingrese su sexo:") 
     if sexoJ=="hombre":
       resultadoJNAQ="se le aplica la vacuna A"
     if sexoJ=="mujer":
       resultadoJNAQ="se le apliva la vacuna B"
  if añosX<=16:
    resultadoJNAQ="se le aplica la vacuna tipo A"
  #datos de salida
  print("A usted :",resultadoJNAQ)
ejercicio3JNAQ()