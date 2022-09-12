# CasoPalindromos
1.

¿Qué hace el método? R: Verifica que la palabra ingresada (una cadena de caracteres) sea un palindromo

¿Cómo lo hace? R: Revise la cadena de caracteres que conforman la palabra, declara la variable resultado como texto vacio. Divide la cadena en subcadenas
  y luego invierte sus posiciones y devuelve una cadena como la original pero con los caracteres invertidos de posicion, esto se guarda en la variable resultado. 
  Luego retorna un true si la cadena cadena (original) y la cadena resultado son iguales, sino retorna un false, este ultimo seria el caso no fuera palindromo.

¿Cómo lo uso? Pasandole como argumento la palabra que queremos comprobar si es o no un palindromo

2. El programa se encuentra realizado 🟢

3.1 3.2 3.3 R: Queremos comprobar que el metodo esPalindromo funcione correctamente, por lo tanto crearemos un arreglo de palindromos validos y no validos como casos de prueba
  y como resultados esperados crearemos un arreglo con valores true o false, dependiendo si era o no un palindromo valido.
 
4.1 Caso de prueba 1: Esperamos un false
    Caso de prueba 2: Esperamos un true
    Caso de prueba 3: Esperamos un true
    Caso de prueba 4: Esperamos un false
    Caso de prueba 5: Esperamos un true
    
4.2
  Mejoras al metodo: No permitir que el usuario no ingrese ningun valor, ya que hasta ahora nuestro metodo interpreta esa cadena vacia como un palindromo.
  ¿Qué rol jugaron las pruebas en mejorar su código? R: El caso de prueba 2, de la actividad 4.1 nos permitio darnos cuenta que nuestro metodo esPalindromo
    interpretaba una cadena vacia como palindromo.
    
5. R: Los casos de pruebas son vitales para garantizar que nuestros metodos, funcionen incluso cuando el usuario ingresa algo que no esperabamos como programadores,
   es por esta razon que nuestros casos de prueba deben ser no los que esperamos que funcionen bien, si no los casos limites que pueden hacer que nuestro programa falle
