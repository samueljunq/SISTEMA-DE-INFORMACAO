const chave_transacoes_ls = "transacoes";

const form = document.getElementById('form');
const descInput = document.getElementById('descricao');
const valorInput = document.querySelector('#montante');
const tipoInput = document.querySelector('#tipo');
const balancoH1 = document.getElementById('balanco');
const receita = document.getElementById('din-positivo');
const despesa = document.getElementById('din-negativo');
const transacaoUL = document.getElementById('transacoes');

let transacoesSalvas = JSON.parse(localStorage.getItem(chave_transacoes_ls));
if (transacoesSalvas == null) {
    transacoesSalvas = [];
}

let idCounter = transacoesSalvas.length > 0 ? Math.max(...transacoesSalvas.map(t => t.id)) + 1 : 0;

form.addEventListener("submit", event => {
    event.preventDefault(); // Não submete formulário

    const descTransacao = descInput.value.trim();
    const valorTransacao = parseFloat(valorInput.value.trim());
    const tipoTransacao = tipoInput.value;

    if (descTransacao === '') {
        alert('Informe a descrição da transação');
        descInput.focus();
        return;
    }

    if (isNaN(valorTransacao) || valorTransacao <= 0) {
        alert('Informe um valor válido para a transação');
        valorInput.focus();
        return;
    }

    const transacao = {
        id: idCounter++,
        desc: descTransacao,
        value: tipoTransacao === 'despesa' ? -valorTransacao : valorTransacao
    };

    somaAoSaldo(transacao);
    somaReceitaDespesa(transacao);
    addTransacaoDOM(transacao);
    transacoesSalvas.push(transacao);
    localStorage.setItem(chave_transacoes_ls, JSON.stringify(transacoesSalvas));

    descInput.value = '';
    valorInput.value = '';
    descInput.focus();
});

function somaAoSaldo(transacao) {
    let valorBalanco = parseFloat(balancoH1.innerHTML.replace("R$", "").trim());
    valorBalanco += transacao.value;
    balancoH1.innerHTML = `R$${valorBalanco.toFixed(2)}`;
}

function somaReceitaDespesa(transacao) {
    const elemento = transacao.value > 0 ? receita : despesa;
    const substituir = transacao.value > 0 ? "+ R$" : "- R$";

    let valor = parseFloat(elemento.innerHTML.replace(substituir, "").trim());
    valor += Math.abs(transacao.value);
    elemento.innerHTML = `${substituir}${valor.toFixed(2)}`;
}

function addTransacaoDOM(transacao) {
    const cssClass = transacao.value > 0 ? 'positivo' : 'negativo';
    const currency = transacao.value > 0 ? 'R$' : '-R$';
    const liElementStr = `${transacao.desc} <span>${currency}${Math.abs(transacao.value)}</span><button class="delete-btn" onclick="deletaTransacao(${transacao.id})">X</button>`;

    const liElement = document.createElement('li');
    liElement.innerHTML = liElementStr;
    liElement.classList.add(cssClass);
    liElement.dataset.id = transacao.id;
    transacaoUL.appendChild(liElement);
}

function carregaDados() {
    transacaoUL.innerHTML = '';
    balancoH1.innerHTML = 'R$0.00';
    receita.innerHTML = '+ R$0.00';
    despesa.innerHTML = '- R$0.00';

    transacoesSalvas.forEach(transacao => {
        somaAoSaldo(transacao);
        somaReceitaDespesa(transacao);
        addTransacaoDOM(transacao);
    });
}

function deletaTransacao(id) {
    const transacaoIndex = transacoesSalvas.findIndex((transacao) => transacao.id === id);
    if (transacaoIndex >= 0) {
        const [transacao] = transacoesSalvas.splice(transacaoIndex, 1);
        localStorage.setItem(chave_transacoes_ls, JSON.stringify(transacoesSalvas));

        let valorBalanco = parseFloat(balancoH1.innerHTML.replace("R$", "").trim());
        valorBalanco -= transacao.value;
        balancoH1.innerHTML = `R$${valorBalanco.toFixed(2)}`;

        const elemento = transacao.value > 0 ? receita : despesa;
        const substituir = transacao.value > 0 ? "+ R$" : "- R$";
        let valor = parseFloat(elemento.innerHTML.replace(substituir, "").trim());
        valor -= Math.abs(transacao.value);
        elemento.innerHTML = `${substituir}${valor.toFixed(2)}`;

        document.querySelector(`li[data-id='${id}']`).remove();
    }
}


carregaDados();


  
