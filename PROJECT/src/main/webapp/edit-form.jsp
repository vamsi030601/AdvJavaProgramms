<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Base64"%>

<html>
<head>
  <title> Edit products </title>    
   <link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">  
	<!-- This is java Script validation code Location -->
	<script src="product.js"></script>
	
</head>
    
<body>
<div class="container mt-5 text-center">
	<h2 class="text-center font-italic mb-1">EDIT PRODUCT DATA...</h2>
	<form method="post" action="./UpdateServlet"
	enctype="multipart/form-data" onsubmit="return validateform()">

<div class="form-group">
		<label class="font-italic font-weight-bold" for="proId">Product ID</label>
<input type="text" class="form-control-sm" id="proId" name="proId"  value="${existingproduct.proId}"  required>
</div>

<div class="form-group">
		<label class="font-italic font-weight-bold"
		for="proName">Product Name</label>
<input type="text" class="form-control-sm" id="proName" name="proName" value="${existingproduct.proName}" required>
</div>

<div class="form-group">
		<label class="font-italic font-weight-bold"
		for="proPrice">Product Price</label>
<input type="number" class="form-control-sm" id="proPrice" name="proPrice" value="${existingproduct.proPrice}" required>
</div>

     <div class="form-group">
		<label class="font-italic font-weight-bold"
		for="proBrand">Product Brand</label>
<input type="text" class="form-control-sm" id="proBrand" name="proBrand" value="${existingproduct.proBrand}" required>
</div>
		<div class="form-group">
		<label class="font-italic font-weight-bold"
		for="product MadeIN">Product madeIN</label>
     <input type="text" class="form-control-sm" id="proMadeIn" name="proMadeIn" value="${existingproduct.proMadeIn}" required>
</div>

<div class="form-group">
		<label class="font-italic font-weight-bold"
		for="MFG date">Product MFG Date</label>
      <input type="date" class="form-control-sm" id="proMfgDate" name="proMfgDate" value="${existingproduct.proMfgDate}" required>
</div>

<div class="form-group">
		<label class="font-italic font-weight-bold"
		for="EXP date">Product EXP Date</label>
    <input type="date" class="form-control-sm" id="proExpDate" name="proExpDate" value="${existingproduct.proExpDate}" required>
</div>

<!--Display Current  Image -->
	<div class="form-group">
    <label class="font-italic font-weight-bold" for="proImage"> Current Product Image:</label>
		<img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(existingproduct.proImage)}" alt="Current ProductImage" style="max-width:100px; max-height:100px;">

	   <input type="hidden"  id="existingImage" name="existingImage" value="${Base64.getEncoder().encodeToString(existingproduct.proImage)}">
	</div>
	
	<!--Display new  Image -->
	<div class="form-group">
    <label class="font-italic font-weight-bold" for="newproImage"> New Product Image:</label>
	    <input type="file" class="form-control-file-sm" id="newProImage" name="newproImage"  accept="image/*"   required>
	</div>
	
     <!--Display Current  Video -->
	<div class="form-group">
    <label class="font-italic font-weight-bold" for="proVideo"> Current Product Video:</label>
		<img src="data:video/mp4;base64,${Base64.getEncoder().encodeToString(existingproduct.proImage)}" alt="Current ProductVideo" style="max-width:100px; max-height:100px;">

	   <input type="hidden"  id="existingVideo" name="existingVideo" value="${Base64.getEncoder().encodeToString(existingproduct.proVideo)}">
	</div>
	
	<!--Display new  Video -->
	<div class="form-group">
    <label class="font-italic font-weight-bold" for="newproVideo"> New Product Video:</label>
	    <input type="file" class="form-control-file-sm" id="newProVideo" name="newproVideo"  accept="Video/*"   required>
	</div>
	
	 <!--Display Current  Audio -->
	<div class="form-group">
    <label class="font-italic font-weight-bold" for="proAudio"> Current Product Audio:</label>
		<img src="data:Audio/mp3;base64,${Base64.getEncoder().encodeToString(existingproduct.proAudio)}" alt="Current ProductAudio" style="max-width:100px; max-height:100px;">

	   <input type="hidden"  id="existingAudio" name="existingAudio" value="${Base64.getEncoder().encodeToString(existingproduct.proAudio)}">
	</div>
	
	<!--Display new  Audio -->
	<div class="form-group">
    <label class="font-italic font-weight-bold" for="newproAudio"> New Product Audio:</label>
	    <input type="file" class="form-control-file-sm" id="newProAudio" name="newproaudio"  accept="audio/*"   required>
	</div>
	
	

<div>
	<input type="submit" class="btn btn-success" value="save product/">
	<a href="productList.jsp" class="btn btn-primary">List of Product</a>
</div>
<div>
	<input type="submit" class="btn btn-success" value="save product/">
	<a href="productList.jsp" class="btn btn-primary">Edit form</a>
</div>
</form>
</div>
</body>
</html>