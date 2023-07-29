
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ include file="../plantillas/header.jsp"%>

<main class="main">  
    <div class="content1">
        <div class="options">
            <div class="backlog">
                <a href="ControllerInline?enviar=main"><img src="assets/img/back.PNG" alt="backlog" class="backlog"></a>
            </div>
            <button class="btn">Agregar</button>
            <input type="text" placeholder="buscar" class="inputSearch">
        </div>
        <div class="content2">
            <table>
                <tr class="title-table">
                    <th colspan="7">USUARIOS</th>
                </tr>
                <tr>
                    <th rowspan="2">Tipo Documento</th>
                    <th rowspan="2">Nombre</th>
                    <th rowspan="2">Apellido</th>
                    <th rowspan="2">Correo</th>
                    <th rowspan="2">Rol</th>
                    <th colspan="2">Acciones</th>
                </tr>
                <tr>
                    <th>
                        Actualizar
                    </th>
                    <th>
                        Eliminar
                    </th>
                </tr>
                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td class="iconCenter"><img src="https://img.icons8.com/ios/100/000000/refresh--v1.png" alt="refresh--v1" class="iconUpdate"/></td>
                    <td class="iconCenter"><img height="30" src="https://img.icons8.com/ios/100/000000/delete--v1.png" alt="delete--v1" class="iconDelete"/></td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>


                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>

                <tr>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                    <td>Prueba</td>
                </tr>
            </table>
    </div>


</div>
<div class="form">
    <form action="">
        <h1 class="title-table">Registro de usuarios</h1>
        <div class="contentForm">
            <div class="divDocumentType">
                <label for="documentType">Tipo de documento:</label><br>
                <select name="documentType" id="documentType">
                    <option value="1">CC</option>
                    <option value="2">TI</option>
                </select>
            </div>

            <div class="divNoDocument">
                <label for="noDocument">Numero de documento:</label>
                <input type="text" id="noDocument" name="noDocument">
            </div>

            <div class="divName">
                <label for="name">Nombre:</label>
                <input type="text" id="name" name="name">
            </div>

            <div class="divLastName">
                <label for="lastName">Apellido:</label>
                <input type="text" id="lastName" name="lastName">
            </div>

            <div class="divEmail">
                <label for="email">Correo:</label>
                <input type="email" id="email" name="email">
            </div>

            <div class="divPassword">
                <label for="password">Apellido:</label>
                <input type="text" id="password" name="password">
            </div>

            <div class="divRol">
                <label for="rol">Rol</label><br>
                <select name="rol" id="rol">
                    <option value="1">Administrador</option>
                    <option value="2">Empleado</option>
                </select>
            </div>
            <div class="divBtnForm">
                <button class="btnForm">Registrar</button>
            </div>
        </div>
    </form>
</div>
</main>
    
    
<%@ include file="../plantillas/footer.jsp"%>