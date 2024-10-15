function idade(){
    var ano,calculo
    ano=document.getElementById("bloco").value;
    calculo = 2024 - ano;
    document.getElementById("resultado").innerHTML = calculo;
}