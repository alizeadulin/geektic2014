var app = angular.module("geektic", [ 'ngRoute' ]);

app.config(function($routeProvider) {
	$routeProvider.when("/", {
		templateUrl : 'formulaireRecherche.html'
	}).when("/geek/:sexe/:interets", {
		controller : 'SrcCtrl',
		templateUrl : 'resultatRecherche.html'
	}).when("/geek/:id", {
		controller : 'ProfilCtrl',
		templateUrl : 'profilGeek.html'
	})
})

app.controller('SrcCtrl', function($scope, $http, $routeParams) {
	$http.get('/geek/' + $routeParams.sexe + '/' + $routeParams.interets)
			.success(function(getListSelectedGeek) {
				$scope.geeks = getListSelectedGeek;
			});
});

app.controller('ProfilCtrl', function($scope, $http, $routeParams) {
	$http.get('/geek/' + $routeParams.id).success(function(getGeekByID) {
				$scope.geek = getGeekByID;
			});
});