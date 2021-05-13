def ejercicio3JNAQ():
  #definir variables
  print("consulta cual es la vacuna que te tocara")
  resultadoJNAQ=0
  #datos de entrada
<<<<<<< HEAD
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
=======
  añosJNAQ=int(input("Ingresa tu edad:"))
  #proceso
  if añosJNAQ>=70:
    resultadoJNAQ="se le aplica la vacuna tipo C"
  if añosJNAQ>16 and añosJNAQ<=69:
     sexoJNAQ=input("ingrese su sexo:") 
     if sexoJNAQ=="hombre":
       resultadoJNAQ="se le aplica la vacuna A"
     if sexoJNAQ=="mujer":
       resultadoJNAQ="se le apliva la vacuna B"
  if añosJNAQ<=16:
>>>>>>> 2dbc556da37e216582f1ac3450feec4936056931
    resultadoJNAQ="se le aplica la vacuna tipo A"
  #datos de salida
  print("A usted :",resultadoJNAQ)
ejercicio3JNAQ()