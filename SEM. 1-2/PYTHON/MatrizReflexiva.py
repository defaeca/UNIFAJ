def reflexiva(lista):
    n = len(lista)
    matriz = [[0]*n for _ in range(n)]

    for i in range(n):
        for j in range(n):
            if i == j:
                matriz[i][j] = 1
            elif lista[i] == lista[j]:
                matriz[i][j] = 1

    return matriz


elems = [0, 1, 2, 3, 4]
matriz_reflexiva = reflexiva(elems)

for linha in matriz_reflexiva:
    print(linha)
