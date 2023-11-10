<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>리뷰 작성</title>
</head>
<body>
    <h1>리뷰 작성</h1>
    <form action="writeReview" method="post">
        <label for="restaurant">맛집:</label>
        <select id="restaurant" name="restaurant">
            <option value="맛집 1">맛집 1</option>
            <option value="맛집 2">맛집 2</option>
            <option value="맛집 3">맛집 3</option>
        </select><br>
        <label for="review">리뷰:</label>
        <textarea id="review" name="review"></textarea><br>
        <input type="submit" value="작성하기">
    </form>
</body>
</html>
 