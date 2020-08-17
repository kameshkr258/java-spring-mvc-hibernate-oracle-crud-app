<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="text/javascript" src="https://platform.linkedin.com/badges/js/profile.js" async defer></script>
		<script type="text/javascript" src="https://github-profile.com/dist/gh-profile-card.min.js"></script>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
		<spring:url value="/resources/css/styles.css" var="css" />
		<link href="${css}" rel="stylesheet" />
	</head>
	<body id="aboutDev">
	
		<div class="container">
		
			<h1>Kamesh Rathore</h1>
			<hr>
			
			<h3>Full Stack Software Developer</h3>
			<h5>I have serious passion for Web Development, MERN Stack, Java EE, Database Design, System Architecture. </h5>
			<h5><a href= "https://www.upwork.com/o/profiles/users/~01032e46097ee1ce10/" >Lets make something special.</a></h5>
			
			<div class="row">
			  <div class="column">
			    <div class="content">
					<div class="LI-profile-badge"  data-version="v1" data-size="medium" data-locale="en_US" data-type="vertical" data-theme="light" data-vanity="kameshkr258"><a class="LI-simple-link" href='https://in.linkedin.com/in/kameshkr258?trk=profile-badge'>Kamesh Rathore</a></div>
			    </div> 
			  </div>
			  <div class="column">
			    <div class="content">
					<div id="github-card" data-username="kameshkr258"></div>
			    </div>
			  </div>
			</div>
		</div>
	</body>
	<jsp:include page="../fragments/footer.jsp" />
	
</html>
