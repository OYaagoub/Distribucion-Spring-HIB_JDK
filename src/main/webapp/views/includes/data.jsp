<%--
  Created by IntelliJ IDEA.
  User: oyaag
  Date: 05/02/2024
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<fieldset style="width: 40%">
    <legend>User Information</legend>
<form action="submit_form.php" method="post" style="width: 100%">


        <table style="width: 100%">
            <tr>
                <td><label for="docDniNif">Documento DNI/NIF:</label></td>
                <td><input type="text" id="docDniNif" name="docDniNif" placeholder="Documento DNI/NIF" style="padding: 5px 10px;width: 100%"></td>
            </tr>
            <tr>
                <td><label for="fullName">Nombre Completo:</label></td>
                <td><input type="text" id="fullName" name="fullName" placeholder="Nombre Completo" style="padding: 5px 10px;width: 100%"></td>
            </tr>
            <tr>
                <td><label for="email">Email:</label></td>
                <td><input type="email" id="email" name="email" placeholder="email" style="padding: 5px 10px;width: 100%"></td>
            </tr>
            <tr>
                <td><label for="password">Contraseña:</label></td>
                <td><input type="password" id="password" name="password" placeholder="Contraseña" style="padding: 5px 10px;width: 100%"></td>
            </tr>
            <tr>
                <td><label for="province">Provincia:</label></td>
                <td><input type="text" id="province" name="province" placeholder="Provincia"  style="padding: 5px 10px;width: 100%"></td>
            </tr>
            <tr>
                <td><label for="codePostal">Codigo Postal:</label></td>
                <td><input type="text" id="codePostal" name="codePostal"  placeholder="Codigo Postal" style="padding: 5px 10px;width: 100%"></td>
            </tr>
            <tr>
                <td><label for="country">Pais:</label></td>
                <td><input type="text" id="country" name="country" placeholder="Pais" style="padding: 5px 10px;width: 100%"></td>
            </tr>
            <tr>
                <td><label for="city">Ciudad:</label></td>
                <td><input type="text" id="city" name="city" placeholder="Ciudad" style="padding: 5px 10px;width: 100%"></td>
            </tr>
            <tr>
                <td><label for="address">Domicilio:</label></td>
                <td><input type="text" id="address" name="address" placeholder="Domicilio" style="padding: 5px 10px;width: 100%"></td>
            </tr>
            <tr>
                <td><label for="phone">Telefono:</label></td>
                <td><input type="tel" id="phone" name="phone" placeholder="Telefono" style="padding: 5px 10px;width: 100%"></td>
            </tr>
        </table>


    <br>

    <input type="submit" value="Submit">
</form>
    <details style="width: 100%;padding: 10px;background: #020024;margin: 5px">
        <summary>datos Prancipales</summary>
        <table style="width: 100%;border:1px solid white;border-collapse: collapse;margin-top: 20px">

            <tr>
                <td  style="width: 50%;border:1px solid white;border-collapse: collapse;padding: 10px">derection  :</td>
                <td  style="width: 50%;border:1px solid white;border-collapse: collapse;padding: 10px">
                    Nombre : Oussama Yaagoub <br>
                    Doc NIF o DNI :  34523456 <br>
                    Dereccion : spain toledo Concuegra Av. Imperio Romano 45700 <br>
                    Contacto Email: ousaa@gmai.com <br>
                    Contacto telefono: +2112421412412 <br>
                </td>
            </tr>

        </table>
    </details>
</fieldset>