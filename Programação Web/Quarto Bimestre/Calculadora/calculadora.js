const resultado = document.getElementById('resultado');
const botoes = document.querySelectorAll('.botoes button');

botoes.forEach(botao => {
    botao.addEventListener('click', () => {
        const valorBotao = botao.textContent;

        if (valorBotao === '=') {
            try {
                resultado.value = eval(resultado.value);
            } catch (error) {
                resultado.value = 'Erro';
            }
        } else if (valorBotao === 'C') {
            resultado.value = '';
        } else {
            resultado.value += valorBotao;
        }
    });
});