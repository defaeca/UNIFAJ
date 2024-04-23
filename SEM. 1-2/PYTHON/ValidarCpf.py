def validar_cpf(cpf):
    # Remove caracteres não numéricos
    cpf = ''.join(filter(str.isdigit, cpf))

    # Verifica se o CPF possui 11 dígitos
    if len(cpf) != 11:
        return False, "CPF inválido. O CPF deve conter 11 dígitos."

    # Calcula o primeiro dígito verificador
    soma = 0
    for i in range(9):
        soma += int(cpf[i]) * (10 - i)
    d1 = 11 - (soma % 11)
    if d1 > 9:
        d1 = 0

    # Verifica se o primeiro dígito verificador está correto
    if int(cpf[9]) != d1:
        return False, "CPF inválido. Primeiro dígito verificador incorreto."

    # Calcula o segundo dígito verificador
    soma = 0
    for i in range(10):
        soma += int(cpf[i]) * (11 - i)
    d2 = 11 - (soma % 11)
    if d2 > 9:
        d2 = 0

    # Verifica se o segundo dígito verificador está correto
    if int(cpf[10]) != d2:
        return False, "CPF inválido. Segundo dígito verificador incorreto."

    # Determina o estado de emissão do CPF
    estado = int(cpf[8:10])
    if estado <= 2:
        return True, "CPF válido. Emitido em São Paulo."
    elif estado <= 5:
        return True, "CPF válido. Emitido em Minas Gerais."
    elif estado <= 9:
        return True, "CPF válido. Emitido no Rio de Janeiro."
    elif estado <= 12:
        return True, "CPF válido. Emitido no Rio Grande do Sul."
    elif estado <= 17:
        return True, "CPF válido. Emitido no Paraná."
    elif estado <= 20:
        return True, "CPF válido. Emitido em Santa Catarina."
    elif estado <= 23:
        return True, "CPF válido. Emitido no Rio Grande do Norte."
    elif estado <= 29:
        return True, "CPF válido. Emitido em Bahia."
    elif estado <= 32:
        return True, "CPF válido. Emitido no Pernambuco."
    elif estado <= 35:
        return True, "CPF válido. Emitido no Ceará."
    elif estado <= 38:
        return True, "CPF válido. Emitido no Pará."
    elif estado <= 39:
        return True, "CPF válido. Emitido no Maranhão."
    elif estado <= 43:
        return True, "CPF válido. Emitido em Goiás."
    elif estado <= 46:
        return True, "CPF válido. Emitido no Distrito Federal."
    elif estado <= 49:
        return True, "CPF válido. Emitido em Mato Grosso do Sul."
    elif estado <= 53:
        return True, "CPF válido. Emitido no Espírito Santo."
    elif estado <= 56:
        return True, "CPF válido. Emitido em Mato Grosso."
    elif estado <= 59:
        return True, "CPF válido. Emitido em Tocantins."
    elif estado <= 63:
        return True, "CPF válido. Emitido no Pará."
    elif estado <= 68:
        return True, "CPF válido. Emitido no Acre."
    elif estado <= 71:
        return True, "CPF válido. Emitido em Rondônia."
    elif estado <= 76:
        return True, "CPF válido. Emitido no Amazonas."
    elif estado <= 91:
        return True, "CPF válido. Emitido no Nordeste."
    else:
        return True, "CPF válido. Emissor desconhecido."


# Teste do algoritmo
cpf = input("Digite o CPF (apenas números): ")
valido, mensagem = validar_cpf(cpf)
if valido:
    print(mensagem)
else:
    print(mensagem)
