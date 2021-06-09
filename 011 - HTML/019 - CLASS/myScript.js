function myFunction(){
    var x = document.getElementsByClassName("town");
    for (var i = 0; i < x.length; i++){
        x[i].style.cssText = "color:black";
    }
}