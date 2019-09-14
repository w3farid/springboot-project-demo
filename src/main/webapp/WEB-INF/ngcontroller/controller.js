userapp.controller("userController", function($scope, $http){
    $scope.user = {
                company:'',
                username:'',
                email:'',
                firstName:'',
                lastName:'',
                city:'',
                country:'',
                postalCode:'',
                aboutMe:''
            };
    

    $scope.userSubmit = function(){
        const data = this.user;
        $http.post('/create-user', JSON.stringify(data))
        .then(function(res){
            console.log(res);
        }).catch(function(err){
            console.log(err);
        });
        
    }
});

categoryapp.controller("categoryController", function($scope, $http){
	$scope.category = {
			categoryName: '',
			categoryType: ''
	};
	
	$scope.saveCategory = function(){
		alert("welcome");
	}
});