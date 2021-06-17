function texto(){
    document.getElementById("demo").innerHTML = "Hello Jorge!"
}

function encender(){
    document.getElementById("bombilla").src="images/pic_bulbon.gif"
}

function apagar(){
    document.getElementById("bombilla").src="images/pic_bulboff.gif"
}

function agrandar(){
    var x = document.getElementsByTagName("h2")
    x[0].style.fontSize = "35px"
}

function ocultar(){
    document.getElementById("bombilla").style.display = "none"
}

function mostrar(){
    document.getElementById("bombilla").style.display= "inline"
}