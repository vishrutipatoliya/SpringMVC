
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>upload image</title>
</head>
<body>

	<div class="container p-5">
		<h1>upload image</h1>
		<form action="uploadimage" method="post" enctype="multipart/form-data">
  <div class="form-group">
    <label for="exampleFormControlFile1">select your image</label>
    <input type="file" name="profile" class="form-control-file" id="exampleFormControlFile1">
  </div>
  <button class="btn btn-outline-success">upload</button>
</form  >
	</div>
	
</body>
</html>