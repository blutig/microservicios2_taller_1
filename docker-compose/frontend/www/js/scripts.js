var request = new XMLHttpRequest();

request.open('POST', 'http://localhost:8080/rest/course/list', true);
request.setRequestHeader("Content-Type", "application/json");
request.onload = function () {
	if (request.status >= 200 && request.status < 400) {
		var jsonResponse = JSON.parse(this.response);
		var data = jsonResponse.list;

		var initTable = "<table style='width:80%'><tr><th style='border: 1px solid;'>id</th><th style='border: 1px solid;'>nombre</th><th style='border: 1px solid;'>temas</th></tr>";
		var endTable = "</table>";
		
		var dataCourses = "";
		dataCourses += initTable;
		
		data.forEach(course => {
			var registro = "<tr><td style='border: 1px solid;'>" + course.id + "</td><td style='border: 1px solid;'>" + course.name + "</td><td style='border: 1px solid;'>" + course.themes +"</td></tr>";
			dataCourses += registro;
		});
		
		dataCourses += endTable;
		
		document.getElementById("datacourses").innerHTML = dataCourses;
		
	} else {
		alert('error');
	}
};

request.onerror = function () {
	document.getElementById("datacourses").innerHTML = "Error consultando información cursos";
};

request.send();
