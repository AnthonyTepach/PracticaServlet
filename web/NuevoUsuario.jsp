<%-- 
    Document   : NuevoUsuario
    Created on : 28/05/2016, 03:20:28 PM
    Author     : anthonytepach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="HandheldFriendly" content="True">
        <meta name="MobileOptimized" content="320">
        <title>Registro</title>
        <script type="text/javascript" src="js/registar.js"></script>
        <link href="css/concise.css" type="text/css" rel="stylesheet">
    </head>
    <body>
         <h3>Registro de usuarios</h3>
        <form method="post" action="SrvAlumno" name="FormAlum">
            <fieldset>
                <legend>Datos personales</legend>
                <p>Fotografia: <input type="file" name="avatar"/></p>
                <p>Matricula: <input type="text" name="txtmatricula" onkeypress ="return justNumbers(event);"/></p>
                <p>Nombre: <input type="text" name="txtnombre"/></p>
                <p>Apellido paterno: <input type="text" name="txtapat"/></p>
                <p>Apellido materno: <input type="text" name="txtamat"/></p>
                <p>Contraseña: <input type="text" name="txtpass"/></p>
                <p>Confirma contraseña: <input type="text" name="txtpass2"/></p>
            </fieldset>

            <fieldset>
                <legend>Datos de contacto</legend>
                <p>Telefono fijo: <input type="text" name="txtfijo" onkeypress ="return justNumbers(event);"/></p>
                <p>Telefono celular: <input type="text" name="txtcel" onkeypress ="return justNumbers(event);"/></p>
                <p>E-mail: <input type="text" name="txtemail" onkeypress="validarEmail();"/></p>
            </fieldset>
            <fieldset>
                <legend>Datos academicos</legend>
                <p>Carrera: <select name="carrera">
                        <option>DTIC</option>
                        <option>DBID</option>
                        <option>DADM</option>
                        <option>DPRO</option>
                        <option>DELA</option>
                    </select><br><br></p>
                <p>Catrimestre: <select name="cuatri">
                        <option>Primer</option>
                        <option>Segundo</option>
                        <option>Tercer</option>
                        <option>Cuarto</option>
                        <option>Quinto</option>
                        <option>Sexto</option>
                        <option>Septimo</option>
                        <option>Octavo</option>
                        <option>Noveno</option>
                        <option>Decimo</option>
                    </select> </p>
                <p>Turno: <select name="turno">
                        <option>Matutino</option>
                        <option>Vespertino</option>
                    </select></p>
            </fieldset>
            <input type="submit" value="Ingresa"/>
        </form>
    </body>
</html>
