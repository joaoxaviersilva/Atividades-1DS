function confirmar(){
    var numero =  document.getElementById('bloco').value;
    var inteiro = Number(numero);
    if(inteiro % 2 == 0){
        alert(`O número ${inteiro} é par !`)
    }
    else{
       alert(`O número ${inteiro} é ímpar !`)
    }
}