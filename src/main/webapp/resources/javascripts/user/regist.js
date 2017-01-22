$(document).ready(function(){
	
	$(document).on('click', '.doRegist', function(){
		var isAgree = $('input:checkbox[id="agree"]').is(':checked');
		
		if(isAgree)
		{
			var data = {
				userId : $('input[name="userId"]').val(),
				userPassword : $('input[name="userPassword"]').val(),
				userEmail : $('input[name="userEmail"]').val()
			};
			
			var info = '<h5>아래 정보로 가입하시겠습니까?</h5>';
			info += '<table class="table table-striped">';
			info += '<tr><td>아이디</td><td>'+data.userId+'</td></tr>';
			info += '<tr><td>비밀번호</td><td>'+data.userPassword+'</td></tr>';
			info += '<tr><td>이메일</td><td>'+data.userEmail+'</td></tr>';
			info += '</table>';
			
			swal({
				title: '회원가입',
				html: info,
				showCancelButton: true,
				confirmButtonText: '가입',
				cancelButtonText: '취소',
				showLoaderOnConfirm: true,
				preConfirm : function() {
					return new Promise(function (resolve, reject){
						$.ajax({
							url : '/user/register', 
							type : 'post',
							data : data,
							dataType : 'json',
							success : function(response){
								resolve()
							},
							error : function() {
								reject()
							}
						});
					});
				}
			}).then(function(){
				swal('회원가입 완료','인증메일을 확인해주세요','success').then(function(){
					location.href='/login';
				});
			},function(){});
		}
		else
		{
			swal('','약관에 동의해주세요','info');
		}

	});
	
	
});