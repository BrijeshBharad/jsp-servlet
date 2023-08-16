<html>
	<head>
		<title>Insert title here</title>
			<script>
			function validateForm() {
			var firstName = document.myform.first_name.value;
			var lastName = document.myform.last_name.value;
			var userName = document.myform.user_name.value;
			var password = document.myform.user_password.value;
			var gender = document.myform.gender.value;
			var address = document.myform.first_address.value;
			var contactNo = document.myform.contact_no.value;
	
			if (firstName === ""){
				alert("Firstname must be filled out");
				return false;
			}
			if (lastName === ""){
				alert("Lastname must be filled out");
				return false;
			}
			if (userName === ""){
				alert("Username must be filled out");
				return false;
			}
			if (password === ""){
				alert("Password must be filled out");
				return false;
			}
			if (gender === ""){
				alert("Gender must be filled out");
				return false;
			}
			if (address === ""){
				alert("Address must be filled out");
				return false;
			}
			if (contactNo === ""){
				alert("Number must be filled out");
				return false;
			}
			}
			</script>
	</head>
<body>

	<div class="form-center">
		<h1 style="margin-left: 35%">Employee Registration Form</h1>
		<form name="myform" onsubmit="return validate()"
			action="EmployeeRegistration" method="post"
			style="margin: auto; margin-top: 50px; width: 420px; border: solid; padding-left: 20px; padding-top: 20px; padding-bottom: 20px">
			Enter First Name:
			<input type="text" name="first_name" pattern="[^0-9]*"
				title="Numbers are not allowed in this field">
			<br>
			<br>
			Enter last Name:
			<input type="text" name="last_name" pattern="[^0-9]*"
				title="Numbers are not allowed in this field">
			<br>
			<br>
			Enter user Name:
			<input type="text" name="user_name">
			<br>
			<br>
			Enter your Password:
			<input type="password" name="user_password" minlength="8"
				maxlength="12">
			<br>
			<br>
			Select your Gender: Male
			<input type="radio" name="gender" value="true">
			Female
			<input type="radio" name="gender" value="false">
			<br>
			<br>
			Enter Address:
			<input type="text" name="first_address">
			<br>
			<br>
			Enter Address2:
			<input type="text" name="second_address2">
			<br>
			<br>
			Enter Contact No:
			<input type="tel" name="contact_no" minlength="10" maxlength="10"
					pattern="[1-9]{1}[0-9]{9}"  title=" Contact number must beof 10 digits">
			<br>
			<br>
			<input type="submit" value="Enter" onclick="return validateForm()">
		</form>
	</div>
</body>
</html>