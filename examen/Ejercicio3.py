def ejercicio3JNAQ():
  #definir variables
  print("consulta cual es la vacuna que te tocara")
  resultadoJNAQ=0
  #datos de entrada
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
    resultadoJNAQ="se le aplica la vacuna tipo A"
  #datos de salida
  print("A usted :",resultadoJNAQ)
ejercicio3JNAQ()