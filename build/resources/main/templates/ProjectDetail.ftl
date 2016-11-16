<!DOCTYPE html>

<html lang="en">
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title> ResourceManagement </title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<#include "./styles/style.css">
<#include "./styles/main-style.css">
</head>

<body>
<div id = "wrapper">
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation" id="navbar">
     <!-- navbar-header -->
     	<div class="navbar-header"><span> Resource Management UI</span></div>
     	<div id = "welcomeMsg"><span> Welcome !!</span></div>
     <!-- end navbar-header -->           
     </nav>
     <div id = "page-wrapper">
     	<div class="row">
        <!--  page header -->
         	<div class="col-lg-12">
            	<h1 class="page-header">${record.projectNameNew}</h1>
            </div>
        <!-- end  page header -->
        </div>
        <div class="row">
        	<div class="col-lg-12">
            <!-- Advanced Tables -->
            	<div class="panel panel-default">
                	<div class="panel-heading">
                    ${record.projectCompanyNameNew}
                    </div>
                <div class="panel-body">
             	<div class="table-responsive">
				<table class="table table-striped table-bordered table-hover" id="dataTables-example">
				<thead>
					<tr>
						<th>Category</th>
						<th>Description</th>
						<th>Artifact</th>
						<th>Owner</th>
						<th>Status</th>
					</tr>
				</thead>
				<tbody>
					<#list record.userstories as userstory>
					<tr>
						<td>${userstory.userStoryCategory}</td>
						<td>${userstory.userStoryDescription}</td>
						<td>${userstory.userStoryArtifact}</td>
						<td>${userstory.userStoryOwner}</td>	
						<td>${userstory.userStoryStatus}</td>		
    				</tr>
    				</#list>
    			</tbody>    			
    		</table>
		</div>
	</div>
</div>
</div>
</div>
</div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>
