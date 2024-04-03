function verificar() {
    data = new Date();
    ano = data.getFullYear();

    formAno = document.getElementById('txt-ano');
    resultado = document.querySelector('div#resultado');
    resultadoTexto = document.querySelector('p#resultado-texto');

    if (formAno.value.length == 0 || formAno.value > ano) {
        window.alert('[ERRO] Verifique os dados e tente novamente!');
    } else {
        resultadoTexto.innerHTML = '';
        img = resultado.querySelector('img');
        if (!img) {
            img = document.createElement('img');
            resultado.appendChild(img);
        }
        img.setAttribute('src', '');
        idade = ano - Number(formAno.value);
        if (!(idade < 0 || idade > 110)) {

            formSex = document.getElementsByName('radsex');
            genero = '';

            if (formSex[0].checked) {
                genero = 'Masculino';
                if (idade >= 0 && idade < 10) {
                    //Criança
                    img.setAttribute('src', 'img/bebe-M.png');
                } else if (idade < 21) {
                    //jovem
                    img.setAttribute('src', 'img/jovem-M.png');
                } else if (idade < 50) {
                    //adulto
                    img.setAttribute('src', 'img/adulto-M.png');
                } else {
                    //idoso
                    img.setAttribute('src', 'img/idoso.png');
                }
            } else {
                genero = 'Feminino';
                if (idade >= 0 && idade < 10) {
                    //Criança
                    img.setAttribute('src', 'img/bebe-F.png');
                } else if (idade < 21) {
                    //jovem
                    img.setAttribute('src', 'img/jovem-F.png');
                } else if (idade < 50) {
                    //adulto
                    img.setAttribute('src', 'img/adulta-F.png');
                } else {
                    //idoso
                    img.setAttribute('src', 'img/idosa.png');
                }
            }
            resultadoTexto.innerHTML = `Detectamos um humano do gênero ${genero} com ${idade} anos.`;
            resultado.appendChild(img);
        } else {
            window.alert(`[ERRO] Informe um ano válido entre ${ano - 110} e ${ano}`);
        }
    }
    formAno.value = '';
    formAno.focus();
}