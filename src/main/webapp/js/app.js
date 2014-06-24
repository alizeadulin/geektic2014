var app = angular.module("geektic", ['ngRoute']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/geek').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});

app.controller('MainCtrl', function($scope, $http) {
	  $scope.users = [{name:'Aliz'},{name:'Alex'}];
	  $http.get('http://23.251.141.246/users').
	    success(function(data){ $scope.users = data; });
		
	}); 