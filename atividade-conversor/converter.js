// Conversão de Decimal para Binário, Hexadecimal e Octal
function convertDecimal() {
    const decimal = document.getElementById("decimal").value;
    if (decimal === '') {
        alert('Por favor, insira um valor decimal.');
        return;
    }

    const binary = parseInt(decimal, 10).toString(2);
    const hex = parseInt(decimal, 10).toString(16).toUpperCase();
    const octal = parseInt(decimal, 10).toString(8);

    showResult(`Binário: ${binary}, Hexadecimal: ${hex}, Octal: ${octal}`);
}

// Conversão de Binário para Decimal, Hexadecimal e Octal
function convertBinary() {
    const binary = document.getElementById("binary").value;
    if (binary === '' || !/^[01]+$/.test(binary)) {
        alert('Por favor, insira um valor binário válido.');
        return;
    }

    const decimal = parseInt(binary, 2).toString(10);
    const hex = parseInt(binary, 2).toString(16).toUpperCase();
    const octal = parseInt(binary, 2).toString(8);

    showResult(`Decimal: ${decimal}, Hexadecimal: ${hex}, Octal: ${octal}`);
}

// Conversão de Hexadecimal para Binário, Decimal e Octal
function convertHex() {
    const hex = document.getElementById("hexadecimal").value;
    if (hex === '' || !/^[0-9A-Fa-f]+$/.test(hex)) {
        alert('Por favor, insira um valor hexadecimal válido.');
        return;
    }

    const decimal = parseInt(hex, 16).toString(10);
    const binary = parseInt(hex, 16).toString(2);
    const octal = parseInt(hex, 16).toString(8);

    showResult(`Decimal: ${decimal}, Binário: ${binary}, Octal: ${octal}`);
}

// Conversão de Octal para Binário, Decimal e Hexadecimal (EXTRA)
function convertOctal() {
    const octal = document.getElementById("octal").value;
    if (octal === '' || !/^[0-7]+$/.test(octal)) {
        alert('Por favor, insira um valor octal válido.');
        return;
    }

    const decimal = parseInt(octal, 8).toString(10);
    const binary = parseInt(octal, 8).toString(2);
    const hex = parseInt(octal, 8).toString(16).toUpperCase();

    showResult(`Decimal: ${decimal}, Binário: ${binary}, Hexadecimal: ${hex}`);
}

// Exibe o resultado em um modal
function showResult(resultText) {
    const modal = document.getElementById("result-modal");
    const resultTextElem = document.getElementById("result-text");

    resultTextElem.textContent = resultText;
    modal.style.display = "block";

    // Fecha o modal ao clicar no X
    const closeBtn = document.querySelector(".close");
    closeBtn.onclick = function () {
        modal.style.display = "none";
    }

    // Fecha o modal ao clicar fora
    window.onclick = function (event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }
}
