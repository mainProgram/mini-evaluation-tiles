<%--
  Created by IntelliJ IDEA.
  User: fazeyna
  Date: 26/10/2024
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
    <head>
        <title>Cours</title>
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm-6">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Ajout d'un cours</h5>
                            <form action="cours" method="post">
                                <div class="mb-3">
                                    <label for="inputMat" class="form-label">Matière</label>
                                    <input type="text" name="matiere" class="form-control" id="inputMat">
                                </div>
                                <div class="mb-3">
                                    <label for="inputProf" class="form-label">Professeur</label>
                                    <input type="text" name="professeur" class="form-control" id="inputProf">
                                </div>
                                <div class="mb-3">
                                    <label for="inputClasse" class="form-label">Classe</label>
                                    <input type="text" name="classe" class="form-control" id="inputClasse">
                                </div>
                                <button type="submit" class="btn btn-primary">Ajouter</button>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Liste des cours</h5>
                            <table class="table table-striped table-hover">
                                <thead>
                                <tr>
                                    <th>Matière</th>
                                    <th>Professeur</th>
                                    <th>Classe</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${coursList}" var="cours">
                                    <tr>
                                        <td>${cours.matiere}</td>
                                        <td>${cours.professeur}</td>
                                        <td>${cours.classe}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
