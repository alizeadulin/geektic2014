var app = angular.module("geektic", ['ngRoute']);

app.config(function($routeProvider){
	$routeProvider.when("/", {
		templateUrl: 'formulaireRecherche.html'
	}).when("/geek/:sexe/:interets", {
		controller: 'SrcCtrl',
		templateUrl: 'resultatRecherche.html'
	})
	})
 
app.controller('SrcCtrl', function($scope, $http, $routeParams) {
	$http.get('/geek/'+ $routeParams.sexe +'/' + $routeParams.interets).success(function(getListSelectedGeek) {
	  $scope.geeks = getListSelectedGeek;
	}); 
}); 