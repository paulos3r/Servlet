<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<div class="panel panel-primary paninel-cadastro">
		<div class="panel-heading" align="center">cadastro</div>
		<div class="panel-body">

			<form method="post" action="ServletBootstrap">
				<div>
				
				
					<div class="form-group">
						<label for="nome">Nome completo</label> <input type="text"
							class="form-control" id="nome" name="nome" size="70" autofocus required>
					</div>
					<div class="form-group">
						<label for="login">Usuário</label> <input type="text"
							class="form-control" id="login" name="login" requisired>
					</div>
					<div class="form-group">
						<label for="senha2">Senha</label> <input type="password"
							class="form-control" id="senha1" name="senha1" requisired>
					</div>
					<div class="form-group">
						<label for="senha2">Repita a senha</label>
						<input type="password" class="form-control" id="senha2" name="senha2" requisired>
					</div>
				</div>

				<fieldset>
					</div>
					<input type="submit" class="btn btn-primary" value="Confirmar">
				</fieldset>			
			</form>
</body>
</html>