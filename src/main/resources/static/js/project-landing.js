$(document)
		.ready(
				function(e) {
					
					var d = new Date();
					document.getElementById("navbar-date").innerHTML = d.toDateString();
					
				});