def ejercicio11():
  #definimos las varibles
  print("Consulte su bono")
  bonoX=0
  #introduscamos los valores
  antiguedadZ=int(input("Introdusca sus años de antiguedad:"))
  #procedimiento
  if antiguedadZ==1:
    bonoX="100"
  if antiguedadZ==2:
    bonoX="200"
  if antiguedadZ==3:
    bonoX="300"
  if antiguedadZ==4:
    bonoX="400"
  if antiguedadZ==5:
    bonoX="500"
  if antiguedadZ>=6:
    bonoX="1000"
  #datos de salida
  print("su bono es de",bonoX,"dolares" )
ejercicio11()
    #> y “menor que” <
