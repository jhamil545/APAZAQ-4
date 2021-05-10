def ejercicio10():
  #Definir variables y otros
  print("consulte su lugar de viaje")
  vacacionesI=0
  #Datos de entrada
  montoX=int(input("¿Cuanto es su presupuesto:"))
  #Proseso
  if montoX>=1500 and montoX<=1599:
    vacaciones="Ud. podra irse de viaje a México"
  if montoX>=1600 and montoX<=2399:
    vacaciones="Ud. podra irse de viaje a P.V."
  if montoX>=2400 and montoX<=3599:
    vacaciones="Ud. podra irse de viaje a Acapulco"
  if montoX>=3600:
    vacaciones="Ud. podra irse de viaje a Cancún"
  if montoX<=1500:
    vacaciones="Ud. se queda en su casa"
  #datos de salida
  print(vacaciones)
ejercicio10()
#> y “menor que” <