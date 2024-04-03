// footer.js
function loadFooter() {
    const footerContainer = document.getElementById("footer-container");

    fetch('./components/footer.html')
        .then(response => response.text())
        .then(data => {
            footerContainer.innerHTML = data;
        })
        .catch(error => {
            console.error('Erro ao carregar o footer: ', error);
        });

}
document.addEventListener("DOMContentLoaded", loadFooter);