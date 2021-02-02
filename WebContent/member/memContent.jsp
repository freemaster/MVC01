<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="kr.smhrd.model.*"%>
<%@page import="java.util.*"%>

<%
//다운캐스팅을 통해서 받는다. (List<MemberVO>)request.getAttribute("list");
MemberVO vo = (MemberVO)request.getAttribute("vo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정(MVC01 : Model2 - forward )</title>
<style type="text/css">
tr {
	height: 50px;
}

th {
	border: 1px solid #000;
	text-align: right;
	padding-right: 30px;
	background:#a5dca5
}

td {
	padding: 10px;
	border: 1px solid #000;
}

table {
	border: 1px solid #000;
	width: 80%;
	font-size:12px;
}

input {
	height: 30px;
	line-height: 30px;
}

.btn {
	text-align: center;
}
</style>
<script type="text/javascript">
function memberList() {
	location.href="memList.do";
}
</script>
</head>
<body>
	<%
		if (vo != null) {
	%>
	<h4><%=vo.getMname()%>님의 상세보기(MVC01 : Model2 - forward )</h4>
	<form action='memUpdate.do' method='post'>
		<table border='1'>
			<colgroup>
				<col width="20%">
				<col width="*">
			</colgroup>
			<tr>
				<th>
					번호
					<input type='hidden' name='num' value='<%=vo.getNum()%>'>
				</th>
				<td><%=vo.getNum()%></td>
			</tr>
			<tr>
				<th>아이디</th>
				<td><%=vo.getId()%></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><%=vo.getPass()%></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><%=vo.getMname()%></td>
			</tr>
			<tr>
				<th>나이</th>
				<td>
					<input type='text' name='mage' value='<%=vo.getMage()%>'>
				</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>
					<input type='text' name='memail' value='<%=vo.getMemail()%>'>
				</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type='text' name='mtel' value='<%=vo.getMtel()%>'></td>
			</tr>
				<td colspan='2' class="btn">
					<input type='submit' value='수정'>
					&nbsp;&nbsp; 
					<input type='reset' value='취소'>
					&nbsp;&nbsp;
					<input type="button" onclick="memberList()" value="목록">
				</td>
			</tr>
		</table>
	</form>
	<%
		} else {
	%>
	<table border='1'>
		<tr>
			<td colspan='2'>정보가 없습니다.</td>
		</tr>
	</table>
	<%
		}
	%>
</body>
</html>