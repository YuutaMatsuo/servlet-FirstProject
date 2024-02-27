<%-- ディレクティブタグの使用 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--  宣言タグを使ってメソッドを定義してみる  -->
<%!
	String fortune(){
		String fortuneResult;
		double ranNum = Math.random(); //0.0～0.9の乱数生成
		if(ranNum >= 0.7){
			fortuneResult = "大吉";
		} else if(ranNum >= 0.4){
			fortuneResult = "中吉";
		} else if(ranNum >= 0.1){
			fortuneResult = "小吉";
		} else {
			fortuneResult = "凶";
		}
		return fortuneResult;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>占いJSP</title>
</head>
<body>
	<h1>JSPで運勢判断！</h1>
	あなたの今日と明日の運勢は・・・！？
	<br>
	<%-- スクリプトレットの使用 --%>
	<% for(int i = 0 ; i < 2; i++){ %>
	<%-- script式タグの使用 --%>
	<%= fortune() %><br>
	<% }; %>

</body>
</html>