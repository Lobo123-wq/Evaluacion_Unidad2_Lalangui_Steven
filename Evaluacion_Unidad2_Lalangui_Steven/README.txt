EVALUACIÓN DE HABILIDADES PRÁCTICAS – UNIDAD 2
Modularidad: métodos, parámetros y recursividad
Asignatura: Fundamentos de Programación B | NRC: 37712
Estudiante: Steven Lalangui

CONTENIDO
src/: cinco programas Java independientes.
E1: salida exacta de f() y g().
E2: potencia recursiva pot(3,4).
E3: paso de parámetros primitivos y arreglos.
E4: cálculo de parqueadero.
E5: suma recursiva de pares y comprobación capicúa.

PARTE A – RESPUESTAS

EJERCICIO 1
g(2) = f(2) + f(3) = 4 + 9 = 13.
g(1) = f(1) + f(2) = 1 + 4 = 5.
f(g(1)) = f(5) = 25.
La variable x del main no cambia.
Salida exacta:
13 25
2

EJERCICIO 2 – TRAZA
pot(3,4) = 3 * pot(3,3)
pot(3,3) = 3 * pot(3,2)
pot(3,2) = 3 * pot(3,1)
pot(3,1) = 3 * pot(3,0)
pot(3,0) = 1
Retornos: 3, 9, 27, 81.
Resultado: 81.

EJERCICIO 3
Salida: 5 12
La variable a conserva 5 porque el tipo int se pasa por valor: el método recibe una copia.
El arreglo sí se modifica: dentro del método a pasa a 6 y v[1] recibe 6 + 6 = 12.

PARTE B
E4: leerMinutos valida el rango 1–1440. horasCobradas redondea cada fracción de hora hacia arriba. tarifa cobra $1.00 por hora para auto y $0.50 para moto; si las horas superan 8, aplica 20 % de descuento.
Pruebas: 125 minutos, auto → 3 horas, $3.00. 600 minutos, moto → 10 horas, $4.00.

E5: sumPares(10) = 30; sumPares(7) = 12; esCapicua("12321") = true.

Los cinco programas se entregan como archivos .java separados.

COMPILACIÓN: Los cinco archivos compilaron correctamente.