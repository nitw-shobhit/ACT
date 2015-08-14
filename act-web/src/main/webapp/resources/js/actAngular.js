/**
 * Angular file
 */
var module = angular.module('act-app', ['ui.router', 'ngDialog', 'pascalprecht.translate', 'ui.bootstrap', 'angular-table']);

//STATE ROUTES
module.config(function ($stateProvider, $urlRouterProvider, $provide) {
	$stateProvider.state('dboard',
		{
			url: "",
			views: {
				'menu' : {
					templateUrl : '../resources/pages/dashboard/menu.jsp',
					controller : 'menuController'
				},
				'content' : {
					templateUrl : '../resources/pages/home.jsp',
						controller : 'homeController'
				}
			}
		}
	)
	.state('dboard.server',
		{
			url: "",
			views: {
				'content@' : {
					templateUrl : '../resources/pages/servers.jsp',
					controller : 'serverController'
				}
			}
		}
  	)
  	.state('dboard.database',
		{
			url: "",
			views: {
				'content@' : {
					templateUrl : '../resources/pages/databases.jsp',
					controller : 'databaseController'
				}
			}
		}
  	)
  	.state('dboard.worklist',
		{
			url: "",
			views: {
				'content@' : {
					templateUrl : '../resources/pages/worklist.jsp',
					controller : 'worklistController'
				}
			}
		}
  	)
  	.state('dboard.settings',
		{
			url: "",
			views: {
				'content@' : {
					templateUrl : '../resources/pages/settings.jsp'
				}
			}
		}
  	)
	.state('dboard.help',
		{
			url: "",
			views: {
				'content@' : {
					templateUrl : '../resources/pages/help.jsp'
				}
			}
		}
  	);
	$urlRouterProvider.otherwise("");
});

//DIRECTIVES



//CONTROLLERS
module.controller("userInfoController", function ($scope, $state, ngDialog) {

	$scope.logout = function() {
		window.location.href="/act-web/login.jsp";
	};
	
	$scope.openProfileBox = function(id,name,type,phone,email,groupid) {
		$scope.userBean = {
			"userId": id,
			"userName": name,
			"userType": type,
			"userPhone": phone,
			"userEmail": email
		};
		ngDialog.open({
			template: 'userProfile',
			data: $scope.userBean,
			className: 'ngdialog-theme-default profileBox',
			controller: 'userInfoController',
			preCloseCallback: function(value) {
				return true;
			}
		});
	}
});

module.controller("menuController", function ($scope, $state) {
	$scope.home = function() {
        $state.go('dboard');
	};
	$scope.server = function() {
        $state.go('dboard.server');
	};
	$scope.database = function() {
        $state.go('dboard.database');
	};
	$scope.worklist = function() {
        $state.go('dboard.worklist');
	};
});

module.controller("homeController", function ($scope, $state) {
});

module.controller("serverController", function ($scope, $state) {
	
	$.ajax({
        url: '/act-web/actServer/getAllWebServers.do',
        type: 'GET',
        dataType: 'json',
        async: false,
        success: function(data) {
            $scope.webServerList = data;
        }
    }).fail(function() {
    	$scope.loading = false;
    });
	
	$scope.addWebServer = function(serverBean) {
		
	};
	
	$scope.startWebServer = function(webServerBean) {
		$.ajax({
	        url: '/act-web/actServer/startWebServer.do?webServerBean='+JSON.stringify(webServerBean),
	        type: 'POST',
	        dataType: 'json',
	        async: false,
	        success: function(data) {
	        }
	    }).fail(function() {
	    	$scope.loading = false;
	    });
	};
	
	$scope.stopWebServer = function(serverBean) {
	};
	
	$scope.configureWebServer = function(serverBean) {
	};
	
	$scope.trackChangesWebServer = function(serverBean) {
	};
	
	$scope.logsWebServer = function(serverBean) {
	};
	
	$scope.deleteWebServer = function(serverBean) {
	};
});

module.controller("databaseController", function ($scope, $state) {

	$.ajax({
	    url: '/act-web/actDb/getAllDbServers.do',
	    type: 'GET',
	    dataType: 'json',
	    async: false,
	    success: function(data) {
	        $scope.dbServerList = data;
	    }
	}).fail(function() {
		$scope.loading = false;
	});
	
	$scope.startDbServer = function(dbServerBean) {
		$.ajax({
	        url: '/act-web/actDb/startDbServer.do?dbServerBean='+JSON.stringify(dbServerBean),
	        type: 'POST',
	        dataType: 'json',
	        async: false,
	        success: function(data) {
	        }
	    }).fail(function() {
	    	$scope.loading = false;
	    });
	};
	
	$scope.stopDbServer = function(dbServerBean) {
		$.ajax({
	        url: '/act-web/actDb/stopDbServer.do?dbServerBean='+JSON.stringify(dbServerBean),
	        type: 'POST',
	        dataType: 'json',
	        async: false,
	        success: function(data) {
	        }
	    }).fail(function() {
	    	$scope.loading = false;
	    });
	};
});

module.controller("worklistController", function ($scope, $state) {

	$.ajax({
	    url: '/act-web/actWorklist/getWorklist.do',
	    type: 'GET',
	    dataType: 'json',
	    async: false,
	    success: function(data) {
	        $scope.worklist = data;
	        $scope.config = {
	    	    itemsPerPage: 10,
	    	    fillLastPage: true
            }
	    }
	}).fail(function() {
		$scope.loading = false;
	});
});
	  