function contar() {
    inicio = document.getElementById('txt-inicio');
    fim = document.getElementById('txt-fim');
    passos = document.getElementById('txt-passos');
    resultado = document.getElementById('resultado-texto');
    resultado.innerHTML = ``;
    if (inicio.value.length == 0 || fim.value.length == 0 || passos.value.length == 0) {
        window.alert("[ERRO] Faltam campos a serem preenchidos.");
    } else if (Number(inicio.value) > 100 || Number(fim.value) > 100)
        window.alert("[ERRO] Os campos 'Inicio' e 'Fim' devem ser menores que 100");
    else {
        i = Number(inicio.value);
        f = Number(fim.value);
        p = Number(passos.value);
        if (p <= 0) {
            window.alert("O campo 'Passos' não pode ser 0 e foi definido como '1'");
            p = 1;
        }
        if (i < f) {
            for (c = i; c <= f; c += p) {
                resultado.innerHTML += `${c} `
                if (c + p <= f)
                    resultado.innerHTML += `\u{1F411} `
            }
        } else if (i > f) {
            for (c = i; c >= f; c -= p) {
                resultado.innerHTML += `${c} `
                if (c - p >= f)
                    resultado.innerHTML += `\u{1F411} `
            }
        } else {
            resultado.innerHTML = `${i} `
        }
        resultado.innerHTML += `\u{1F4A4}`
    }

}