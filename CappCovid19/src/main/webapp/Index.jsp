<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">

<title>Covid19</title>
<link rel="icon" href="Imagenes/virus.ico">
<link rel="stylesheet" href="Styles/style_index.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
</head>
<body class="bg-white">
<div class="row">
            <div class="col-lg-12 bg-dark">
                <h1 align="center">
                    <font COLOR="white">Gobierno De El Salvador</font>

                </h1>
            </div>

        </div>
        <br>
        <br>
        <br>
        <h1 align="center">Consulta quien de tu familia es beneficiado<br>
         con el apoyo economico que esta ofreciendo el <br> Gobierno de El Salvador</h1>
        <br>
        <br>
        <br>
        <br>
	<form align="center" action="ControladorAcceso" method="post">
		<div class="border dark "></div>
		<input type="text" name="dui" placeholder="digite su numero de DUI">
		<button  value="consultar"> CONSULTAR </button>
		</div>
	</form>



</body>

</html>