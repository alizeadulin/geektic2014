var app = angular.module("geektic", ['ngRoute']);

app.config(function($routeProvider){
	$routeProvider.when("/", {
		controller: 'MainCtrl',
		templateUrl: 'formulaireRecherche.html'
	}).when("/geek/:sexe/:interets", {
		templateUrl: 'resultatRecherche.html'
	})
	})

app.controller('MainCtrl', function($scope, $http) {
	}); 

/*app.controller('SrcCtrl', function($scope, $http) {
	$http.get('/geek/:sexe/:interets').success(function(getListSelectedGeek) {
	  $scope.geeks = getListSelectedGeek;
		
	}); */

/*var app = angular.module("geektic", ['ngRoute']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/geek').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});

app.controller('MainCtrl', function($scope, $http) {
	  $scope.users = [{name:'Aliz'},{name:'Alex'}];
	  $http.get('http://23.251.141.246/users').
	    success(function(data){ $scope.users = data; });
		
	}); */