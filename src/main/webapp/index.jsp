<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



    <h1>Calculadora</h1>
<form action="PrimeiroServelet"   method= "post">
    <p>valor 1 :  <input type="number" name="valor1"> </p>   
    <p>valor 2 : <input type="number" name= "valor2"> </p>   
            <button type="submit" name="mais"     class="btn btn-outline-primary">+</button>
            <button type="submit" name="menos"       class="btn btn-outline-primary">-</button>
           <button type="submit" name="vezes"    class="btn btn-outline-primary">*</button>
           <button type="submit" name="divizao"  class="btn btn-outline-primary">/</button>
          <p> <input type="reset" value= "Limpa" class= "btn btn-outline-primary"> <p/>
            
    Resultado = ${requestScope.resultado}
</form>



</body>
</html>