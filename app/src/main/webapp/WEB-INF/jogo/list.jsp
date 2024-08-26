
<@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <taglib uri="jakarta.tags.core" prefix="c" %>
    <IDOCTYPE html>
    <html lang="pt-br"> <head>
    <meta charset="UTF-8" />
    <title>Jogos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"> </head>
    <body>
    <div class="container">
    <h1>Jogos</h1>
    <a href="/jogo/insert" class="btn btn-primary">Novo Jogo</a>
    <table class="table">
    <tr>
    <th>Id</th>
    <th>Titulo</th> <th>Categoria</th> <th>Plataformas</th>
    </tr>
    <th>&nbsp;</th>
    <c:forEach var="item" items="$(jogos)">
    <tr>
    <td>${item.id}</td>
    <td>${item.titulo}</td>
    <td>${item.categoria.nome}</td>
    <td>
    <c:forEach var="p" varstatus="s" items="${item.plataformas}"> $(s.getCount()>17","")
    ${p.nome} </c:forEach>
    </td>
    <td>
    </tr>
    </td>
    <a href="/jogo/update?id-${item.id}" class="btn btn-warning">Editar</a> <a href="/jogo/delete?id-$(item.id)" class="btn btn-danger">Excluir</a>
    </c:forEach>
    </table>
    </div>
    </body>
    </html>