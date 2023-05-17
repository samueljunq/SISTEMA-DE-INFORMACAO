 class Tarefa{
 constructor(descricao, prioridade, data, hora) {
      this._descricao = descricao;
      this._prioridade = prioridade;
      this._data = data;
      this._hora = hora;
    }
    get descricao() {
        return this._descricao;
    }

    set descricao(novaDescricao) { // Verifica se a nova descrição tem pelo menos 3 caracteres
        if (novaDescricao.length < 3) {
            console.log("Deve conter pelo menos 3 caracteres.");
            throw new Error("Deve conter pelo menos 3 caracteres.");
          }
        this._descricao = novaDescricao; // Atribui a nova descrição à propriedade interna '_descricao'
    }

    get prioridade() {
        return this._prioridade;
    }

    set prioridade(prioridade) {
        this._prioridade = prioridade;
    }

    get data() {
        return this._data;
    }

    set data(data) {
        this._data = data;
    }

    get hora() {
        return this._hora;
    }

    set hora(hora) {
        this._hora = hora;
    }

    // Define o método 'toString' para retornar uma representação em string do objeto
    toString() {
        return `Descrição: ${this._descricao} - Prioridade: ${this._prioridade} - Data: ${this._data} - Hora: ${this._hora}`;
      }
}
  