
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ include file="plantillas/header.jsp"%>

<main>
    <div class="welcome">
        <h2>Bienvenido a</h2>
        <h1>Interline Comunicaciones.</h1>
    </div>
    <div class="login-container">
        <div class="login">
            
                <h1 class="nameLogin">INICIO DE SESIÓN</h1>
                <form action="ControllerInline">
                    <div class="inputs">
                        <label for="inputUserName"><b>Nombre de usuario:</b></label><br><br>
                        <input type="text" id="inputUserName" name="inputUserName">
                    </div>

                    <div class="inputs">
                        <label for="inputPassword"><b>Contraseña:</b></label><br><br>
                        <input type="text" id="inputPassword" name="inputPassword">
                    </div>

                    <button name="enviar" value="main">INICIAR SESIÓN</button>
                </form>
        </div>
    </div>
</main>
</div>
    
<%@ include file="plantillas/footer.jsp"%>