<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Insert title here</title>

</head>
<body>
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h3 class=" text-center">Form</h3>
						<div class="alert alert-danger" role="alert">
							<form:errors path="student.*" />
						</div>
						<form action="handleform" method="post">
							<div class="form-group">
								<label for="exampleFormControlInput1">your name</label> <input
									type="text" class="form-control" id="exampleFormControlInput1"
									placeholder="enter name" name="name">
							</div>
							<div class="form-group">
								<label for="exampleFormControlInput1">your id</label> <input
									type="text" class="form-control" id="exampleFormControlInput1"
									placeholder="enter id" name="id">
							</div>
							<div class="form-group">
								<label for="exampleFormControlInput1">your DOB</label> <input
									type="text" class="form-control" id="exampleFormControlInput1"
									placeholder="dd/mm/yyyy" name="date">
							</div>
							<div class="form-group">
								<label for="exampleFormControlSelect1">Course</label> <select
									class="form-control" name="subjects"
									id="exampleFormControlSelect1">
									<option>java</option>
									<option>python</option>
									<option>C++</option>
									<option>spring</option>

								</select>
							</div>
							<div class="form-group">
								<label for="">select type</label> <select class="form-control"
									name="type" id="exampleFormControlSelect1">
									<option>old student</option>
									<option>normal student</option>


								</select>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="gender"
									id="exampleRadios1" value="male" checked> <label
									class="form-check-label" for="exampleRadios1"> Male </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="gender"
									id="exampleRadios2" value="female"> <label
									class="form-check-label" for="exampleRadios2"> Female </label>
							</div>

							<div class="card">
								<div class="card-body">
									<p>Address</p>

									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="enter city" name="address.city">
									</div>

									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="enter state" name="address.state">
									</div>


								</div>
							</div>

							<div class="container text-center">
								<button type="submit" class="btn btn-primary">submit</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>