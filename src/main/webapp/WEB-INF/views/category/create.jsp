<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../header.jsp" />
<!-- End Navbar -->
<div class="content">
    <div class="container-fluid">
        <div class="row">
           <div class="col-md-8">
                <div class="card">
                    <div class="card-header card-header-primary">
                        <h4 class="card-title">Create Category</h4>                        
                    </div>
                    <div class="card-body">
                        <form ng-app="categoryapp" ng-controller="categoryController">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Category Name</label>
                                        <input type="text" class="form-control" ng-model="category.categoryName">
                                    </div>
                                </div>                                
                            </div>  
                            <div class="row">
                            	<div class="col-md-12">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Catogry Type</label>                                       
                                        <select class="form-control" ng-model="category.categoryType">
                                        	<option value="-1" selected="selected">Select Category</option>
                                        	<option value="Food">Food</option>
                                        	<option value="Drinks">Drinks</option>
                                        </select>
                                    </div>
                                </div>
                            </div>                          
                            <button class="btn btn-primary pull-right" ng-click="saveCategory()">Save</button>
                            <div class="clearfix">{{category.categoryName}}</div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../footer.jsp" />