def reflexiva(mat):
    n = len(mat)

    for i in range(n):
        for j in range(n):
            if i == j and mat[i][j] != 1:
                return False
            elif i != j and mat[i][j] == 1:
                return False

    return True


mat1 = [
    [1, 0, 0],
    [0, 1, 0],
    [0, 0, 1]
]

mat2 = [
    [1, 0, 0],
    [1, 1, 0],
    [0, 0, 1]
]

print(reflexiva(mat1))
print(reflexiva(mat2))
