function justNumbers(e)
{
    var keynum = window.event ? window.event.keyCode : e.which;
    if ((keynum == 8) || (keynum == 46))
        return true;

    return /\d/.test(String.fromCharCode(keynum));
}
function validarEmail( ) {
    var email=document.registro.txtemail.value;
    expr = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if ( !expr.test(email) )
        alert("Error: La dirección de correo " + email + " es incorrecta.");
}
function ingresa(){
     var usu = document.registro.txtuser.value,
            matri = document.registro.txtmatricula.value,
            a_pat=document.registro.txtapat.value,
            a_mat=document.registro.txtamat.value;
    
}