<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>

<body>

<header>
  <h1><span class="logo">Ticket</span>Reservation</h1>
    <nav>
      <ul>
        <li><a href="urlToServlet?command=go_to_index_page">Главная</a></li>
        <li><a href="#">О нас</a></li>
        <li><a href="#">Услуги</a></li>
        <li><a href="#">Контакты</a></li>
     </ul>
            
      <div id="regAuth"><a href="urlToServlet?command=go_to_registration">Регистрация</a> | <a href="urlToServlet?command=go_to_authorization">Авторизация</a></div>
     </nav>
    
</header>

    <div id="article" class="article">
        <h2><c:out value="${requestScope.mainNews1.title}" /></h2>
        <p><c:out value="${requestScope.mainNews1.brief}" /></p>
        <a href=<c:out value="${requestScope.mainNews1.link}" />>Читать далее</a>
    </div>

    <div id="article" class="article">
        <h2><c:out value="${requestScope.mainNews2.title}" /></h2>
        <p><c:out value="${requestScope.mainNews2.brief}" /></p>
        <a href=<c:out value="${requestScope.mainNews2.link}" />>Читать далее</a>
    </div>
    
    <div id="article" class="article">
        <h2><c:out value="${requestScope.mainNews3.title}" /></h2>
        <p><c:out value="${requestScope.mainNews3.brief}" /></p>
        <a href=<c:out value="${requestScope.mainNews3.link}" />>Читать далее</a>
    </div>
		
<footer>

	<div id="social">

		<a href="http://vk.com" title="Группа VK" target="_blank"> <img
			src="img/vk.png" alt="VK" title="VK" />
		</a> <a href="http://facebook.com" title="Группа Facebook" target="_blank">
			<img src="img/facebook.png" alt="Facebook" title="Facebook" />
		</a> <a href="http://twitter.com" title="Группа Twitter" target="_blank">
			<img src="img/twitter.png" alt="Twitter" title="Twitter" />
		</a>

	</div>

	<div id="right">
		<p id="right">Copyright &copy; Your Website</p>
	</div>

	<script>
		document.getElementById('right').innerHTML = 'Все права защищены &copy; '
				+ new Date().getFullYear() + '';
	</script>

</footer>

</body>
</html>