<!DOCTYPE html>

<html lang="en">
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="js/jquery-1.12.3.min.js"></script> 
    <script src="js/project-landing.js"></script> 
    
<title> Resource Management </title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<#include "./styles/style.css">
<#include "./styles/main-style.css">
</head>

<body>
<div id = "wrapper">
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation" id="navbar">
     <!-- navbar-header -->
     	<div class="navbar-header"><span>Modesto Status</span></div>
     	<div id="navbar-date"><span></span></div>
     	<div id="apptium-logo" class="" style="margin-left:10px">
                     <img id="apptiumlogo" src= "/images/apptium-logo.png"  style="height:50px">
         </div>
     <!-- end navbar-header -->           
     </nav>
     <#if record??>
     <div id = "page-wrapper">
     	<div class="row">
        <!--  page header -->
         	<div class="col-lg-12">
            	<h1 class="page-header">${record.projectName}</h1>
            </div>
        <!-- end  page header -->
        </div>
        <div class="row">
        	<div class="col-lg-12">
            <!-- Advanced Tables -->
            	<div class="panel panel-default">
                	<div class="panel-heading">
                    ${record.projectClientName}
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
				<#if record.userstories??>
				<tbody>
					<#list record.userstories as userstory>
					<#if userstory??>
					<tr>
						<td>${userstory.userStoryType?if_exists}</td>
						<td>${userstory.userStoryDescription?if_exists}</td>
						<td>${userstory.userStoryArtifact?if_exists}</td>
						<td>${userstory.userStoryOwner?if_exists}</td>	
						<td>${userstory.userStoryId?if_exists}</td>		
    				</tr>
    				</#if>
    				</#list>
    			</tbody>
    			</#if>    			
    		</table>
		</div>
	</div>
</div>
</div>
</div>
</div>
</#if>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>
