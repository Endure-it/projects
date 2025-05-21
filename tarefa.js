function soma () {
    let n1 = parseInt(document.getElementById ("valor1").value);
    let n2 = parseInt(document.getElementById ("valor2").value);
    document.getElementById("resultsoma").innerText = n1 + n2;
}
function multiplicação() {
    let n1 = parseInt(document.getElementById ("valor3").value);
    let n2 = parseInt(document.getElementById ("valor4").value);
    document.getElementById("resultmultiplicação").innerText = n1 * n2;    
}
function divisão() {
    let n1 = parseInt(document.getElementById ("valor5").value);
    let n2 = parseInt(document.getElementById ("valor6").value);
    document.getElementById("resultdivisão").innerText = n1 / n2;
}  
