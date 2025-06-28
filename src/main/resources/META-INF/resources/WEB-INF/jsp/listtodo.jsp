<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<h2>Welcome to my Application ${name}</h2>
<body><div>Your Todos</div>
<table>
<thead><th>id</th>
<th>username</th>
<th>description</th>
<th>target date </th>
<th>isDone</th>
</thead>
<tbody>
<c:forEach items="${todos}" var="todo">
<tr>
<td>${todo.id }</td>
<td>${todo.username }</td>
<td>${todo.description }</td>
<td>${todo.targetdate }</td>
<td>${todo.done}</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>