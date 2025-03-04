<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
<link rel="stylesheet" href="/resources/css/common/pay_modal.css">
</head>
<body>
<!-- ********************************모달 시작****************************** -->
<input class="inputMonthH" type="hidden">
<input class="sessionuserID" type="hidden" value="${sessionScope.user_id}">
<input class="amountValue" type="text">
<div class="popup">  <!-- 팝업처럼 하기 위한 배경 -->
	<div class="pwrap">  <!-- 실제 팝업창 -->
		<a class="closebtn">X</a> <!-- 비밀번호 변경창 닫기 버튼 -->
		<div>
			<h1>결제하기</h1><span>(1개월 결제 금액은 15000원 입니다.)</span>
		</div>
		<table>
			<tr>
				<td><a href="#" onclick="kakaopay()"><img src="/resources/img/user/iconKakao.svg"></a></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
		</table>
		<div>
			<h3 class="amount">결제 금액 : 0원</h3>
			<p>개월 수를 선택 해 주세요</p>
			<select onchange="monthSelect(this)">
				<option value="0">선택하기</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
				<option value="9">9</option>
				<option value="10">10</option>
				<option value="11">11</option>
				<option value="12">12</option>			
			</select>
		</div>		
	</div>
</div>
<!-- ****************************모달 끝 *******************************-->
<script src="/resources/js/common/pay_modal.js"></script>
<script src="/resources/js/api/kakao_payment.js"></script>
</body>
</html>