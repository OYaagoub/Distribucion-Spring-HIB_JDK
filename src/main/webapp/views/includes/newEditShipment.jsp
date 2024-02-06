<%--
  Created by IntelliJ IDEA.
  User: oyaag
  Date: 06/02/2024
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<fieldset style="width: 60%">
    <legend>Nuevo Envio</legend>
    <form action="submit_form.php" method="post" style="width: 100%">
        <fieldset style="width: 100%">
            <legend>Information De Envio</legend>
            <table style="width: 100%">
                <tr>
                    <td><label for="title">Titulo:</label></td>
                    <td><input type="text" id="title" name="title" placeholder="Title" style="padding: 5px 10px;width: 100%"></td>
                </tr>
                <tr>
                    <td><label for="mass">Masa:</label></td>
                    <td><input type="number" step="0.01" id="mass" placeholder="Mass" name="mass" style="padding: 5px 10px;width: 100%"></td>
                </tr>
                <tr>
                    <td><label for="amount">Importe auto detectado :</label></td>
                    <td><input type="number" step="0.01" id="amount" placeholder="Auto detected Amount" name="amount" style="padding: 5px 10px;width: 100%"></td>
                </tr>
                <tr>
                    <td><label for="status">Estado:</label></td>
                    <td><input type="text" id="status" name="status" placeholder="Status" style="padding: 5px 10px;width: 100%"></td>
                </tr>
            </table>

        </fieldset>

        <br>

        <fieldset style="width: 100%">
            <legend>Informacion de recibidor</legend>
            <table style="width: 100%">
                <tr>
                    <td><label for="province">doc DNI O NIF:</label></td>
                    <td><input type="text" id="docDniNif" name="province" placeholder="doc DNI O NIF" style="padding: 5px 10px;width: 100%"></td>
                </tr>
                <tr>
                    <td><label for="recibidor">Nombre recibidor:</label></td>
                    <td><input type="text" id="recibidor" name="fullName" placeholder="Nombre recibidor" style="padding: 5px 10px;width: 100%"></td>
                </tr>
                <tr>
                    <td><label for="Email">Email recibidor:</label></td>
                    <td><input type="text" id="Email" name="email" placeholder="Email recibidor" style="padding: 5px 10px;width: 100%"></td>
                </tr>
                <tr>
                    <td><label for="province">Provincia:</label></td>
                    <td><input type="text" id="province" name="province" placeholder="Province" style="padding: 5px 10px;width: 100%"></td>
                </tr>
                <tr>
                    <td><label for="codePostal">Codigo Postal:</label></td>
                    <td><input type="text" id="codePostal" placeholder="Postal Code" name="codePostal" style="padding: 5px 10px;width: 100%"></td>
                </tr>
                <tr>
                    <td><label for="country">Pais:</label></td>
                    <td><input type="text" id="country" name="country" placeholder="Country" style="padding: 5px 10px;width: 100%"></td>
                </tr>
                <tr>
                    <td><label for="city">Ciudad:</label></td>
                    <td><input type="text" id="city" name="city" placeholder="City" style="padding: 5px 10px;width: 100%"></td>
                </tr>
                <tr>
                    <td><label for="address">domicilio:</label></td>
                    <td><input type="text" id="address" name="address" placeholder="Address" style="padding: 5px 10px;width: 100%"></td>
                </tr>
                <tr>
                    <td><label for="phone">Telefono:</label></td>
                    <td><input type="tel" id="phone" name="phone" placeholder="Phone" style="padding: 5px 10px;width: 100%"></td>
                </tr>
            </table>
        </fieldset>

        <br>

        <input type="submit" value="Submit">
    </form>

</fieldset>
