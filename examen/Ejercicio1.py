def ejerccicio1JNAQ():
  #Definir variable y otros
  print("Consulte su nota del curso de fundamentos de programacion segun la ponderacion")
  notafinalJNAQ=0
  #Datos de entrada
  unidad1JNAQ=int(input("Ingresa tu nota de la primera unidad: "))
  unidad2JNAQ=int(input("Ingresa tu nota de la segunda unidad: "))
  unidad3JNAQ=int(input("Ingresa tu nota de la tercera unidad: "))
  trabajofJNAQ=int(input("Ingresa tu nota de la cuarta unidad: "))
  #Proseso
  if unidad1JNAQ>=0 and unidad1JNAQ<=20:
    nota1JNAQ=unidad1JNAQ*20/100
  if unidad2JNAQ>=0 and unidad2JNAQ<=20:
    nota2JNAQ=unidad2JNAQ*15/100
  if unidad3JNAQ>=0 and unidad3JNAQ<=20:
    nota3JNAQ=unidad3JNAQ*15/100
  if trabajofJNAQ>=0 and trabajofJNAQ<=20:
    nota4JNAQ=trabajofJNAQ*50/100
  notafinalJNAQ=nota1JNAQ+nota2JNAQ+nota3JNAQ+nota4JNAQ
  #datos de salida
  print("Su nota final es:",notafinalJNAQ)
ejerccicio1JNAQ()