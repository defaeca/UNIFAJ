def verifica_reflexiva(lista):
    n = len(lista)
    for i in range(n):
        if lista[i] != i:
            return False
    return True


lista1 = [0, 1, 2, 3, 4]
lista2 = [1, 2, 3, 3, 4]
lista3 = [0, 1, 2, 3, 4, 5]

print(verifica_reflexiva(lista1))
print(verifica_reflexiva(lista2))
print(verifica_reflexiva(lista3))
